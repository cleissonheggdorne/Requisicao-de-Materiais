package br.com.requisicaodemateriais.entities.views;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_al_saida_nota")
public class VwExitNote implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")
		private String codigoEmp;
		@Column(name ="codigo_fil")
		private String codigoFil;
		@Column(name="codigo_g_receptor")//codigo_g de outras tabelas
		private String codigoGG;
		@Column(name="ano")
		private String ano;
		@Column(name="num_ped_saida")
		private String numeroSaida;
		@Column(name="data_saida")
		private Date dataSaida;
		@Column(name="codigo_almox")
		private String codigoAlmox;
		@Column(name="destinacao")
		private String destinacao;
		@Column(name="codigo_local")
		private String codigoLocal;
		
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
		public String getCodigoGG() {
			return codigoGG;
		}
		public void setCodigoGG(String codigoGG) {
			this.codigoGG = codigoGG;
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
		public Date getDataSaida() {
			return dataSaida;
		}
		public void setDataSaida(Date dataSaida) {
			this.dataSaida = dataSaida;
		}
		public String getCodigoAlmox() {
			return codigoAlmox;
		}
		public void setCodigoAlmox(String codigoAlmox) {
			this.codigoAlmox = codigoAlmox;
		}
		public String getDestinacao() {
			return destinacao;
		}
		public void setDestinacao(String destinacao) {
			this.destinacao = destinacao;
		}
		public String getCodigoLocal() {
			return codigoLocal;
		}
		public void setCodigoLocal(String codigoLocal) {
			this.codigoLocal = codigoLocal;
		}
			
}

