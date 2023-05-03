package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.ExitNote;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class ExitId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp"),
		@JoinColumn(name="codigo_fil"),
		@JoinColumn(name="ano"),
		@JoinColumn(name="num_ped_saida"),
	})
	private ExitNote numeroSaida;
	@Column(name="codigo_prod")
	private String codigoProd;
	@Column(name="codigo_lote")
	private String codigoLote;
	@Column(name="codigo_ender")
	private String codigoEnder;
	

}
