package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.ExitType;
import br.com.requisicaodemateriais.entities.compositekeys.ExitTypeId;

public interface ExitTypeRepository extends JpaRepository<ExitType, ExitTypeId> {

}
