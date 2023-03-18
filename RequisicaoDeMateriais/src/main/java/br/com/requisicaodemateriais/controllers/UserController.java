package br.com.requisicaodemateriais.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.requisicaodemateriais.services.UserService;

@RestController
@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
@RequestMapping("/api/")
public class UserController {
	
	final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
}
