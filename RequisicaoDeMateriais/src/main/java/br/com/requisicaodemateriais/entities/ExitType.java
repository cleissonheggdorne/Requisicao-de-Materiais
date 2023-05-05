package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Optional;

import br.com.requisicaodemateriais.entities.compositekeys.ExitTypeId;
import br.com.requisicaodemateriais.services.ExitTypeService;
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
@Table(name = "pt_tp_baixa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ExitType implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@EmbeddedId
		private ExitTypeId id;
		
		@MapsId("codigo_emp")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp")
		private Company codigoEmp;
		
		//@MapsId("codigo_fil")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch codigoFil;
		
		@Column(name="codigo_tp_baixa", insertable=false, updatable=false)
		private String codigoBaixa;
		
		@ManyToOne
		@JoinColumn(name="codigo_sis", referencedColumnName = "codigo_sis")
		private GgSystem system;
		
		@Column(name="nome_tp_baixa")
		private String nomeBaixa;
		@Column(name="ativo_inativo")
		private String ativoInativo;
		
		public static Optional<ExitType> createExitType(String codigoBaixa, ExitTypeService exitTypeService){
			return exitTypeService.findExitType(codigoBaixa);
		}
	
}
