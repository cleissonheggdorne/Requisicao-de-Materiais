package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_local_ident")
public class Locale implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")
		private String codigoEmp;
		@Column(name="codigo_fil")
		private String codigoFil;
		@Column(name="codigo_local")
		private String codigoLocal;
		@Column(name="codigo_g")
		private String codigoG;
		//esse campo de data precissa obrigatoriamente ser null
		@Column(name="data_final")
		private Date dataFinal;
		@Column(name="user_apenas_pedido_compras")
		private String requisicaoSN;
		
		
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
		public String getCodigoLocal() {
			return codigoLocal;
		}
		public void setCodigoLocal(String codigoLocal) {
			this.codigoLocal = codigoLocal;
		}
		public String getCodigoG() {
			return codigoG;
		}
		public void setCodigoG(String codigoG) {
			this.codigoG = codigoG;
		}
		public Date getDataFinal() {
			return dataFinal;
		}
		public void setDataFinal(Date dataFinal) {
			this.dataFinal = dataFinal;
		}
		public String getRequisicaoSN() {
			return requisicaoSN;
		}
		public void setRequisicaoSN(String requisicaoSN) {
			this.requisicaoSN = requisicaoSN;
		}
		
	
}
