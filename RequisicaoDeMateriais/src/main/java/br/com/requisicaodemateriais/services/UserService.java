package br.com.requisicaodemateriais.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.repositories.UserRepository;

@Service
public class UserService {
	
	
	final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Optional<User> login(String userName, String password) throws ClassServiceException {
		return userRepository.searchLogin(userName, password);
	}
	
}
