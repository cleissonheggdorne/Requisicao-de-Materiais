package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.requisicaodemateriais.entities.compositekeys.ExitId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "al_saida")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Exit implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExitId id;
	
	//@MapsId("codigoProd")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
		@JoinColumn(name="codigo_prod", referencedColumnName = "codigo_prod", insertable = false, updatable = false)
	})
	private Product codigoProd;
	
	//@MapsId("codigoLote")
//	@Column(name="codigo_lote")
//	private String codigoLote;
//	
//	//@MapsId("codigoEnder")
//	@Column(name="codigo_ender")
//	private String codigoEnder;
	
	@Column(name="qtd_solicitada")
	private BigDecimal qtdSolicitada;
	
}

