package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="gg_empresa")
public class Company implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="nome_emp")
	private String nomeEmp;
	@Column(name="cgc_emp")
	private String cnpj;
	@Column(name="cam_logo")
	private String pathLogo;
	@Column(name="codigo_munic")
	private String codigoMunicipio;

	public Company() {
		
	}

	public Company(String codigoEmp, String nomeEmp, String cnpj, String pathLogo, String codigoMunicipio) {
		super();
		this.codigoEmp = codigoEmp;
		this.nomeEmp = nomeEmp;
		this.cnpj = cnpj;
		this.pathLogo = pathLogo;
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getNomeEmp() {
		return nomeEmp;
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getPathLogo() {
		return pathLogo;
	}

	public void setPathLogo(String pathLogo) {
		this.pathLogo = pathLogo;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, codigoEmp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(codigoEmp, other.codigoEmp);
	}
	
}
