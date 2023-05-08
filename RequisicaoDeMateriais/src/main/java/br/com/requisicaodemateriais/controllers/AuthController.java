package br.com.requisicaodemateriais.controllers;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.requisicaodemateriais.dtos.UserDTO;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.projections.AccessControlProjection;
import br.com.requisicaodemateriais.entities.projections.LocaleProjection;
import br.com.requisicaodemateriais.entities.projections.UserProjection;
import br.com.requisicaodemateriais.services.AccessControlService;
import br.com.requisicaodemateriais.services.ClassServiceException;
import br.com.requisicaodemateriais.services.LocaleService;
import br.com.requisicaodemateriais.services.UserService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
@RequestMapping("/api")
public class AuthController {
	
	final UserService userService;
	final LocaleService localeService;
	final AccessControlService accessControlService;

	protected String msg;
	Optional<UserProjection> userLogged;
	Map<String, Object> userLoggedMap = new HashMap<>();
	
	public AuthController(UserService userService, LocaleService localeService, AccessControlService accessControlService) {
		this.userService = userService;
		this.localeService = localeService;
		this.accessControlService = accessControlService;
	}
	
	@GetMapping("/index")
    public ResponseEntity<?> index() {
		if(this.userLogged != null) {
			//session.setAttribute("userLogged", userLoggedMap);
			//return "index";
			return ResponseEntity.ok().body(userLoggedMap);

		}else {	
			//return "redirect:/api/login";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		} 	

    }
	
	@GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "login";
    }
	
	@Transactional
	@PostMapping("/login")
	public ResponseEntity<?>userAccess(@Valid UserDTO userDto, BindingResult br, Model model) throws NoSuchAlgorithmException, ClassServiceException{
		model.addAttribute("user", new User());
				
		//Verifica se dados foram digitados conforme validação userDto
		if(br.hasErrors()) {
			return null;
		}
		
		Optional<UserProjection> userProjection = userService.login(userDto.getUserName(),userDto.getSenha());
		if(!userProjection.isPresent()) {
			return ResponseEntity.badRequest().body("Usuário Não Encontrado");
		}else {
			List<LocaleProjection> localesProjection =  localeService.findByGeneral_GeneralIdCodigoG(userProjection.get().getPessoaIdCodigoG());		
			if(localesProjection != null) {
				List<AccessControlProjection> accessControlList = accessControlService.findByUser_UserIdCodigoUserAndAcessControlIdNomeMenu(userProjection.get().getIdCodigoUser());
				if(accessControlList != null) {
					userLogged = userProjection;
					userLoggedMap.put("user", userProjection.get());
					userLoggedMap.put("locales", localesProjection);
					userLoggedMap.put("warehouse", accessControlList);
					return ResponseEntity.ok().body(userLoggedMap);
				}else {
					return ResponseEntity.badRequest().body("Este Usuário Não Possui Permissão de Requisição");
				}
			}else {
				return ResponseEntity.badRequest().body("Não há vínculo com local");
			}
		}	
	}
}
