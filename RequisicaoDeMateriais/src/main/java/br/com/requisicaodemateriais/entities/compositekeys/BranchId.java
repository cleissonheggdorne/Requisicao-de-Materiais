package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BranchId implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="codigo_emp")
	private String company;
	@Column(name="codigo_fil")
	private String branch;
	
	public BranchId() {
		
	}

	public BranchId(String company, String branch) {
		super();
		this.company = company;
		this.branch = branch;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, company);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BranchId other = (BranchId) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(company, other.company);
	}

	

}
