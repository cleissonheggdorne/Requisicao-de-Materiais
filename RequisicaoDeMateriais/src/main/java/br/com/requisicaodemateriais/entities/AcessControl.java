package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_ctrl_acesso")
public class AcessControl implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")//chave estrangeira
		private String codigoEmp;
		@Column(name="codigo_fil")//chave estrangeira
		private String codigoFil;
		@Column(name="codigo_sis")//chave estrangeira
		private String codigoSis;
		@Column(name="codigo_user")//chave estrangeira
		private String codigoUser;
		@Column(name="codigo_almox")//chave estrangeira
		private String codigoAlmox;
		@Column(name="nome_menu")
		private String nomeMenu;
		@Column(name="incluir")
		private String incluir;
		@Column(name="excluir")
		private String excluir;
		@Column(name="modificar")
		private String modificar;
		@Column(name="consultar")
		private String consultar;
		
		
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
		public String getCodigoSis() {
			return codigoSis;
		}
		public void setCodigoSis(String codigoSis) {
			this.codigoSis = codigoSis;
		}
		public String getCodigoUser() {
			return codigoUser;
		}
		public void setCodigoUser(String codigoUser) {
			this.codigoUser = codigoUser;
		}
		public String getCodigoAlmox() {
			return codigoAlmox;
		}
		public void setCodigoAlmox(String codigoAlmox) {
			this.codigoAlmox = codigoAlmox;
		}
		public String getNomeMenu() {
			return nomeMenu;
		}
		public void setNomeMenu(String nomeMenu) {
			this.nomeMenu = nomeMenu;
		}
		public String getIncluir() {
			return incluir;
		}
		public void setIncluir(String incluir) {
			this.incluir = incluir;
		}
		public String getExcluir() {
			return excluir;
		}
		public void setExcluir(String excluir) {
			this.excluir = excluir;
		}
		public String getModificar() {
			return modificar;
		}
		public void setModificar(String modificar) {
			this.modificar = modificar;
		}
		public String getConsultar() {
			return consultar;
		}
		public void setConsultar(String consultar) {
			this.consultar = consultar;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(codigoAlmox, codigoEmp, codigoFil, codigoSis, codigoUser);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AcessControl other = (AcessControl) obj;
			return Objects.equals(codigoAlmox, other.codigoAlmox) && Objects.equals(codigoEmp, other.codigoEmp)
					&& Objects.equals(codigoFil, other.codigoFil) && Objects.equals(codigoSis, other.codigoSis)
					&& Objects.equals(codigoUser, other.codigoUser);
		}			
}
