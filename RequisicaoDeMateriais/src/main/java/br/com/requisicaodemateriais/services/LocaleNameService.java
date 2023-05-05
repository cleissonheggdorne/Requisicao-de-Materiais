package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Location;
import br.com.requisicaodemateriais.entities.compositekeys.LocationId;
import br.com.requisicaodemateriais.repositories.LocaleNameRepository;

@Service
public class LocaleNameService implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final LocaleNameRepository localeNameRepository;
	
	public LocaleNameService(LocaleNameRepository localeNameRepository) {
		this.localeNameRepository = localeNameRepository;
	}
	
	public Optional<Location> findLocaleName(String codigoLocal){
		LocationId localeNameId = new LocationId("001", codigoLocal);
		return localeNameRepository.findById(localeNameId);
	}
	
}
