package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BranchId implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	
	public BranchId() {
		
	}

	public BranchId(String codigoEmp, String codigoFil) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
	}

	public String getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getCodigoFil() {
		return codigoFil;
	}

	public void setCodigoFil(String codigoFil) {
		this.codigoFil = codigoFil;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoFil, codigoEmp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BranchId other = (BranchId) obj;
		return Objects.equals(codigoFil, other.codigoFil) && Objects.equals(codigoEmp, other.codigoEmp);
	}

	

}
