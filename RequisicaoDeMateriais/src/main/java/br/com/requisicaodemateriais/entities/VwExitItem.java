package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_al_saida_item")
public class VwExitItem implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")
		private String codigoEmp;
		@Column(name ="codigo_fil")
		private String codigoFil;
		@Column(name="ano")
		private String ano;
		@Column(name="num_ped_saida")
		private String numeroSaida;
		@Column(name="codigo_prod")
		private Date codigoProd;
		@Column(name="nome_prod")
		private String nomeProd;
		@Column(name="descricao_item")
		private String descricaoItem;
		@Column(name="abreviatura_embalag")
		private String abreviaturaUnidade;
		@Column(name="qtd_solicitada")
		private double qtdSolicitada;
		@Column(name="saida_liberada")
		private double saidaLiberada;
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
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getNumeroSaida() {
			return numeroSaida;
		}
		public void setNumeroSaida(String numeroSaida) {
			this.numeroSaida = numeroSaida;
		}
		public Date getCodigoProd() {
			return codigoProd;
		}
		public void setCodigoProd(Date codigoProd) {
			this.codigoProd = codigoProd;
		}
		public String getNomeProd() {
			return nomeProd;
		}
		public void setNomeProd(String nomeProd) {
			this.nomeProd = nomeProd;
		}
		public String getDescricaoItem() {
			return descricaoItem;
		}
		public void setDescricaoItem(String descricaoItem) {
			this.descricaoItem = descricaoItem;
		}
		public String getAbreviaturaUnidade() {
			return abreviaturaUnidade;
		}
		public void setAbreviaturaUnidade(String abreviaturaUnidade) {
			this.abreviaturaUnidade = abreviaturaUnidade;
		}
		public double getQtdSolicitada() {
			return qtdSolicitada;
		}
		public void setQtdSolicitada(double qtdSolicitada) {
			this.qtdSolicitada = qtdSolicitada;
		}
		public double getSaidaLiberada() {
			return saidaLiberada;
		}
		public void setSaidaLiberada(double saidaLiberada) {
			this.saidaLiberada = saidaLiberada;
		}
			
}
