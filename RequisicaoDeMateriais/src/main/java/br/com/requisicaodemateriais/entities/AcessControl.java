package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.AcessControlId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_ctrl_acesso")
public class AcessControl implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		AcessControlId acessControlId;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company company;
	
		@ManyToOne()
		@JoinColumns({
			@JoinColumn(name="codigo_emp",referencedColumnName = "codigo_emp", insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil",referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch branch;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_sis", referencedColumnName = "codigo_sis", insertable=false, updatable=false)
		private System system;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_user",referencedColumnName = "codigo_user", insertable=false, updatable=false),
			@JoinColumn(name="codigo_sis",referencedColumnName = "codigo_sis", insertable=false, updatable=false)
		})
		private User user;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_emp",referencedColumnName = "codigo_emp", insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil",referencedColumnName = "codigo_fil", insertable=false, updatable=false),
			@JoinColumn(name="codigo_almox",referencedColumnName = "codigo_almox", insertable=false, updatable=false)
		})
		private Warehouse warehouse;
		
		
		@Column(name="incluir")
		private String incluir;
		@Column(name="excluir")
		private String excluir;
		@Column(name="modificar")
		private String modificar;
		@Column(name="consultar")
		private String consultar;
		
		
		public System getSystem() {
			return system;
		}
		public void setSystem(System system) {
			this.system = system;
		}
		public Branch getBranch() {
			return branch;
		}
		public void setBranch(Branch branch) {
			this.branch = branch;
		}

		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Warehouse getWarehouse() {
			return warehouse;
		}
		public void setWarehouse(Warehouse warehouse) {
			this.warehouse = warehouse;
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
			return Objects.hash(warehouse, system, branch, system, user);
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
			return Objects.equals(warehouse, other.warehouse) && Objects.equals(system, other.system)
					&& Objects.equals(branch, other.branch) && Objects.equals(system, other.system)
					&& Objects.equals(user, other.user);
		}			
}
