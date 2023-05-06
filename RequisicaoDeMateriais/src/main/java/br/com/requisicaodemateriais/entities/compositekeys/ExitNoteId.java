package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
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
	
	@Embedded
	private BranchId branchId;
	@Column(name="ano")
	private String ano;
	@Column(name="num_ped_saida")
	private String numeroSaida;
	
}
