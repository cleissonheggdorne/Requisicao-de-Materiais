package br.com.requisicaodemateriais.entities.projections;

import java.util.List;

import br.com.requisicaodemateriais.entities.Locale;
import br.com.requisicaodemateriais.entities.compositekeys.GeneralId;

public interface GeneralProjection {
	String getNameG();
	GeneralId getGeneralId();
	List<Locale> getLocales();
}
