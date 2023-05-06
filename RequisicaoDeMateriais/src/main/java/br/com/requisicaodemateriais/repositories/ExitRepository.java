package br.com.requisicaodemateriais.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Exit;
import br.com.requisicaodemateriais.entities.compositekeys.ExitId;
import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import br.com.requisicaodemateriais.entities.projections.ExitProjection;

public interface ExitRepository extends JpaRepository<Exit, ExitId> {
	List<ExitProjection> findByIdExitNoteId(ExitNoteId exitNoteId);
}
