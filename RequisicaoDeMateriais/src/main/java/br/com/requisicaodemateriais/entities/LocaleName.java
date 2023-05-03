package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import br.com.requisicaodemateriais.entities.compositekeys.LocaleNameId;
import br.com.requisicaodemateriais.services.LocaleNameService;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gg_local")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LocaleName implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private LocaleNameId localeNameId;
		
		@MapsId("codigoEmp")
		@OneToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp")
		private Company codigoEmp;
		
//		@Column(name="codigo_local")
//		private String codigoLocal;
		
		@Column(name="nome_local")
		private String nomeLocal;
		@Column(name="ativo_inativo")
		private char ativoInativo;
		
		@OneToMany(mappedBy = "codigoLocal")
	    private List<Locale> locales;
		
		public static Optional<LocaleName> createLocaleName(String codigoLocal, LocaleNameService localeNameService){
			return localeNameService.findLocaleName(codigoLocal);
		}

}

