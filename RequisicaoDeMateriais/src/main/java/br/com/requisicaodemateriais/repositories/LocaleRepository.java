package br.com.requisicaodemateriais.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.requisicaodemateriais.entities.Locale;
import br.com.requisicaodemateriais.entities.compositekeys.LocaleId;

public interface LocaleRepository extends JpaRepository<Locale, LocaleId>{
	@Query("select i from Locale i where i.localeId.codigoEmp = :codigo_emp and i.localeId.codigoFil = :codigo_fil and i.localeId.codigoG = :codigo_g")
	public Optional<Locale> searchLocale(@Param("codigo_emp") String codigoEmp,
			@Param("codigo_fil") String codigoFil, @Param("codigo_g") String codigoG);
	
	
}
