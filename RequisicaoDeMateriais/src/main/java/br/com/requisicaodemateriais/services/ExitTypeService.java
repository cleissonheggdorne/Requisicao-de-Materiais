package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.ExitType;
import br.com.requisicaodemateriais.entities.compositekeys.ExitTypeId;
import br.com.requisicaodemateriais.repositories.ExitTypeRepository;

@Service
public class ExitTypeService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final ExitTypeRepository exitTypeRepository;
	final BranchService branchService;
	
	public ExitTypeService(ExitTypeRepository exitTypeRepository, BranchService branchService) {
		this.exitTypeRepository = exitTypeRepository;
		this.branchService = branchService;
	}
	
	public Optional<ExitType> findExitType(String codigoFicha){
		Optional<Branch> branch = Branch.createBranch("001", branchService);

		ExitTypeId exitTypeId = new ExitTypeId("001", branch.get().getId().getCodigoFil(), codigoFicha);
		return exitTypeRepository.findById(exitTypeId);
	}
}
