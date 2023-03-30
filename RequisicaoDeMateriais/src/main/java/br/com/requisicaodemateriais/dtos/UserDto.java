package br.com.requisicaodemateriais.dtos;

import jakarta.validation.constraints.NotEmpty;

public class UserDto {
	
	@NotEmpty
	String userName;
	
	String senha;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
