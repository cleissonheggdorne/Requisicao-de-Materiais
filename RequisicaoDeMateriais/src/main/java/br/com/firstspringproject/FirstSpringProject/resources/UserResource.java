package br.com.firstspringproject.FirstSpringProject.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResource {
	
	@JsonProperty("user")
	private String codigoUser;
	@JsonProperty("codigo_g")
	private String codigoG;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("estado")
	private String estado;
	
	public UserResource(String codigoUser, String codigoG, String userName, String estado) {
		super();
		this.codigoUser = codigoUser;
		this.codigoG = codigoG;
		this.userName = userName;
		this.estado = estado;
	}
	public String getCodigoUser() {
		return codigoUser;
	}
	public void setCodigoUser(String codigoUser) {
		this.codigoUser = codigoUser;
	}
	public String getCodigoG() {
		return codigoG;
	}
	public void setCodigoG(String codigoG) {
		this.codigoG = codigoG;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
