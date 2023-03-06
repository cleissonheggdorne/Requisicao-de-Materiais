package br.com.firstspringproject.FirstSpringProject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.firstspringproject.FirstSpringProject.entities.User;

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
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    
    //Tipo específico do Spring para retorno de respostas de requisições web
    @RequestMapping(value= "/users")  
  	@GetMapping    //Requisição do tipo GET
  	public ResponseEntity<User> findAll(){
  		User u = new User("001","001", "0000001","cleisson.heggdorne", "A", "","","");
  		return ResponseEntity.ok().body(u);
  	}
}
