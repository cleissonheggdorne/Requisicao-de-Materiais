package br.com.requisicaodemateriais.dtos;

import java.math.BigDecimal;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class ExitDTO {
	
	@NotEmpty
	@Size(max = 7)
	private String codigoProd;
	@NotEmpty
	private BigDecimal qtdSolicitada;

}
