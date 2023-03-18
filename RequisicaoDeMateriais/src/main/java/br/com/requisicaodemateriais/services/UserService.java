package br.com.requisicaodemateriais.services;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.repositories.UserRepository;

@Service
public class UserService {
	
	
	final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
