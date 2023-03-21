package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_produtos")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="codigo_emp")//chave estrangeira
	private String codigoEmp;
	@Column(name="codigo_fil")//chave estrangeira
	private String codigoFil;
	@Column(name="codigo_prod")//chave primaria
	private String codigoProd;
	@Column(name="nome_prod")
	private String nomeProd;
	
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
	public String getCodigoProd() {
		return codigoProd;
	}
	public void setCodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoEmp, codigoFil, codigoProd);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(codigoEmp, other.codigoEmp) && Objects.equals(codigoFil, other.codigoFil)
				&& Objects.equals(codigoProd, other.codigoProd);
	}
	
}
