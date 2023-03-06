package br.com.firstspringproject.FirstSpringProject.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_usuario")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo_user")
	private String codigoUser;
	@Column(name="codigo_g")
	private String codigoG;
	@Column(name="user_name")
	private String userName;
	private String status_user;
	
	public User() {
		
	}
	
	public User(String codigoUser, String codigoG, String userName, String status_user) {
		super();
		this.codigoUser = codigoUser;
		this.codigoG = codigoG;
		this.userName = userName;
		this.status_user = status_user;
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
		return status_user;
	}
	public void setEstado(String status_user) {
		this.status_user = status_user;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoG, codigoUser, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(codigoG, other.codigoG) && Objects.equals(codigoUser, other.codigoUser)
				&& Objects.equals(userName, other.userName);
	}
	
	
	

}
