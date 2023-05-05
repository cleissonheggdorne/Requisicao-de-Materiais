package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.Location;
import br.com.requisicaodemateriais.entities.compositekeys.LocationId;

public interface LocaleNameRepository extends JpaRepository<Location, LocationId> {

}
