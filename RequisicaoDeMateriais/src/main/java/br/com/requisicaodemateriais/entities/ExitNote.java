package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Date;

import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "al_notasaida")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ExitNote implements Serializable{

		private static final long serialVersionUID = 1L;

		@EmbeddedId
		private ExitNoteId id;
		
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumns({
//			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable = false),
//		    @JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable = false),
//			@JoinColumn(name="codigo_almox", referencedColumnName = "codigo_almox", insertable=false, updatable = false)
//		})
//		private Warehouse warehouse;
		
		@Column(name="codigo_almox", length = 3)
		private String codigoAlmox;
		
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumns({
//			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable = false),
//			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable = false),
//			@JoinColumn(name="codigo_ficha", referencedColumnName = "codigo_ficha", insertable=false, updatable = false)
//		})
//		private Allocation allocation;
		
		@Column(name="codigo_ficha", length = 5)
		private String codigoFicha;
		
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumns({
//			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
//			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable = false, updatable = false),
//			@JoinColumn(name="codigo_tp_baixa", referencedColumnName = "codigo_tp_baixa", insertable = false, updatable = false)
//		})
//		private ExitType exitType;
		
		@Column(name="codigo_tp_baixa", length = 3)
		private String codigoBaixa;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_sis_info", referencedColumnName = "codigo_sis"),
			@JoinColumn(name="codigo_user_info", referencedColumnName = "codigo_user")
		})
		private User userInfo;
		
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumn(name="codigo_sis_info", referencedColumnName = "codigo_sis")
//		private GgSystem systemInfo;
		
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumns({
//			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
//			@JoinColumn(name="codigo_local", referencedColumnName = "codigo_local", insertable = false, updatable = false)
//		})		
//		private LocaleName localeName;
		
		@Column(name="codigo_local", length = 7)
		private String codigoLocal;
		
		
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumns({
//			@JoinColumn(name="codigo_g_receptor", referencedColumnName = "codigo_g", insertable = false, updatable = false),
//			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
//		})
//		private General generalReceptor;
		
		@Column(name="codigo_g_receptor", length = 7)
		private String codigoGReceptor;
	
//		@ManyToOne(fetch = FetchType.LAZY)
//		@JoinColumns({
//			@JoinColumn(name="codigo_g_usuario", referencedColumnName = "codigo_g", insertable = false, updatable = false),
//			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable = false, updatable = false),
//		})
//		private General generalUser;
		
		@Column(name="codigo_g_usuario", length = 7)
		private String codigoGUsuario;
		
		@NotNull
		@Column(name="data_saida")
		@Temporal(TemporalType.DATE)
		private Date dataSaida;
		@Column(name="destinacao")
		private String justificativa;
		@NotNull
		@Column(name="hora_saida", length = 6)
		private String horaSaida;
		
}
