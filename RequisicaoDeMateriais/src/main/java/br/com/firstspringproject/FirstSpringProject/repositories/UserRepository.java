package br.com.firstspringproject.FirstSpringProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.firstspringproject.FirstSpringProject.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
