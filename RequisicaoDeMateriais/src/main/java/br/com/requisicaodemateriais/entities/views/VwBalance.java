package br.com.requisicaodemateriais.entities.views;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.requisicaodemateriais.entities.compositekeys.VwBalanceId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vw_al_saldos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VwBalance implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private VwBalanceId id;
		
		@Column(name="codigo_prod")
		private String codigoProd;
		@Column(name="nome_prod")
		private String nomeProd;
		@Column(name="codigo_lote")
		private String codigoLote;
		@Column(name="codigo_ender")
		private String codigoEnder;
		@Column(name="qtd")
		private BigDecimal qtd;
		@Column(name="codigo_tpp")
		private String codigoTpp;
		@Column(name="vlr_unitario")
		private BigDecimal valorUnitario;
		
	
}
