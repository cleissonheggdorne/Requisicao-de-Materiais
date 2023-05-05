package br.com.requisicaodemateriais.entities.projections;

import org.springframework.beans.factory.annotation.Value;

public interface ExitNoteProjection {
	String getIdNumeroSaida();
	String getWarehouseNomeAlmox();
	String getSheetNomeFicha();
	String getLocationNomeLocal();
	String getUserInfoPessoaNomeG();
	String getDataSaida();
	String getHoraSaida();
	String getJustificativa();
	
}
