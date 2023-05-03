package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.compositekeys.BranchId;

public interface BranchRepository extends JpaRepository<Branch, BranchId> {

}
