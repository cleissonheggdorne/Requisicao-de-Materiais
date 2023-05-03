package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Company;
import br.com.requisicaodemateriais.repositories.CompanyRepository;

@Service
public class CompanyService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final CompanyRepository companyRepository;
	
	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}
	
	public Optional<Company> findCompany(String codigoCompany){
		return companyRepository.findById(codigoCompany);
	}
}
