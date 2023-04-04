package br.com.requisicaodemateriais.entities.compositekeys;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ExitTypeId {
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="codigo_tp_baixa")
	private String codigoBaixa;
	
	public ExitTypeId() {
		
	}

	public ExitTypeId(String codigoEmp, String codigoFil, String codigoBaixa) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoBaixa = codigoBaixa;
	}

	public String getCodigoEmp() {
		return codigoEmp;
	}

	public String getCodigoFil() {
		return codigoFil;
	}

	public String getCodigoBaixa() {
		return codigoBaixa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoBaixa, codigoEmp, codigoFil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExitTypeId other = (ExitTypeId) obj;
		return Objects.equals(codigoBaixa, other.codigoBaixa) && Objects.equals(codigoEmp, other.codigoEmp)
				&& Objects.equals(codigoFil, other.codigoFil);
	}
	
}
