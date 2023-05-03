package br.com.requisicaodemateriais.entities.views;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vw_al_saldos")
public class VwBalance implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")
		private String codigoEmp;
		@Column(name="codigo_fil")
		private String codigoFil;
		//@Column(name="codigo_saldo") talvez entre
		@Column(name="codigo_almox")
		private char codigoAlmox;
		@Column(name="codigo_ficha")
		private char codigoFicha;
		@Column(name="codigo_prod")
		private char codigoProd;
		@Column(name="nome_prod")
		private String nomeProd;
		//@Column(name="qtd") talvez entre teria q ser diferente de 0
		
		public String getCodigoEmp() {
			return codigoEmp;
		}
	
		public String getCodigoFil() {
			return codigoFil;
		}
	
		public char getCodigoAlmox() {
			return codigoAlmox;
		}
		
		public char getCodigoFicha() {
			return codigoFicha;
		}
	
		public char getCodigoProd() {
			return codigoProd;
		}
	
		public String getNomeProd() {
			return nomeProd;
		}
	
}
