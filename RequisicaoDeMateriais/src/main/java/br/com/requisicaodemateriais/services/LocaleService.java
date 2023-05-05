package br.com.requisicaodemateriais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.LocationIdentity;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.projections.LocaleProjection;
import br.com.requisicaodemateriais.repositories.LocaleRepository;

@Service
public class LocaleService {
	
	
	final LocaleRepository localRepository;
	
	public LocaleService(LocaleRepository localRepository) {
		this.localRepository = localRepository;
	}
	
	public Optional<LocationIdentity> verifyPermissionPedidoCompras(User user) throws ClassServiceException {
		return localRepository.searchLocale("001",
				                     "001",
				                     user.getPessoa().getCodigoG());
	}
	
	public List<LocaleProjection> findByGeneral_GeneralIdCodigoG(String codigoG){
		return localRepository.findByCodigoG_IdCodigoGAndRequisicaoSN(codigoG, "S");
	}
	 
}
