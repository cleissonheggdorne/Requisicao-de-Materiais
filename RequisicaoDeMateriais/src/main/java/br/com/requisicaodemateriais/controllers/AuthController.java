package br.com.requisicaodemateriais.controllers;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.requisicaodemateriais.dtos.UserDto;
import br.com.requisicaodemateriais.entities.AcessControl;
import br.com.requisicaodemateriais.entities.Locale;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.services.AccessControlService;
import br.com.requisicaodemateriais.services.ClassServiceException;
import br.com.requisicaodemateriais.services.LocaleService;
import br.com.requisicaodemateriais.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
@RequestMapping("/api")
public class AuthController {
	
	final UserService userService;
	final LocaleService localeService;
	final AccessControlService accessControlService;
	Optional<User> userLogged;
	
	public AuthController(UserService userService, LocaleService localeService, AccessControlService accessControlService) {
		this.userService = userService;
		this.localeService = localeService;
		this.accessControlService = accessControlService;
	}
	
	@GetMapping("/index")
    public String index(HttpSession session) {
		if(userLogged == null) {
			return "redirect:/api/login";
		}else {	
			session.setAttribute("userLogged", userLogged.get());
			return "index";
		}
    }
	
	@GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "login";
    }
	
	@PostMapping("/login")
	public String userAccess(@Valid UserDto userDto, BindingResult br, Model model) throws NoSuchAlgorithmException, ClassServiceException{
		model.addAttribute("user", new User());
				
		//Verifica se dados foram digitados conforme validação userDto
		if(br.hasErrors()) {
			model.addAttribute("msg", "Preencha as credenciais para prosseguir!");
			return("login");
		}
		
		Optional<User> user = userService.login(userDto.getUserName(),userDto.getSenha());
		
		if(user == null) {
			model.addAttribute("msg", "Usuário Não Encontrado");
		}else {
			for(Locale loc : user.get().getPessoa().getLocales()) {
				if(loc.getRequisicaoSN().contains("S")) {
					Optional<AcessControl> accessControl = accessControlService.verifyAccess(user.get());
					if(accessControl.isPresent()) {
						userLogged = user;
						return "redirect:/api/index";
					}else {
						model.addAttribute("msg", "Este Usuário Não Possui Permissão de Requisição");
					}
				}else {
					model.addAttribute("msg", "Não há vínculo com local");
				}
			}	
		}
		return "login";
	}
	
}
