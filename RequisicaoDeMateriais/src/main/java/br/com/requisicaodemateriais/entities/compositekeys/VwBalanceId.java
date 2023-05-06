package br.com.requisicaodemateriais.entities.compositekeys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class VwBalanceId {

	@Embedded
	private BranchId branch;
	@Column(name="ano")
	private String ano;
	@Column(name="codigo_saldo")
	private String codigoSaldo;
	
}
