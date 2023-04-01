package br.com.requisicaodemateriais.entities.views;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_al_saldos")
public class VwBalance implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")
		private String codigoEmp;
		@Column(name="codigo_fil")
		private String codigoFil;
		//@Column(name="codigo_saldo") talvez entre
		@Column(name="codigo_almox")
		private String codigoAlmox;
		@Column(name="codigo_ficha")
		private String codigoFicha;
		@Column(name="codigo_prod")
		private String codigoProd;
		@Column(name="nome_prod")
		private String nomeProd;
		//@Column(name="qtd") talvez entre teria q ser diferente de 0
		
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
		public String getCodigoAlmox() {
			return codigoAlmox;
		}
		public void setCodigoAlmox(String codigoAlmox) {
			this.codigoAlmox = codigoAlmox;
		}
		public String getCodigoFicha() {
			return codigoFicha;
		}
		public void setCodigoFicha(String codigoFicha) {
			this.codigoFicha = codigoFicha;
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
}
