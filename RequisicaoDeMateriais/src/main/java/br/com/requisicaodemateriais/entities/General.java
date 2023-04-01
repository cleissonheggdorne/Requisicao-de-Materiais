package br.com.requisicaodemateriais.entities;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.GeneralId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_geral")

public class General implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GeneralId generalId;
	
	@ManyToOne
	@MapsId("company")
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp")
	private Company company;
	
	@Column(name="nome_g")
	private String nameG;
	@Column(name="email_g")
	private String emailG;
	@Column(name="cpf_g")
	private String cpfG;
	@Column(name="ativo_inativo")
	private String ativoInativo;
	
	@OneToMany(mappedBy = "general")
    private List<Locale> locales;

	public General() {
		
	}

	public General(Company company, String nameG, String emailG, String cpfG, String ativoInativo) {
		super();
		this.company = company;
		this.nameG = nameG;
		this.emailG = emailG;
		this.cpfG = cpfG;
		this.ativoInativo = ativoInativo;
	}
	
	public GeneralId getGeneralId() {
		return generalId;
	}

	public void setGeneralId(GeneralId generalId) {
		this.generalId = generalId;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}



	public String getNameG() {
		return nameG;
	}

	public void setNameG(String nameG) {
		this.nameG = nameG;
	}

	public String getEmailG() {
		return emailG;
	}

	public void setEmailG(String emailG) {
		this.emailG = emailG;
	}

	public String getCpfG() {
		return cpfG;
	}

	public void setCpfG(String cpfG) {
		this.cpfG = cpfG;
	}

	public String getAtivoInativo() {
		return ativoInativo;
	}

	public void setAtivoInativo(String ativoInativo) {
		this.ativoInativo = ativoInativo;
	}

	public List<Locale> getLocales() {
		return locales;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(generalId,company, cpfG);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		General other = (General) obj;
		return Objects.equals(generalId, other.generalId) && Objects.equals(company, other.company)
				&& Objects.equals(cpfG, other.cpfG);
	}
	
	
	
	
}
