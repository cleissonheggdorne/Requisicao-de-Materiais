package br.com.requisicaodemateriais.services;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.repositories.UserRepository;

@Service
public class UserService {
	
	
	final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public User login(String userName, String password) throws ClassServiceException {
		User userLogin = userRepository.searchLogin(userName, password);
		return userLogin;
	}
//	public User verifyPermissionPedidoCompras(User userLogin) {
//		User user = userRepository.verifyPermissionPedidoCompras(userLogin);
//		return user;
//	}
	
}
