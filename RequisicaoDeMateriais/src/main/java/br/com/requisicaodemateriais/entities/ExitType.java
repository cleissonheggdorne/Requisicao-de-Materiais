package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.ExitTypeId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pt_tp_baixa")
public class ExitType implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private ExitTypeId exitTypeID;
		
		@ManyToOne
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company company;
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch branch;
		
		@ManyToOne
		@JoinColumn(name="codigo_sis", referencedColumnName = "codigo_sis", insertable=false, updatable=false)
		private System system;
		
		@Column(name="nome_tp_baixa")
		private String nomeBaixa;
		@Column(name="ativo_inativo")
		private String ativoInativo;
		public ExitType() {
			
		}
		public ExitType(ExitTypeId exitTypeID, Company company, Branch branch, System system, String nomeBaixa,
				String ativoInativo) {
			super();
			this.exitTypeID = exitTypeID;
			this.company = company;
			this.branch = branch;
			this.system = system;
			this.nomeBaixa = nomeBaixa;
			this.ativoInativo = ativoInativo;
		}
		public ExitTypeId getExitTypeID() {
			return exitTypeID;
		}
		public void setExitTypeID(ExitTypeId exitTypeID) {
			this.exitTypeID = exitTypeID;
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
		public System getSystem() {
			return system;
		}
		public void setSystem(System system) {
			this.system = system;
		}
		public String getNomeBaixa() {
			return nomeBaixa;
		}
		public void setNomeBaixa(String nomeBaixa) {
			this.nomeBaixa = nomeBaixa;
		}
		public String getAtivoInativo() {
			return ativoInativo;
		}
		public void setAtivoInativo(String ativoInativo) {
			this.ativoInativo = ativoInativo;
		}
		@Override
		public int hashCode() {
			return Objects.hash(branch, company, exitTypeID, system);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ExitType other = (ExitType) obj;
			return Objects.equals(branch, other.branch) && Objects.equals(company, other.company)
					&& Objects.equals(exitTypeID, other.exitTypeID) && Objects.equals(system, other.system);
		}
		
}
