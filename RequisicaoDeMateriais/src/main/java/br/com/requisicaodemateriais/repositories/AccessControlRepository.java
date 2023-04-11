package br.com.requisicaodemateriais.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.requisicaodemateriais.entities.AcessControl;

public interface AccessControlRepository extends JpaRepository<AcessControl, String> {
	@Query("select i from AcessControl i \r\n"
			+ "where i.id.codigoEmp = :emp and \r\n"
			+ "i.id.codigoFil = :fil and \r\n"
			+ "i.id.codigoSis = :sis and \r\n"
			+ "i.id.codigoUser = :user and \r\n"
			+ "i.id.nomeMenu = 'Requisição de Material' and \r\n"
			+ "i.incluir = 'S'")
	public Optional<AcessControl> verifyAccess(@Param("emp") String codigoEmp, @Param("fil") String codigoFil,
			@Param("sis") String codigoSis, @Param("user") String codigoUser);
	
	public List<AcessControl> findByUser_UserIdCodigoUserAndAcessControlIdNomeMenu(String codigoUser, String nomeMenu);
}
