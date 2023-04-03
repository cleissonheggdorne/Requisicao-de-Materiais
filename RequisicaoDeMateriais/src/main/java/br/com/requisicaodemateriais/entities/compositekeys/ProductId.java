package br.com.requisicaodemateriais.entities.compositekeys;


import jakarta.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;;

@Embeddable
public class ProductId implements Serializable {
	
//	/**
//	 * 
//	 */
	private static final long serialVersionUID = 1L;

	@Column(name="codigo_emp")
	private String codigoEmp;
	@Column(name="codigo_fil")
	private String codigoFil;
	@Column(name="codigo_prod")
	private String codigoProd;
	
	public ProductId() {
		
	}
	public ProductId(String codigoEmp, String codigoFil, String codigoProd) {
		super();
		this.codigoEmp = codigoEmp;
		this.codigoFil = codigoFil;
		this.codigoProd = codigoProd;
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

	public String getcodigoProd() {
		return codigoProd;
	}

	public void setcodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProd, codigoEmp, codigoFil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductId other = (ProductId) obj;
		return Objects.equals(codigoProd, other.codigoProd) && Objects.equals(codigoEmp, other.codigoEmp)
				&& Objects.equals(codigoFil, other.codigoFil);
	}
	
}

