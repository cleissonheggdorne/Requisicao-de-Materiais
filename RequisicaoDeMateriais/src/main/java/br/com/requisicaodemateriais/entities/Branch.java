package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.BranchId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="gg_filial")
public class Branch implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BranchId branchId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("company")
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
	private Company company;
	
	@Column(name="nome_fil")
	private String nomeFil;
	@Column(name="cgc_fil")
	private String cnpj;
	
	public Branch() {
		
	}

	public Branch(Company company, String codigoFil, String nomeFil, String cnpj, BranchId branchId) {
		super();
		this.company = company;
		this.branchId = branchId;
		this.nomeFil = nomeFil;
		this.cnpj = cnpj;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public BranchId getBranchId() {
		return branchId;
	}

	public void setBranchId(BranchId branchId) {
		this.branchId = branchId;
	}

	public String getNomeFil() {
		return nomeFil;
	}

	public void setNomeFil(String nomeFil) {
		this.nomeFil = nomeFil;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, branchId, company);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(branchId, other.branchId)
				&& Objects.equals(company, other.company);
	}

	
	
}
