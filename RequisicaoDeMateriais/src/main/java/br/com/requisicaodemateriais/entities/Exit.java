//package br.com.requisicaodemateriais.entities;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "al_saida")
//public class Exit implements Serializable{
//	private static final long serialVersionUID = 1L;
//
//
//	@Id
//	@Column(name="codigo_emp")//chave estrangeira
//	private String codigoEmp;
//	@Column(name="codigo_fil")//chave estrangeira
//	private String codigoFil;
//	@Column(name="num_ped_saida")//chave estrangeira
//	private String numPedEntra;
//	@Column(name="codigo_prod")//chave estrangeira
//	private String codigoProd;
//	@Column(name="qtd_solicitada")
//	private double qtdSolicitada;
//	@Column(name="ano")
//	private String ano;
//	
//	public String getCodigoEmp() {
//		return codigoEmp;
//	}
//	public void setCodigoEmp(String codigoEmp) {
//		this.codigoEmp = codigoEmp;
//	}
//	public String getCodigoFil() {
//		return codigoFil;
//	}
//	public void setCodigoFil(String codigoFil) {
//		this.codigoFil = codigoFil;
//	}
//	public String getNumPedEntra() {
//		return numPedEntra;
//	}
//	public void setNumPedEntra(String numPedEntra) {
//		this.numPedEntra = numPedEntra;
//	}
//	public String getCodigoProd() {
//		return codigoProd;
//	}
//	public void setCodigoProd(String codigoProd) {
//		this.codigoProd = codigoProd;
//	}
//	public double getQtdSolicitada() {
//		return qtdSolicitada;
//	}
//	public void setQtdSolicitada(double qtdSolicitada) {
//		this.qtdSolicitada = qtdSolicitada;
//	}
//	public String getAno() {
//		return ano;
//	}
//	public void setAno(String ano) {
//		this.ano = ano;
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(ano, codigoEmp, codigoFil, codigoProd, numPedEntra);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Exit other = (Exit) obj;
//		return Objects.equals(ano, other.ano) && Objects.equals(codigoEmp, other.codigoEmp)
//				&& Objects.equals(codigoFil, other.codigoFil) && Objects.equals(codigoProd, other.codigoProd)
//				&& Objects.equals(numPedEntra, other.numPedEntra);
//	}
//	
//	
//
//	
//}
//
