package br.com.firstspringproject.FirstSpringProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.firstspringproject.FirstSpringProject.entities.User;
import br.com.firstspringproject.FirstSpringProject.repositories.UserRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
	
	@Autowired
	private UserRepository userRepository;
	
    //Tipo específico do Spring para retorno de respostas de requisições web
  	@GetMapping("/users")    //Requisição do tipo GET
  	public ResponseEntity<List<User>> findAll(){
  		return ResponseEntity.ok().body(userRepository.findAll());
  	}
    
    @GetMapping("/login")    //Requisição do tipo GET
  	public String login(){
  		return "login";
    }
  	
  	
}
