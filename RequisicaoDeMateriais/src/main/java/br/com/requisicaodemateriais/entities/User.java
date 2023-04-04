package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.requisicaodemateriais.entities.compositekeys.UserId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_usuario")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UserId userId;
	
	
	//@MapsId("system")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_sis", referencedColumnName = "codigo_sis", insertable = false, updatable = false)
	private System system;
	
	@ManyToOne
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
	private Company company;
	
	@OneToOne
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
		@JoinColumn(name="codigo_g", referencedColumnName = "codigo_g", insertable=false, updatable=false)
	})
	private General pessoa;
	@Column(name="user_name")
	private String userName;
	@Column(name="status_user")
	private String statusUser;
	@Column(name="codigo_grp_usr")//chave estrangeira
	private String codigoGrpUser;
	@Column(name ="senha")
	private String senha;
	
	
	public User() {

	}


	public User(System system, UserId userId, Company company, General pessoa, String userName,
			String statusUser, String codigoGrpUser, String senha) {
		super();
		this.system = system;
		this.userId = userId;
		this.company = company;
		this.pessoa = pessoa;
		this.userName = userName;
		this.statusUser = statusUser;
		this.codigoGrpUser = codigoGrpUser;
		this.senha = senha;
	}

	public UserId getUserId() {
		return userId;
	}


	public void setUserId(UserId userId) {
		this.userId = userId;
	}
	
	public System getSystem() {
		return system;
	}


	public void setSystem(System system) {
		this.system = system;
	}


	public UserId getCodigoUser() {
		return userId;
	}


	public void setCodigoUser(UserId userId) {
		this.userId = userId;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}

	public General getPessoa() {
		return pessoa;
	}


	public void setPessoa(General pessoa) {
		this.pessoa = pessoa;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getStatusUser() {
		return statusUser;
	}


	public void setStatusUser(String statusUser) {
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


	@Override
	public int hashCode() {
		return Objects.hash(codigoGrpUser, userId, pessoa);
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
		return  Objects.equals(codigoGrpUser, other.codigoGrpUser)
				&& Objects.equals(userId, other.userId) && Objects.equals(pessoa, other.pessoa);
	}


	
}
