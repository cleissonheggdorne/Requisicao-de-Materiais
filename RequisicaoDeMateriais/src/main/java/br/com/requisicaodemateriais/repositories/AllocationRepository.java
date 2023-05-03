package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Allocation;
import br.com.requisicaodemateriais.entities.compositekeys.AllocationId;

public interface AllocationRepository extends JpaRepository<Allocation, AllocationId> {

}
