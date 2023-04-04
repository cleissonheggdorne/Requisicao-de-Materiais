package br.com.requisicaodemateriais.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.AcessControl;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.repositories.AccessControlRepository;

@Service
public class AccessControlService {
	
	final AccessControlRepository accessControlRepository;
	
	public AccessControlService(AccessControlRepository accessControlRepository) {
		this.accessControlRepository = accessControlRepository;
	}
	
	public Optional<AcessControl> verifyAccess(User user) {
		return accessControlRepository.verifyAccess(user.getCompany().getCodigoEmp(),
				"001",
				user.getSystem().getCodigoSis(), user.getUserId().getCodigoUser());
	}

}