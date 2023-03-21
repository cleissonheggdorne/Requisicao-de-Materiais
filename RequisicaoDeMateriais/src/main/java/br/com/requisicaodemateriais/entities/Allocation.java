package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_ficha")
public class Allocation implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")//chave estrangeira
		private String codigoEmp;
		@Column(name="codigo_fil")//chave estrangeira
		private String codigoFil;
		@Column(name="codigo_ficha")//chave primaria
		private String codigoFicha;
		@Column(name="nome_ficha")
		private String nomeFicha;
		@Column(name="filtra_web")
		private String filtraWeb;
		
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
		public String getCodigoFicha() {
			return codigoFicha;
		}
		public void setCodigoFicha(String codigoFicha) {
			this.codigoFicha = codigoFicha;
		}
		public String getNomeFicha() {
			return nomeFicha;
		}
		public void setNomeFicha(String nomeFicha) {
			this.nomeFicha = nomeFicha;
		}
		public String getFiltraWeb() {
			return filtraWeb;
		}
		public void setFiltraWeb(String filtraWeb) {
			this.filtraWeb = filtraWeb;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(codigoEmp, codigoFicha, codigoFil);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Allocation other = (Allocation) obj;
			return Objects.equals(codigoEmp, other.codigoEmp) && Objects.equals(codigoFicha, other.codigoFicha)
					&& Objects.equals(codigoFil, other.codigoFil);
		}
}
