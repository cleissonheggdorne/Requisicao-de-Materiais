package br.com.requisicaodemateriais.entities.compositekeys;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class WarehouseId implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name="codigo_emp")
	private String codigoEmp;
    @Column(name="codigo_fil")
	private String codigoFil;
    @Column(name="codigo_almox")
	private String codigoAlmox;
	
	
}

