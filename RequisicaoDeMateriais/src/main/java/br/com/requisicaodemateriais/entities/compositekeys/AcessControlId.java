package br.com.requisicaodemateriais.entities.compositekeys;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.Warehouse;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class AcessControlId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp"),
		@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil"),
		@JoinColumn(name="codigo_almox", referencedColumnName = "codigo_almox")
	})
	private Warehouse codigoAlmox;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_user",referencedColumnName = "codigo_user"),
		@JoinColumn(name="codigo_sis",referencedColumnName = "codigo_sis")
	})
	private User codigoUser;
	
	@Column(name="nome_menu")
	private String nomeMenu;
	
	
}
