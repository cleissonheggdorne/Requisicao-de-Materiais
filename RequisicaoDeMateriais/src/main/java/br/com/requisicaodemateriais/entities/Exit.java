package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
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
@Table(name = "al_saida")
public class Exit implements Serializable{
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private ExitNoteId exitId;
	
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
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
		@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false),
		@JoinColumn(name="codigo_prod", referencedColumnName = "codigo_prod", insertable=false, updatable=false)
	})
	private Product product;
	
	@Column(name="qtd_solicitada")
	private double qtdSolicitada;

	public Exit () {
	}

	public Exit(ExitNoteId exitId, Company company, Branch branch, Product product, double qtdSolicitada) {
		super();
		this.exitId = exitId;
		this.company = company;
		this.branch = branch;
		this.product = product;
		this.qtdSolicitada = qtdSolicitada;
	}

	public ExitNoteId getExitId() {
		return exitId;
	}

	public void setExitId(ExitNoteId exitId) {
		this.exitId = exitId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getQtdSolicitada() {
		return qtdSolicitada;
	}

	public void setQtdSolicitada(double qtdSolicitada) {
		this.qtdSolicitada = qtdSolicitada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, company, exitId, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exit other = (Exit) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(company, other.company)
				&& Objects.equals(exitId, other.exitId) && Objects.equals(product, other.product);
	}
}

