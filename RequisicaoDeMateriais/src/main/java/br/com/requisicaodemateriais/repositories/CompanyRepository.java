package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, String> {

}
