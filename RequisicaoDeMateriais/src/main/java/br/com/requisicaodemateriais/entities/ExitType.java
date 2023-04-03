//package br.com.requisicaodemateriais.entities;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "pt_tp_baixa")
//public class ExitType implements Serializable{
//
//		private static final long serialVersionUID = 1L;
//		
//		@Id
//		@Column(name="codigo_emp")//chave estrangeira
//		private String codigoEmp;
//		@Column(name="codigo_fil")//chave estrangeira
//		private String codigoFil;
//		@Column(name="codigo_sis")//chave estrangeira
//		private String codigoSis;
//		@Column(name="codigo_tp_baixa") //chave primaira
//		private String codigoBaixa;
//		@Column(name="nome_tp_baixa")
//		private String nomeBaixa;
//		@Column(name="ativo_inativo")
//		private String ativoInativo;
//		public String getCodigoEmp() {
//			return codigoEmp;
//		}
//		public void setCodigoEmp(String codigoEmp) {
//			this.codigoEmp = codigoEmp;
//		}
//		public String getCodigoFil() {
//			return codigoFil;
//		}
//		public void setCodigoFil(String codigoFil) {
//			this.codigoFil = codigoFil;
//		}
//		public String getCodigoSis() {
//			return codigoSis;
//		}
//		public void setCodigoSis(String codigoSis) {
//			this.codigoSis = codigoSis;
//		}
//		public String getCodigoBaixa() {
//			return codigoBaixa;
//		}
//		public void setCodigoBaixa(String codigoBaixa) {
//			this.codigoBaixa = codigoBaixa;
//		}
//		public String getNomeBaixa() {
//			return nomeBaixa;
//		}
//		public void setNomeBaixa(String nomeBaixa) {
//			this.nomeBaixa = nomeBaixa;
//		}
//		public String getAtivoInativo() {
//			return ativoInativo;
//		}
//		public void setAtivoInativo(String ativoInativo) {
//			this.ativoInativo = ativoInativo;
//		}
//		@Override
//		public int hashCode() {
//			return Objects.hash(codigoBaixa, codigoEmp, codigoFil, codigoSis);
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			ExitType other = (ExitType) obj;
//			return Objects.equals(codigoBaixa, other.codigoBaixa) && Objects.equals(codigoEmp, other.codigoEmp)
//					&& Objects.equals(codigoFil, other.codigoFil) && Objects.equals(codigoSis, other.codigoSis);
//		}
//}
