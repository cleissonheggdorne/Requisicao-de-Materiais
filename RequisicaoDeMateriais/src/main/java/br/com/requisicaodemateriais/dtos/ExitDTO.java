package br.com.requisicaodemateriais.dtos;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Validated
public class ExitDTO {
	
	@NotEmpty
	@Size(max=3)
	String codigoEmp;
	@NotEmpty
	@Size(max=3)
	String codigoFil;
	@NotEmpty
	@Size(max=4)
	String ano;
	@NotEmpty
	@Size(max=9)
	String numeroSaida;
}
