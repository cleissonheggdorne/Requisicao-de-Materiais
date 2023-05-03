package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Warehouse;
import br.com.requisicaodemateriais.entities.compositekeys.WarehouseId;

public interface WarehouseRepository  extends JpaRepository<Warehouse, WarehouseId>{


}
