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
		@Column(name="codigo_emp")//chave estrangeira
		private String codigoEmp;
		@Column(name="codigo_fil")//chave estrangeira
		private String codigoFil;
		@Column(name="codigo_local")//chave estrangeira
		private String codigoLocal;
		@Column(name="codigo_g")//chave estrangeira
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
		@Override
		public int hashCode() {
			return Objects.hash(codigoEmp, codigoFil, codigoG, codigoLocal);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Locale other = (Locale) obj;
			return Objects.equals(codigoEmp, other.codigoEmp) && Objects.equals(codigoFil, other.codigoFil)
					&& Objects.equals(codigoG, other.codigoG) && Objects.equals(codigoLocal, other.codigoLocal);
		}
}
