package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_local")
public class LocaleName implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")//chave estrangeira
		private String codigoEmp;
		@Column(name="codigo_local")//chave primaria
		private String codigoLocal;
		@Column(name="nome_local")
		private String nomeLocal;
		@Column(name="ativo_inativo")
		private String ativoInativo;
		public String getCodigoEmp() {
			return codigoEmp;
		}
		public void setCodigoEmp(String codigoEmp) {
			this.codigoEmp = codigoEmp;
		}
		public String getCodigoLocal() {
			return codigoLocal;
		}
		public void setCodigoLocal(String codigoLocal) {
			this.codigoLocal = codigoLocal;
		}
		public String getNomeLocal() {
			return nomeLocal;
		}
		public void setNomeLocal(String nomeLocal) {
			this.nomeLocal = nomeLocal;
		}
		public String getAtivoInativo() {
			return ativoInativo;
		}
		public void setAtivoInativo(String ativoInativo) {
			this.ativoInativo = ativoInativo;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(codigoEmp, codigoLocal);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LocaleName other = (LocaleName) obj;
			return Objects.equals(codigoEmp, other.codigoEmp) && Objects.equals(codigoLocal, other.codigoLocal);
		}
}

