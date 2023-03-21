package br.com.requisicaodemateriais.entities;


	import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "gg_geral")
	public class General implements Serializable{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="codigo_g")//chave primaria
		private String codigoG;
		@Column(name="nome_g")
		private String nameG;
		@Column(name="email_g")
		private String emailG;
		@Column(name="cpf_g")
		private String cpfG;
		@Column(name="ativo_inativo")
		private String ativoInativo;
		
		public String getCodigoG() {
			return codigoG;
		}
		public void setCodigoG(String codigoG) {
			this.codigoG = codigoG;
		}
		public String getNameG() {
			return nameG;
		}
		public void setNameG(String nameG) {
			this.nameG = nameG;
		}
		public String getEmailG() {
			return emailG;
		}
		public void setEmailG(String emailG) {
			this.emailG = emailG;
		}
		public String getCpfG() {
			return cpfG;
		}
		public void setCpfG(String cpfG) {
			this.cpfG = cpfG;
		}
		public String getAtivoInativo() {
			return ativoInativo;
		}
		public void setAtivoInativo(String ativoInativo) {
			this.ativoInativo = ativoInativo;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(codigoG, cpfG);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			General other = (General) obj;
			return Objects.equals(codigoG, other.codigoG) && Objects.equals(cpfG, other.cpfG);
		}
}
