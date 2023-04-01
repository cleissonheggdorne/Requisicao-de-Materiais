package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LocaleNameId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="codigo_emp")
	private String company;
	@Column(name="codigo_local")
	private String codigoLocal;
	
	public LocaleNameId() {
		
	}

	public LocaleNameId(String company, String codigoLocal) {
		super();
		this.company = company;
		this.codigoLocal = codigoLocal;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCodigoLocal() {
		return codigoLocal;
	}

	public void setCodigoLocal(String codigoLocal) {
		this.codigoLocal = codigoLocal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoLocal, company);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocaleNameId other = (LocaleNameId) obj;
		return Objects.equals(codigoLocal, other.codigoLocal) && Objects.equals(company, other.company);
	}
	
}
