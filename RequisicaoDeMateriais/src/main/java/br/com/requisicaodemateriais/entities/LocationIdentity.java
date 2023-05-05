package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.requisicaodemateriais.entities.compositekeys.LocationIdentityId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pr_localident")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LocationIdentity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId //Indica que o objeto abaixo está sendo incorporado como o Id da classe (chave primária da tabela)
	private LocationIdentityId id;
	
	@MapsId("codigoEmp")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false)
	private Company codigoEmp;
	
    //@MapsId("codigoFil")
	@ManyToOne()
	@JoinColumns({
		@JoinColumn(name="codigo_emp",referencedColumnName = "codigo_emp", insertable = false, updatable = false),
		@JoinColumn(name="codigo_fil",referencedColumnName = "codigo_fil", insertable = false, updatable = false)
	})
	private Branch codigoFil;
	
    //@MapsId("codigoLocal")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
		@JoinColumn(name="codigo_local", referencedColumnName = "codigo_local", insertable = false, updatable = false) 
	})
	private Location codigoLocal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
		@JoinColumn(name="codigo_g", referencedColumnName = "codigo_g", insertable = false, updatable = false)
	})
	private General codigoG;
	
	//Esse campo de data precisa obrigatoriamente ser null
	@Column(name="data_final")
	private LocalDate dataFinal;
	@Column(name="user_apenas_pedido_compras")
	private String requisicaoSN;
	
}
