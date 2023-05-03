package br.com.requisicaodemateriais.entities.views;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.Company;
import br.com.requisicaodemateriais.entities.compositekeys.VwExitNotaId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_al_saida_nota")
public class VwExitNote implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private VwExitNotaId vwExitNotaId;
		
		@ManyToOne
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company company;
		
		
		@ManyToOne
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp",insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch branch;
		
		@Column(name="codigo_g_receptor")//codigo_g de outras tabelas
		private String codigoGG;
		@Column(name="data_saida")
		private LocalDate dataSaida;
		@Column(name="codigo_almox")
		private char codigoAlmox;
		@Column(name="destinacao")
		private String destinacao;
		@Column(name="codigo_local")
		private String codigoLocal;
		
		public VwExitNote () {
			
		}

		public VwExitNote(VwExitNotaId vwExitNotaId, Company company, Branch branch, String codigoGG, LocalDate dataSaida,
				char codigoAlmox, String destinacao, String codigoLocal) {
			super();
			this.vwExitNotaId = vwExitNotaId;
			this.company = company;
			this.branch = branch;
			this.codigoGG = codigoGG;
			this.dataSaida = dataSaida;
			this.codigoAlmox = codigoAlmox;
			this.destinacao = destinacao;
			this.codigoLocal = codigoLocal;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public VwExitNotaId getVwExitNotaId() {
			return vwExitNotaId;
		}

		public Company getCompany() {
			return company;
		}

		public Branch getBranch() {
			return branch;
		}

		public String getCodigoGG() {
			return codigoGG;
		}

		public LocalDate getDataSaida() {
			return dataSaida;
		}

		public char getCodigoAlmox() {
			return codigoAlmox;
		}

		public String getDestinacao() {
			return destinacao;
		}

		public String getCodigoLocal() {
			return codigoLocal;
		}

		@Override
		public int hashCode() {
			return Objects.hash(branch, company, vwExitNotaId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			VwExitNote other = (VwExitNote) obj;
			return Objects.equals(branch, other.branch) && Objects.equals(company, other.company)
					&& Objects.equals(vwExitNotaId, other.vwExitNotaId);
		}
		
		
		
}	