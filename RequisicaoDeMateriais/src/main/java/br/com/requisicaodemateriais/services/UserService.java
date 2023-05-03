package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.GgSystem;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.compositekeys.UserId;
import br.com.requisicaodemateriais.entities.projections.UserProjection;
import br.com.requisicaodemateriais.repositories.UserRepository;

@Service
public class UserService implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final UserRepository userRepository;
	final SystemService systemService;
	
	public UserService(UserRepository userRepository, SystemService systemService) {
		this.userRepository = userRepository;
		this.systemService = systemService;
	}
	
	public Optional<UserProjection> login(String userName, String password) throws ClassServiceException {
		return userRepository.findByUserNameAndSenhaAndIdCodigoSis(userName, password, "06");
	}
	
	public Optional<User> findUser(String codigoUser){
		Optional<GgSystem> system = GgSystem.createSystem("06", systemService);
		UserId userId = new UserId(system.get().getCodigoSis(), codigoUser);
		return userRepository.findById(userId);
	}
	
}
