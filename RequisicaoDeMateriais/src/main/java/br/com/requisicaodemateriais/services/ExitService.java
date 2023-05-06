package br.com.requisicaodemateriais.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import br.com.requisicaodemateriais.entities.projections.ExitProjection;
import br.com.requisicaodemateriais.repositories.ExitRepository;

@Service
public class ExitService {
	final ExitRepository exitRepository;
	
	public ExitService(ExitRepository exitRepository) {
		this.exitRepository = exitRepository;
	}
	
	public List<ExitProjection> findByIdExitNoteId(ExitNoteId exitNoteId){
		return exitRepository.findByIdExitNoteId(exitNoteId);
	}
}
