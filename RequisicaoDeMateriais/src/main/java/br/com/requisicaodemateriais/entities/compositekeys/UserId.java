package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="codigo_sis")
	private String system;
	@Column(name="codigo_user")
	private String codigoUser;

	public UserId() {
		
	}

	public UserId(String system, String codigoUser) {
		super();
		this.system = system;
		this.codigoUser = codigoUser;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getCodigoUser() {
		return codigoUser;
	}

	public void setCodigoUser(String codigoUser) {
		this.codigoUser = codigoUser;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoUser, system);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserId other = (UserId) obj;
		return Objects.equals(codigoUser, other.codigoUser) && Objects.equals(system, other.system);
	}
	
}

