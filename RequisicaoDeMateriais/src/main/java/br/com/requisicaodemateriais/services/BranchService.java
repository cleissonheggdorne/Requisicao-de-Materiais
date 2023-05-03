package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.Company;
import br.com.requisicaodemateriais.entities.compositekeys.BranchId;
import br.com.requisicaodemateriais.repositories.BranchRepository;

@Service
public class BranchService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final BranchRepository branchRepository;
	final CompanyService companyService;
	
	public BranchService(BranchRepository branchRepository, CompanyService companyService) {
		this.branchRepository = branchRepository;
		this.companyService = companyService;
	}
	
	public Optional<Branch> findBranch(String codigoFil){
		Optional<Company> company = Company.createCompany("001", companyService);
		BranchId branchId = new BranchId(company.get().getCodigoEmp(), "001");
		return branchRepository.findById(branchId);
	}
}
