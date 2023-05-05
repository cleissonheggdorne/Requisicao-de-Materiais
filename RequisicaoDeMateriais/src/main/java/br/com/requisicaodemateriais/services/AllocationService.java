package br.com.requisicaodemateriais.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Sheet;
import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.compositekeys.SheetId;
import br.com.requisicaodemateriais.repositories.AllocationRepository;

@Service
public class AllocationService {

	final AllocationRepository allocationRepository;
	final BranchService branchService;
	
	public AllocationService(AllocationRepository allocationRepository, BranchService branchService) {
		this.allocationRepository = allocationRepository;
		this.branchService = branchService;
	}
	
	public Optional<Sheet> findAllocation(String codigoFicha){
		Optional<Branch> branch = Branch.createBranch("001", branchService);
		
		SheetId allocationId = new SheetId("001", branch.get().getId().getCodigoFil(), codigoFicha);
		return allocationRepository.findById(allocationId);
	}
}
