package br.com.requisicaodemateriais.entities.projections;

public interface ExitNoteProjection {
	String getExitNoteIdNumeroSaida();
	String getProductIdCodigoProd();
	String getProductNomeProd();
	double getQtdSolicitada();
}
