package br.com.requisicaodemateriais.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;



@Configuration
@Profile("test")        // Interface para a execução da classe, quando a aplicação for iniciada
public class TestConfig implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {

	}



}
