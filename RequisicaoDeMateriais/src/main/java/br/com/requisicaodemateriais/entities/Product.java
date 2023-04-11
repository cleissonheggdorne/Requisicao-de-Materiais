package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.ProductId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_produtos")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ProductId productId;
 
	@ManyToOne
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
	private Company company;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
		@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false)
	})
	private Branch branch;

	@Column(name="nome_prod")
	private String nomeProd;
	
	public Product() {	
	}

	public Product(ProductId productId, Company company, Branch branch, String nomeProd) {
		super();
		this.productId = productId;
		this.company = company;
		this.branch = branch;
		this.nomeProd = nomeProd;
	}

	public ProductId getProductId() {
		return productId;
	}

	public void setProductId(ProductId productId) {
		this.productId = productId;
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

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, company, productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(company, other.company)
				&& Objects.equals(productId, other.productId);
	}	
}
