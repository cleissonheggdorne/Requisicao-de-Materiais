package br.com.requisicaodemateriais.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.requisicaodemateriais.dtos.ExitNoteDTO;
import br.com.requisicaodemateriais.entities.ExitNote;
import br.com.requisicaodemateriais.services.ClassServiceException;
import br.com.requisicaodemateriais.services.ExitNoteService;
import br.com.requisicaodemateriais.services.UserService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
@RequestMapping("/api")
public class ExitNoteController {
	
	final ExitNoteService exitNoteService;
	final UserService userService;
	
	public ExitNoteController(ExitNoteService exitNoteService, UserService userService) {
		this.exitNoteService = exitNoteService;
		this.userService = userService;
	}
	
	@GetMapping("/tela1")
    public String index() {
		return null;
    }
	
	@PostMapping("/saveexitnote")
    public ResponseEntity<?> salvarPessoa(@RequestBody @Valid ExitNoteDTO exitNoteDto, BindingResult br) throws ClassServiceException {
		if(br.hasErrors()) {
			return ResponseEntity.badRequest().body(br.getAllErrors());
		}
		ExitNote exitNoteSave = exitNoteService.save(exitNoteDto);
        return ResponseEntity.ok(exitNoteSave);
    }
}
