package br.com.requisicaodemateriais.entities;


	import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "gg_geral")
	public class General implements Serializable{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="codigo_g")
		private String codigoG;
		@Column(name="nome_g")
		private String nameG;
		@Column(name="email_g")
		private String emailG;
		@Column(name="cpf_g")
		private String cpfG;
		@Column(name="ativo_inativo")
		private String ativoInativo;


}
