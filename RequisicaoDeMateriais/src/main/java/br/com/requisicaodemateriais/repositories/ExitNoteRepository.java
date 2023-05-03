package br.com.requisicaodemateriais.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.ExitNote;
import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;

public interface ExitNoteRepository extends JpaRepository<ExitNote, ExitNoteId>{
	
}
