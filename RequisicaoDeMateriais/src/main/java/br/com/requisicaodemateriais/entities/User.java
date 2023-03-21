package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_usuario")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigo_emp")//chave estrangeira
	private String codigoEmp;
	@Column(name ="codigo_fil")//chave estrangeira
	private String codigoFil;
	@Column(name="codigo_user")//chave primaria
	private String codigoUser;
	@Column(name="codigo_g")//chave estrangeira
	private String codigoG;
	@Column(name="user_name")
	private String userName;
	@Column(name="status_user")
	private String statusUser;
	@Column(name="codigo_grp_user")//chave estrangeira
	private String codigoGrpUser;
	@Column(name ="senha")
	private String senha;
	
	
	public User() {

	}

	public User(String codigoEmp, String codigoFil, String codigoUser, String codigoG, String userName, String statusUser, String codigoGrpUser, String senha ) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoUser = codigoUser;
		this.codigoG = codigoG;
		this.userName = userName;
		this.statusUser = statusUser;
		this.codigoGrpUser = codigoGrpUser;
		this.senha = senha;
		
	}
	public String getCodigoEmp() {
		return codigoEmp;
	}
	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
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

	public void setEstado(String statusUser) {
		this.statusUser = statusUser;
	}
	public String getCodigoGrpUser() {
		return codigoGrpUser;
	}
	public void setCodigoGrpUser(String codigoGrpUser) {
		this.codigoGrpUser = codigoGrpUser;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCodigoFil() {
		return codigoFil;
	}
	public void setCodigoFil(String codigoFil) {
		this.codigoFil = codigoFil;
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
