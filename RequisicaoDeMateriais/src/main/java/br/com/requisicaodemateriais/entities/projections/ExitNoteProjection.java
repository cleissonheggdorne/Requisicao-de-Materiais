package br.com.requisicaodemateriais.entities.projections;

import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;

public interface ExitNoteProjection {
//	String getIdCodigoFilIdCodigoEmp();
//	String getIdCodigoFilIdCodigoFil();
//	String getIdNumeroSaida();
	ExitNoteId getId();
	String getWarehouseNomeAlmox();
	String getSheetNomeFicha();
	String getLocationNomeLocal();
	String getUserInfoPessoaNomeG();
	String getDataSaida();
	String getHoraSaida();
	String getJustificativa();
	
}
