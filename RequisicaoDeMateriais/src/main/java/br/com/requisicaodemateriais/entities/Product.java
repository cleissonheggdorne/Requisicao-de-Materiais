package br.com.requisicaodemateriais.entities;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.compositekeys.ProductId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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

	@Column(name="nome_prod")
	private String nomeProd;
	@Column(name="descricao_prod")
	private String descricao;
	@Column(name="codigo_tpp")
	private String codigoTpp;
	
	
}
