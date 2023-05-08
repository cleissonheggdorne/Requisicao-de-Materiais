package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Product;
import br.com.requisicaodemateriais.entities.compositekeys.ProductId;

public interface ProductRepository extends JpaRepository<Product, ProductId>{
	
}
