package br.com.requisicaodemateriais.entities.compositekeys;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AcessControlId {
	
	@Column(name="codigo_emp")//chave estrangeira
	private String codigoEmp;
	@Column(name="codigo_fil")//chave estrangeira
	private String codigoFil;
	@Column(name="codigo_sis")//chave estrangeira
	private String codigoSis;
	@Column(name="codigo_user")//chave estrangeira
	private String codigoUser;
	@Column(name="codigo_almox")//chave estrangeira
	private String codigoAlmox;
	@Column(name="nome_menu")
	private String nomeMenu;
	
	public AcessControlId() {
		
	}
	
	public AcessControlId(String codigoEmp, String codigoFil, String codigoSis, String codigoUser, String codigoAlmox, String nomeMenu) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoSis = codigoSis;
		this.codigoUser = codigoUser;
		this.codigoAlmox = codigoAlmox;
		this.nomeMenu = nomeMenu;
	}
	
	
	
	public String getCodigoEmp() {
		return codigoEmp;
	}

	public void setCodigoEmp(String codigoEmp) {
		this.codigoEmp = codigoEmp;
	}

	public String getCodigoFil() {
		return codigoFil;
	}

	public void setCodigoFil(String codigoFil) {
		this.codigoFil = codigoFil;
	}

	public String getCodigoSis() {
		return codigoSis;
	}

	public void setCodigoSis(String codigoSis) {
		this.codigoSis = codigoSis;
	}

	public String getCodigoUser() {
		return codigoUser;
	}

	public void setCodigoUser(String codigoUser) {
		this.codigoUser = codigoUser;
	}

	public String getCodigoAlmox() {
		return codigoAlmox;
	}

	public void setCodigoAlmox(String codigoAlmox) {
		this.codigoAlmox = codigoAlmox;
	}
	
	public String getNomeMenu() {
		return nomeMenu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoAlmox, codigoEmp, codigoFil, codigoSis, codigoUser, nomeMenu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcessControlId other = (AcessControlId) obj;
		return Objects.equals(codigoAlmox, other.codigoAlmox) && Objects.equals(codigoEmp, other.codigoEmp)
				&& Objects.equals(codigoFil, other.codigoFil) && Objects.equals(codigoSis, other.codigoSis)
				&& Objects.equals(codigoUser, other.codigoUser)
				&& Objects.equals(nomeMenu, other.nomeMenu);
	}
	
}
