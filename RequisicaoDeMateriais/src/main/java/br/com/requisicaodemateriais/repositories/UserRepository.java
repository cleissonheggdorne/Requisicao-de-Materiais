package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
