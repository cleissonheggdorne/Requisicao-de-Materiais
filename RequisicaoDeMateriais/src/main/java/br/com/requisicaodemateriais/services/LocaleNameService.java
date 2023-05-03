package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.LocaleName;
import br.com.requisicaodemateriais.entities.compositekeys.LocaleNameId;
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
	
	public Optional<LocaleName> findLocaleName(String codigoLocal){
		LocaleNameId localeNameId = new LocaleNameId("001", codigoLocal);
		return localeNameRepository.findById(localeNameId);
	}
	
}
