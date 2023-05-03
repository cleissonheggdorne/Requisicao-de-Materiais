package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Optional;

import br.com.requisicaodemateriais.services.CompanyService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="gg_empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="nome_emp")
	private String nomeEmp;
	@Column(name="cgc_emp")
	private String cnpj;
	@Column(name="cam_logo")
	private String pathLogo;
	@Column(name="codigo_munic")
	private String codigoMunicipio;

	
	public static Optional<Company> createCompany(String codigoEmp, CompanyService companyService){
		return companyService.findCompany(codigoEmp);
	}

	
	
}
