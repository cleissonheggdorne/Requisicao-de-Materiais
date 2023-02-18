package br.com.firstspringproject.FirstSpringProject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.firstspringproject.FirstSpringProject.entities.User;

public class UserResource {
	@GetMapping    //Requisição do tipo GET
  	public ResponseEntity<User> findAll(){
  		User u = new User("001", "0000001","cleisson.heggdorne", "A");
  		return ResponseEntity.ok().body(u);
  	}
}
