package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.LocaleNameId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_local")
public class LocaleName implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private LocaleNameId localeNameId;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@MapsId("company")
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company company;
		
		@Column(name="nome_local")
		private String nomeLocal;
		@Column(name="ativo_inativo")
		private String ativoInativo;
		
		@OneToMany(mappedBy = "localeName")
	    private List<Locale> locales;
		
		public LocaleNameId getLocaleNameId() {
			return localeNameId;
		}

		public void setLocaleNameId(LocaleNameId localeNameId) {
			this.localeNameId = localeNameId;
		}

		public LocaleName() {
			
		}

		public LocaleName(LocaleNameId localeNameId, Company company, String nomeLocal, String ativoInativo) {
			super();
			this.localeNameId = localeNameId;
			this.company = company;
			this.nomeLocal = nomeLocal;
			this.ativoInativo = ativoInativo;
		}

		public LocaleNameId getLocalNameId() {
			return localeNameId;
		}

		public void setLocalNameId(LocaleNameId localeNameId) {
			this.localeNameId = localeNameId;
		}
		
		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

	

		public String getNomeLocal() {
			return nomeLocal;
		}

		public void setNomeLocal(String nomeLocal) {
			this.nomeLocal = nomeLocal;
		}

		public String getAtivoInativo() {
			return ativoInativo;
		}

		public void setAtivoInativo(String ativoInativo) {
			this.ativoInativo = ativoInativo;
		}

		@Override
		public int hashCode() {
			return Objects.hash(company, localeNameId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LocaleName other = (LocaleName) obj;
			return Objects.equals(company, other.company) && Objects.equals(localeNameId, other.localeNameId);
		}
	
		
}

