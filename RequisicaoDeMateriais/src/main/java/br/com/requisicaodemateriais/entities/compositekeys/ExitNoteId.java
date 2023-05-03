package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.Branch;
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
public class ExitNoteId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@Column(name="codigo_emp")
	//private String codigoEmp;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp"),
		@JoinColumn(name="codigo_fil")
	})
	private Branch codigoFil;
	@Column(name="ano")
	private String ano;
	@Column(name="num_ped_saida")
	private String numeroSaida;
	
}
