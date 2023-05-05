package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Sheet;
import br.com.requisicaodemateriais.entities.compositekeys.SheetId;

public interface AllocationRepository extends JpaRepository<Sheet, SheetId> {

}
