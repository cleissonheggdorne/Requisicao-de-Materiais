package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.GgSystem;
import br.com.requisicaodemateriais.repositories.SystemRepository;

@Service
public class SystemService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final SystemRepository systemRepository;
	
	public SystemService(SystemRepository systemRepository) {
		this.systemRepository = systemRepository;
	}
	
	public Optional<GgSystem> findSystem(String codigoSis){
		return systemRepository.findById(codigoSis);
	}
}
