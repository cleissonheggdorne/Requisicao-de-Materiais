package br.com.requisicaodemateriais.entities.compositekeys;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AllocationId {
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="codigo_ficha")
	private String codigoFicha;
	
	public AllocationId() {
		
	}

	public AllocationId(String codigoEmp, String codigoFil, String codigoFicha) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoFicha = codigoFicha;
	}

	public String getCodigoEmp() {
		return codigoEmp;
	}

	public String getCodigoFil() {
		return codigoFil;
	}

	public String getcodigoFicha() {
		return codigoFicha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoFicha, codigoEmp, codigoFil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllocationId other = (AllocationId) obj;
		return Objects.equals(codigoFicha, other.codigoFicha) && Objects.equals(codigoEmp, other.codigoEmp)
				&& Objects.equals(codigoFil, other.codigoFil);
	}
	
}
