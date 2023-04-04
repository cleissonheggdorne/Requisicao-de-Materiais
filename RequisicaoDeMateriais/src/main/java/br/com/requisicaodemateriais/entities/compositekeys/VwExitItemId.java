package br.com.requisicaodemateriais.entities.compositekeys;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class VwExitItemId {
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="ano")
	private String ano;
	@Column(name="num_ped_saida")
	private String numeroSaida;
	
	public VwExitItemId() {	
	}

	public VwExitItemId(String codigoEmp, String codigoFil, String ano, String numeroSaida) {
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

	public String getAno() {
		return ano;
	}

	public String getNumeroSaida() {
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
