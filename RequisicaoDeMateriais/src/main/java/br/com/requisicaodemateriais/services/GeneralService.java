package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.General;
import br.com.requisicaodemateriais.entities.compositekeys.GeneralId;
import br.com.requisicaodemateriais.repositories.GeneralRepository;

@Service
public class GeneralService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final GeneralRepository generalRepository;
	
	public GeneralService(GeneralRepository generalRepository) {
		this.generalRepository = generalRepository;
	}
	
	public Optional<General> findGeneral(String codigoG){
		GeneralId generalId = new GeneralId("001", codigoG);
		return generalRepository.findById(generalId);
	}
}
