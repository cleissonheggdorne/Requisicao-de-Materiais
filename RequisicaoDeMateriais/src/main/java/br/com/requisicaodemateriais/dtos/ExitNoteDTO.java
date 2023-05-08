package br.com.requisicaodemateriais.dtos;

import java.io.Serializable;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Validated
public class ExitNoteDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotBlank
	@Size(max=3)
	String codigoAlmox;
	@NotBlank
	@Size(max=5)
	String codigoFicha;
	@NotBlank
	@Size(max=8)
	String codigoLocal;
	@NotBlank
	@Size(max=255)
    String justificativa;
	@NotBlank
	@Size(max=3)
    String codigoBaixa;
	@NotBlank
	@Size(max=3)
	String userInfo;
	
	List<ExitDTO> listExit;
	
	
}
