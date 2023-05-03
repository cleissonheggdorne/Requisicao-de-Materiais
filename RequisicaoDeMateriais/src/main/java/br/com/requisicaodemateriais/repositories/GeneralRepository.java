package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.General;
import br.com.requisicaodemateriais.entities.compositekeys.GeneralId;

public interface GeneralRepository  extends JpaRepository<General, GeneralId>{


}
