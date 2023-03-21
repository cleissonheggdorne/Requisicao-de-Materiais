package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_almox")
public class Warehouse implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")//chave estrangeira
		private String codigoEmp;
		@Column(name="codigo_fil")//chave estrangeira
		private String codigoFil;
		@Column(name="codigo_almox")//chave primaria
		private String codigoAlmox;
		@Column(name="nome_almox")
		private String nomeAlmox;
		
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
		public String getNomeAlmox() {
			return nomeAlmox;
		}
		public void setNomeAlmox(String nomeAlmox) {
			this.nomeAlmox = nomeAlmox;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(codigoAlmox, codigoEmp, codigoFil);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Warehouse other = (Warehouse) obj;
			return Objects.equals(codigoAlmox, other.codigoAlmox) && Objects.equals(codigoEmp, other.codigoEmp)
					&& Objects.equals(codigoFil, other.codigoFil);
		}
		
}
