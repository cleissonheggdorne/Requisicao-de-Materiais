package br.com.requisicaodemateriais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.AcessControl;
import br.com.requisicaodemateriais.entities.projections.UserProjection;
import br.com.requisicaodemateriais.repositories.AccessControlRepository;

@Service
public class AccessControlService {
	
	final AccessControlRepository accessControlRepository;
	
	public AccessControlService(AccessControlRepository accessControlRepository) {
		this.accessControlRepository = accessControlRepository;
	}
	
//	public Optional<AcessControl> verifyAccess(UserProjection user) {
//		return accessControlRepository.verifyAccess(user.getCompanyCodigoEmp(),
//				"001",
//				user.getSystem().getCodigoSis(), user.getUserId().getCodigoUser());
//	}
	
	public List<AcessControl> findByUser_UserIdCodigoUserAndAcessControlIdNomeMenu(String codigoUser){
		return accessControlRepository.findByUser_UserIdCodigoUserAndAcessControlIdNomeMenu(codigoUser, "Requisição de Material");
	}

}
