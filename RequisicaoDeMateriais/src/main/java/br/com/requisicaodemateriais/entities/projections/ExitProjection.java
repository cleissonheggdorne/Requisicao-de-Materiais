package br.com.requisicaodemateriais.entities.projections;

import java.math.BigDecimal;

public interface ExitProjection {
	String getIdCodigoProd();
	String getProductNomeProd();
	BigDecimal getQtdSolicitada();
	
}
