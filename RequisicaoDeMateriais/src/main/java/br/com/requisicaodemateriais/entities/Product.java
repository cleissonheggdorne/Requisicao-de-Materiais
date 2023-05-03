package br.com.requisicaodemateriais.entities;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.compositekeys.ProductId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gg_produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ProductId id;
	
	@MapsId("codigoEmp")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp")
	private Company codigoEmp;
	
	//@Column(name="codigo_prod")
	//private String codigoProd;

	@Column(name="nome_prod")
	private String nomeProd;
	
	
}
