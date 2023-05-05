package br.com.requisicaodemateriais.entities;

import java.io.Serializable;

import br.com.requisicaodemateriais.entities.compositekeys.SheetId;
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
@Table(name = "al_ficha")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Sheet implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private SheetId Id;
		
		@MapsId("codigoEmp")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp")
		private Company codigoEmp;
		
		//@MapsId("codigoFil")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable = false, updatable = false)
		})
		private Branch codigoFil;
		
		//@MapsId("codigoFicha")
		//@Column(name="codigo_ficha")
		//private String codigoFicha;
		
		@Column(name="nome_ficha")
		private String nomeFicha;
		@Column(name="filtra_web")
		private String filtraWeb;
		
}
