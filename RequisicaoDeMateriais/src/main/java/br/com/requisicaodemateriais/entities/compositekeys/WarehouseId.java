package br.com.requisicaodemateriais.entities.compositekeys;


import jakarta.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;;

@Embeddable
public class WarehouseId implements Serializable {
	
//	/**
//	 * 
//	 */
	private static final long serialVersionUID = 1L;

	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="codigo_almox")
	private String codigoAlmox;
	
	public WarehouseId() {
		
	}
	public WarehouseId(String codigoEmp, String codigoFil, String codigoAlmox) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoAlmox = codigoAlmox;
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

	public String getCodigoAlmox() {
		return codigoAlmox;
	}

	public void setCodigoAlmox(String codigoAlmox) {
		this.codigoAlmox = codigoAlmox;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoAlmox, codigoEmp, codigoFil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WarehouseId other = (WarehouseId) obj;
		return Objects.equals(codigoAlmox, other.codigoAlmox) && Objects.equals(codigoEmp, other.codigoEmp)
				&& Objects.equals(codigoFil, other.codigoFil);
	}
	
}

