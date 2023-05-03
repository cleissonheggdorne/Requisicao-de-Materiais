package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.LocaleName;
import br.com.requisicaodemateriais.entities.compositekeys.LocaleNameId;

public interface LocaleNameRepository extends JpaRepository<LocaleName, LocaleNameId> {

}
