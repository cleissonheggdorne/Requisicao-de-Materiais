package br.com.requisicaodemateriais.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Product;
import br.com.requisicaodemateriais.entities.compositekeys.ProductId;
import br.com.requisicaodemateriais.repositories.ProductRepository;

@Service
public class ProductService {

	final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Optional<Product> findById(String codigoProd) {
		return productRepository.findById(new ProductId("001", codigoProd));
	}
}
