package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Optional;

import br.com.requisicaodemateriais.entities.compositekeys.BranchId;
import br.com.requisicaodemateriais.services.BranchService;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="gg_filial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Branch implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BranchId id;
	
	@MapsId("codigoEmp")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_emp")
	private Company codigoEmp;
	
	//@MapsId("codigoFil")
	//@ManyToOne(fetch = FetchType.LAZY)
//	@Column(name="codigo_fil")
//	private String codigoFil;
	
	@Column(name="nome_fil")
	private String nomeFil;
	@Column(name="cgc_fil")
	private String cnpj;
	
	public static Optional<Branch> createBranch(String codigoFil, BranchService branchService){
		return branchService.findBranch(codigoFil);
	}

	
}
