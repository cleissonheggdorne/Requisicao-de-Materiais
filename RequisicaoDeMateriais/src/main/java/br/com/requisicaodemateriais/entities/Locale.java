package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.LocaleId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pr_localident")
public class Locale implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId //Indica que o objeto abaixo está sendo incorporado como o Id da classe (chave primária da tabela)
	private LocaleId localeId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
	private Company company;
	@ManyToOne()
	@JoinColumns({
		@JoinColumn(name="codigo_emp",referencedColumnName = "codigo_emp", insertable=false, updatable=false),
		@JoinColumn(name="codigo_fil",referencedColumnName = "codigo_fil", insertable=false, updatable=false)
	})
	private Branch branch;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
		@JoinColumn(name="codigo_local", referencedColumnName = "codigo_local", insertable=false, updatable=false) 
	})
	private LocaleName localeName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
		@JoinColumn(name="codigo_g", referencedColumnName = "codigo_g", insertable=false, updatable=false)
	})
	private General general;
	
	
	//Esse campo de data precisa obrigatoriamente ser null
	@Column(name="data_final")
	private Date dataFinal;
	@Column(name="user_apenas_pedido_compras")
	private String requisicaoSN;
	
	public Locale() {
		
	}

	public Locale(LocaleId localeId, Company company, Branch branch, LocaleName localeName, General general,
			Date dataFinal, String requisicaoSN) {
		super();
		this.localeId = localeId;
		this.company = company;
		this.branch = branch;
		this.localeName = localeName;
		this.general = general;
		this.dataFinal = dataFinal;
		this.requisicaoSN = requisicaoSN;
	}

	public LocaleId getLocaleId() {
		return localeId;
	}

	public void setLocaleId(LocaleId localeId) {
		this.localeId = localeId;
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

	public LocaleName getLocaleName() {
		return localeName;
	}

	public void setLocaleName(LocaleName localeName) {
		this.localeName = localeName;
	}

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getRequisicaoSN() {
		return requisicaoSN;
	}

	public void setRequisicaoSN(String requisicaoSN) {
		this.requisicaoSN = requisicaoSN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, company, general, localeId, localeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locale other = (Locale) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(company, other.company)
				&& Objects.equals(general, other.general) && Objects.equals(localeId, other.localeId)
				&& Objects.equals(localeName, other.localeName);
	}

	
}
