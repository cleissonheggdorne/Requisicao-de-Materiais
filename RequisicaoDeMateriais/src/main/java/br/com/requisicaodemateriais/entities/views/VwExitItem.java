package br.com.requisicaodemateriais.entities.views;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.Company;
import br.com.requisicaodemateriais.entities.compositekeys.VwExitItemId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_al_saida_item")
public class VwExitItem implements Serializable{

		private static final long serialVersionUID = 1L;
		
		
		@EmbeddedId
		private VwExitItemId vwExitItemId;
		
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
			@JoinColumn(name="ano", referencedColumnName = "ano", insertable=false, updatable=false),
			@JoinColumn(name="num_ped_saida", referencedColumnName = "num_ped_saida", insertable=false, updatable=false)
		})
		private VwExitNote vwExitNote;
		
		@Column(name="codigo_prod")
		private Date codigoProd;
		@Column(name="nome_prod")
		private String nomeProd;
		@Column(name="descricao_item")
		private String descricaoItem;
		@Column(name="abreviatura_embalag")
		private String abreviaturaUnidade;
		@Column(name="qtd_solicitada")
		private double qtdSolicitada;
		@Column(name="saida_liberada")
		private double saidaLiberada;
		
		public VwExitItem () {
			
		}

		public VwExitItem(VwExitItemId vwExitItemId, Company company, Branch branch, VwExitNote vwExitNote,
				Date codigoProd, String nomeProd, String descricaoItem, String abreviaturaUnidade, double qtdSolicitada,
				double saidaLiberada) {
			super();
			this.vwExitItemId = vwExitItemId;
			this.company = company;
			this.branch = branch;
			this.vwExitNote = vwExitNote;
			this.codigoProd = codigoProd;
			this.nomeProd = nomeProd;
			this.descricaoItem = descricaoItem;
			this.abreviaturaUnidade = abreviaturaUnidade;
			this.qtdSolicitada = qtdSolicitada;
			this.saidaLiberada = saidaLiberada;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public VwExitItemId getVwExitItemId() {
			return vwExitItemId;
		}

		public Company getCompany() {
			return company;
		}

		public Branch getBranch() {
			return branch;
		}

		public VwExitNote getVwExitNote() {
			return vwExitNote;
		}

		public Date getCodigoProd() {
			return codigoProd;
		}

		public String getNomeProd() {
			return nomeProd;
		}

		public String getDescricaoItem() {
			return descricaoItem;
		}

		public String getAbreviaturaUnidade() {
			return abreviaturaUnidade;
		}

		public double getQtdSolicitada() {
			return qtdSolicitada;
		}

		public double getSaidaLiberada() {
			return saidaLiberada;
		}

		@Override
		public int hashCode() {
			return Objects.hash(branch, company, vwExitItemId, vwExitNote);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			VwExitItem other = (VwExitItem) obj;
			return  Objects.equals(branch, other.branch)
					&& Objects.equals(company, other.company) && Objects.equals(vwExitItemId, other.vwExitItemId)
					&& Objects.equals(vwExitNote, other.vwExitNote);
		}
		
		
}
