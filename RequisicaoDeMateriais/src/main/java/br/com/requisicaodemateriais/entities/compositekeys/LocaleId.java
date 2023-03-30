package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable //Indica que a classe pode ser incorporada em outra
public class LocaleId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="codigo_local")
	private String codigoLocal;
	@Column(name="codigo_g")
	private String codigoG;
	
	public LocaleId() {
		
	}

	public LocaleId(String codigoEmp, String codigoFil, String codigoLocal, String codigoG) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoLocal = codigoLocal;
		this.codigoG = codigoG;
	}

	public String getcodigoEmp() {
		return codigoEmp;
	}

	public void setcodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getcodigoFil() {
		return codigoFil;
	}

	public void setcodigoFil(String codigoFil) {
		this.codigoFil = codigoFil;
	}

	public String getcodigoLocal() {
		return codigoLocal;
	}

	public void setcodigoLocal(String codigoLocal) {
		this.codigoLocal = codigoLocal;
	}

	public String getcodigoG() {
		return codigoG;
	}

	public void setcodigoG(String codigoG) {
		this.codigoG = codigoG;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoLocal, codigoFil, codigoEmp, codigoG);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocaleId other = (LocaleId) obj;
		return Objects.equals(codigoLocal, other.codigoLocal) && Objects.equals(codigoFil, other.codigoFil)
				&& Objects.equals(codigoEmp, other.codigoEmp) && Objects.equals(codigoG, other.codigoG);
	}

	
}
