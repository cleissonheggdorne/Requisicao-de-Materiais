package br.com.requisicaodemateriais.dtos;

import jakarta.validation.constraints.NotEmpty;

public class UserDto {
	
	@NotEmpty
	String userName;
	@NotEmpty
	String senha;
}
