package br.com.requisicaodemateriais.dtos;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Validated
public class ExitNoteDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//codigo_almox
	@NotBlank
	@Size(max=3)
	String codigoAlmox;
	//codigo_ficha
	@NotBlank
	@Size(max=5)
	String codigoFicha;
	//codigo_local
	@NotBlank
	@Size(max=8)
	String codigoLocal;
	//destinacao
	@NotBlank
	@Size(max=255)
    String justificativa;
    //codigo_tp_baixa
	@NotBlank
	@Size(max=3)
    String codigoBaixa;
    //codigo_user
	@NotBlank
	@Size(max=3)
	String userInfo;
	
	public ExitNoteDTO() {
		
	}

	public ExitNoteDTO(String codigoAlmox, String codigoFicha, String codigoLocal, String justificativa,
			String codigoBaixa, String userInfo) {
		super();
		this.codigoAlmox = codigoAlmox;
		this.codigoFicha = codigoFicha;
		this.codigoLocal = codigoLocal;
		this.justificativa = justificativa;
		this.codigoBaixa = codigoBaixa;
		this.userInfo = userInfo;
	}

	public String getCodigoAlmox() {
		return codigoAlmox;
	}

	public void setCodigoAlmox(String codigoAlmox) {
		this.codigoAlmox = codigoAlmox;
	}

	public String getCodigoFicha() {
		return codigoFicha;
	}

	public void setCodigoFicha(String codigoFicha) {
		this.codigoFicha = codigoFicha;
	}

	public String getCodigoLocal() {
		return codigoLocal;
	}

	public void setCodigoLocal(String codigoLocal) {
		this.codigoLocal = codigoLocal;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public String getCodigoBaixa() {
		return codigoBaixa;
	}

	public void setCodigoBaixa(String codigoBaixa) {
		this.codigoBaixa = codigoBaixa;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
}
