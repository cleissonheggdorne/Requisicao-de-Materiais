package br.com.requisicaodemateriais.entities;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.compositekeys.AcessControlId;
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
@Table(name = "al_ctrl_acesso")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AcessControl implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private AcessControlId id;
		
		@Column(name="incluir")
		private char incluir;
		@Column(name="excluir")
		private char excluir;
		@Column(name="modificar")
		private char modificar;
		@Column(name="consultar")
		private char consultar;
				
}
