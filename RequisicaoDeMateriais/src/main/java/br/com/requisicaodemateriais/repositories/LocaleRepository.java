package br.com.requisicaodemateriais.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.requisicaodemateriais.entities.Locale;
import br.com.requisicaodemateriais.entities.compositekeys.LocaleId;
import br.com.requisicaodemateriais.entities.projections.LocaleProjection;

public interface LocaleRepository extends JpaRepository<Locale, LocaleId>{
	/*@Query("select i from Locale i where i.localeId.codigoEmp = :codigo_emp and i.localeId.codigoFil = :codigo_fil and i.localeId.codigoG = :codigo_g")
	 *public Optional<Locale> searchLocale(@Param("codigo_emp") String codigoEmp,
	 *		@Param("codigo_fil") String codigoFil, @Param("codigo_g") String codigoG);
	
	 * O método abaixo utiliza convenção de palavras para que 
	 * o JPA interprete e crie a consulta JPQL automaticamente.
	 * Note que o símbolo "_"(underline) foi utilizado para representar que 
	 * o campo buscado faz parte de uma chave estrangeira
	 */
	public List<LocaleProjection> findByGeneral_GeneralIdCodigoG(String codigoG);

	public Optional<Locale> searchLocale(String codigoEmp, String string, String codigoG); 
	
}
