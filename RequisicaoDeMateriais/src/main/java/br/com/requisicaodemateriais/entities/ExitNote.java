package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_notasaida")
public class ExitNote implements Serializable{

		private static final long serialVersionUID = 1L;
		@EmbeddedId
		private ExitNoteId exitNoteId;
		
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
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false),
			@JoinColumn(name="codigo_ficha", referencedColumnName = "codigo_ficha",insertable=false, updatable=false)
		})
		private Allocation allocation;
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false),
			@JoinColumn(name="codigo_tp_baixa", referencedColumnName = "codigo_tp_baixa",insertable=false, updatable=false)
		})
		private ExitType exitType;
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_sis_info", referencedColumnName = "codigo_sis",insertable=false, updatable=false),
			@JoinColumn(name="codigo_user_info", referencedColumnName = "codigo_user", insertable=false, updatable=false)
		})
		private User user;
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_local", referencedColumnName = "codigo_local", insertable=false, updatable=false)
		})		
		private LocaleName localeName;
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false),
			@JoinColumn(name="codigo_almox", referencedColumnName = "codigo_almox", insertable=false, updatable=false)
		})
		private Warehouse warehouse;
		
		
		@Column(name="data_saida")
		private Date dataSaida;
		@Column(name="destinacao")
		private String justificativa;
		
		public ExitNote() {
			
		}

		public ExitNote(ExitNoteId exitNoteId, Company company, Branch branch, Allocation allocation, ExitType exitType,
				User user, LocaleName localeName, Warehouse warehouse, Date dataSaida, String justificativa) {
			super();
			this.exitNoteId = exitNoteId;
			this.company = company;
			this.branch = branch;
			this.allocation = allocation;
			this.exitType = exitType;
			this.user = user;
			this.localeName = localeName;
			this.warehouse = warehouse;
			this.dataSaida = dataSaida;
			this.justificativa = justificativa;
		}

		public ExitNoteId getExitNoteId() {
			return exitNoteId;
		}

		public void setExitNoteId(ExitNoteId exitNoteId) {
			this.exitNoteId = exitNoteId;
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

		public Allocation getAllocation() {
			return allocation;
		}

		public void setAllocation(Allocation allocation) {
			this.allocation = allocation;
		}

		public ExitType getExitType() {
			return exitType;
		}

		public void setExitType(ExitType exitType) {
			this.exitType = exitType;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public LocaleName getLocaleName() {
			return localeName;
		}

		public void setLocaleName(LocaleName localeName) {
			this.localeName = localeName;
		}

		public Warehouse getWarehouse() {
			return warehouse;
		}

		public void setWarehouse(Warehouse warehouse) {
			this.warehouse = warehouse;
		}

		public Date getDataSaida() {
			return dataSaida;
		}

		public void setDataSaida(Date dataSaida) {
			this.dataSaida = dataSaida;
		}

		public String getJustificativa() {
			return justificativa;
		}

		public void setJustificativa(String justificativa) {
			this.justificativa = justificativa;
		}

		@Override
		public int hashCode() {
			return Objects.hash(allocation, branch, company, exitNoteId, exitType, localeName, user, warehouse);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ExitNote other = (ExitNote) obj;
			return Objects.equals(allocation, other.allocation) && Objects.equals(branch, other.branch)
					&& Objects.equals(company, other.company) && Objects.equals(exitNoteId, other.exitNoteId)
					&& Objects.equals(exitType, other.exitType) && Objects.equals(localeName, other.localeName)
					&& Objects.equals(user, other.user) && Objects.equals(warehouse, other.warehouse);
		}
		
}
