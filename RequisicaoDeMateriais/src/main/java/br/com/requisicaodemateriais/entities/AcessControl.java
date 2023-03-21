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
		@Column(name="codigo_emp")
		private String codigoEmp;
		@Column(name="codigo_fil")
		private String codigoFil;
		@Column(name="codigo_sis")
		private String codigoSis;
		@Column(name="codigo_user")
		private String codigoUser;
		@Column(name="codigo_almox")
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
			
}
