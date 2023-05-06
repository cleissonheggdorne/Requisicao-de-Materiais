package br.com.requisicaodemateriais.entities.projections;

import java.math.BigDecimal;

public interface ExitProjection {
	String getCodigoProdIdCodigoProd();
	String getCodigoProdNomeProd();
	BigDecimal getQtdSolicitada();
	
}
