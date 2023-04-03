//package br.com.requisicaodemateriais.entities;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.Objects;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "al_notasaida")
//public class ExitNote implements Serializable{
//
//		private static final long serialVersionUID = 1L;
//		
//		@Id
//		@Column(name="codigo_emp")//chave estrangeira
//		private String codigoEmp;
//		@Column(name="codigo_fil")//chave estrangeira
//		private String codigoFil;
//		@Column(name="codigo_ficha")//chave estrangeira
//		private String codigoFicha;
//		@Column(name="num_ped_saida")//chave primaria
//		private String numPedEntra;
//		@Column(name="ano")//nao sei mas acho q é chave
//		private String ano;
//		@Column(name="codigo_tp_baixa")//chave estrangeira
//		private String tipoBaixa;
//		@Column(name="codigo_user")//chave estrangeira
//		private String codigoUser;
//		@Column(name="codigo_local")//chave estrangeira
//		private String codigoLocal;
//		@Column(name="codigo_almox")//chave estrangeira
//		private String codigoAlmox;
//		@Column(name="data_saida")
//		private Date dataSaida;
//		@Column(name="destinacao")
//		private String justificativa;
//		
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
//		public String getCodigoFicha() {
//			return codigoFicha;
//		}
//		public void setCodigoFicha(String codigoFicha) {
//			this.codigoFicha = codigoFicha;
//		}
//		public String getNumPedEntra() {
//			return numPedEntra;
//		}
//		public void setNumPedEntra(String numPedEntra) {
//			this.numPedEntra = numPedEntra;
//		}
//		public String getAno() {
//			return ano;
//		}
//		public void setAno(String ano) {
//			this.ano = ano;
//		}
//		public String getTipoBaixa() {
//			return tipoBaixa;
//		}
//		public void setTipoBaixa(String tipoBaixa) {
//			this.tipoBaixa = tipoBaixa;
//		}
//		public String getCodigoUser() {
//			return codigoUser;
//		}
//		public void setCodigoUser(String codigoUser) {
//			this.codigoUser = codigoUser;
//		}
//		public String getCodigoLocal() {
//			return codigoLocal;
//		}
//		public void setCodigoLocal(String codigoLocal) {
//			this.codigoLocal = codigoLocal;
//		}
//		public String getCodigoAlmox() {
//			return codigoAlmox;
//		}
//		public void setCodigoAlmox(String codigoAlmox) {
//			this.codigoAlmox = codigoAlmox;
//		}
//		public Date getDataSaida() {
//			return dataSaida;
//		}
//		public void setDataSaida(Date dataSaida) {
//			this.dataSaida = dataSaida;
//		}
//		public String getJustificativa() {
//			return justificativa;
//		}
//		public void setJustificativa(String justificativa) {
//			this.justificativa = justificativa;
//		}
//		
//		@Override
//		public int hashCode() {
//			return Objects.hash(ano, codigoAlmox, codigoEmp, codigoFil, numPedEntra);
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			ExitNote other = (ExitNote) obj;
//			return Objects.equals(ano, other.ano) && Objects.equals(codigoAlmox, other.codigoAlmox)
//					&& Objects.equals(codigoEmp, other.codigoEmp) && Objects.equals(codigoFil, other.codigoFil)
//					&& Objects.equals(numPedEntra, other.numPedEntra);
//		}
//}
