package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class GeneralId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="codigo_emp")
	private String company;
	@Column(name="codigo_g")
	private String codigoG;
	
	public GeneralId() {
		
	}

	public GeneralId(String company, String codigoG) {
		super();
		this.company = company;
		this.codigoG = codigoG;
	}

	public String getCodigoEmp() {
		return company;
	}

	public void setCodigoEmp(String company) {
		this.company = company;
	}

	public String getCodigoG() {
		return codigoG;
	}

	public void setCodigoG(String codigoG) {
		this.codigoG = codigoG;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, codigoG);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneralId other = (GeneralId) obj;
		return Objects.equals(company, other.company) && Objects.equals(codigoG, other.codigoG);
	}

}
