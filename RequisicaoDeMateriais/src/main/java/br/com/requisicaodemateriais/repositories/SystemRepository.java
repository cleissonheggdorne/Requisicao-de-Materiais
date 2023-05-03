package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.GgSystem;

public interface SystemRepository extends JpaRepository<GgSystem, String> {

}
