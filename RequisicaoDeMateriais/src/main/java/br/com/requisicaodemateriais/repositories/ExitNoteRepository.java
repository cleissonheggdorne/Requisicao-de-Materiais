package br.com.requisicaodemateriais.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.ExitNote;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import br.com.requisicaodemateriais.entities.projections.ExitNoteProjection;

public interface ExitNoteRepository extends JpaRepository<ExitNote, ExitNoteId>{
	
	public List<ExitNoteProjection> findByUserInfo(User User);
}
