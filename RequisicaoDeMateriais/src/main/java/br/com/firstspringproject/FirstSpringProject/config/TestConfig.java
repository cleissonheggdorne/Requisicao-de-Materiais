package br.com.firstspringproject.FirstSpringProject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.firstspringproject.FirstSpringProject.entities.User;
import br.com.firstspringproject.FirstSpringProject.repositories.UserRepository;

@Configuration
@Profile("test")        // Interface para a execução da classe, quando a aplicação for iniciada
public class TestConfig implements CommandLineRunner {
	@Autowired(required=true)
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("001", "0000001", "cleisso.heggdorne", "A");
		User u2 = new User("002", "0000001", "cleisson.heggdorne", "A");

		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
