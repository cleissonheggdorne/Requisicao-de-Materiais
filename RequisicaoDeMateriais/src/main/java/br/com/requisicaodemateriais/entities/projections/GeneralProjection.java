package br.com.requisicaodemateriais.entities.projections;

import java.util.List;

import br.com.requisicaodemateriais.entities.LocationIdentity;
import br.com.requisicaodemateriais.entities.compositekeys.GeneralId;

public interface GeneralProjection {
	String getNameG();
	GeneralId getGeneralId();
	List<LocationIdentity> getLocales();
}
