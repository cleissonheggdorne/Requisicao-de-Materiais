package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class VwExitItemId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="ano")
	private char ano;
	@Column(name="num_ped_saida")
	private char numeroSaida;
	
	public VwExitItemId() {	
	}

	public VwExitItemId(String codigoEmp, String codigoFil, char ano, char numeroSaida) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.ano = ano;
		this.numeroSaida = numeroSaida;
	}

	public String getCodigoEmp() {
		return codigoEmp;
	}

	public String getCodigoFil() {
		return codigoFil;
	}

	public char getAno() {
		return ano;
	}

	public char getNumeroSaida() {
		return numeroSaida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, codigoEmp, codigoFil, numeroSaida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VwExitItemId other = (VwExitItemId) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(codigoEmp, other.codigoEmp)
				&& Objects.equals(codigoFil, other.codigoFil) && Objects.equals(numeroSaida, other.numeroSaida);
	}
	
	
	
}
