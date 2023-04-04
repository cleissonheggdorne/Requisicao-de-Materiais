package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.WarehouseId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_almox")
public class Warehouse implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		WarehouseId warehouseId;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company company;
	
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_emp",referencedColumnName = "codigo_emp", insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil",referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch branch;
		
		@Column(name="nome_almox")
		private String nomeAlmox;
		
		public Warehouse() {
			
		}

		public Warehouse(WarehouseId warehouseId, Company company, Branch branch, String nomeAlmox) {
			super();
			this.warehouseId = warehouseId;
			this.company = company;
			this.branch = branch;
			this.nomeAlmox = nomeAlmox;
		}

		public WarehouseId getWarehouseId() {
			return warehouseId;
		}

		public void setWarehouseId(WarehouseId warehouseId) {
			this.warehouseId = warehouseId;
		}

		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

		public Branch getBranch() {
			return branch;
		}

		public void setBranch(Branch branch) {
			this.branch = branch;
		}

		public String getNomeAlmox() {
			return nomeAlmox;
		}

		public void setNomeAlmox(String nomeAlmox) {
			this.nomeAlmox = nomeAlmox;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			return Objects.hash(branch, company, nomeAlmox, warehouseId);
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
			return Objects.equals(branch, other.branch) && Objects.equals(company, other.company)
					&& Objects.equals(nomeAlmox, other.nomeAlmox) && Objects.equals(warehouseId, other.warehouseId);
		}
		
		
}
