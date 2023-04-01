package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.AllocationId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_ficha")
public class Allocation implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private AllocationId allocationId;
		
		@ManyToOne
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company company;
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch branch;
		
		@Column(name="nome_ficha")
		private String nomeFicha;
		@Column(name="filtra_web")
		private String filtraWeb;
		
		public Allocation () {
			
		}

		public Allocation(AllocationId allocationId, Company company, Branch branch, String nomeFicha,
				String filtraWeb) {
			super();
			this.allocationId = allocationId;
			this.company = company;
			this.branch = branch;
			this.nomeFicha = nomeFicha;
			this.filtraWeb = filtraWeb;
		}

		public AllocationId getAllocationId() {
			return allocationId;
		}

		public void setAllocationId(AllocationId allocationId) {
			this.allocationId = allocationId;
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
			return Objects.hash(allocationId, branch, company, nomeFicha);
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
			return Objects.equals(allocationId, other.allocationId) && Objects.equals(branch, other.branch)
					&& Objects.equals(company, other.company) && Objects.equals(nomeFicha, other.nomeFicha);
		}
		
}
