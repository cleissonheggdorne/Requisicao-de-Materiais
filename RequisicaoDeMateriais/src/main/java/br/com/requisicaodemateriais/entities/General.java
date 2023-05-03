package br.com.requisicaodemateriais.entities;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.requisicaodemateriais.entities.compositekeys.GeneralId;
import br.com.requisicaodemateriais.services.GeneralService;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gg_geral")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class General implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GeneralId id;
	
	//private GeneralId generalId;
	@MapsId("codigoEmp")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp")
	private Company codigoEmp;
	@Column(name="codigo_g", insertable = false, updatable = false)
	private String codigoG;
	@Column(name="nome_g")
	private String nameG;
	@Column(name="email_g")
	private String emailG;
	@Column(name="cpf_g")
	private String cpfG;
	@Column(name="ativo_inativo")
	private String ativoInativo;
	@JsonIgnore
	@OneToMany(mappedBy = "codigoG")
    private List<Locale> locales;

	public static Optional<General> createGeneral(String codigoG, GeneralService generalService){
		return generalService.findGeneral(codigoG);
	}
	
}
