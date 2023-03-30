package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gg_sistemas")
public class System implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo_sis")
	private String codigoSis;
	@Column(name="nome_sis")
	private String nomeSis;
	
	public System() {
		
	}

	public System(String codigoSis, String nomeSis) {
		super();
		this.codigoSis = codigoSis;
		this.nomeSis = nomeSis;
	}

	public String getCodigoSis() {
		return codigoSis;
	}

	public void setCodigoSis(String codigoSis) {
		this.codigoSis = codigoSis;
	}

	public String getNomeSis() {
		return nomeSis;
	}

	public void setNomeSis(String nomeSis) {
		this.nomeSis = nomeSis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoSis, nomeSis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		System other = (System) obj;
		return Objects.equals(codigoSis, other.codigoSis) && Objects.equals(nomeSis, other.nomeSis);
	}
}
