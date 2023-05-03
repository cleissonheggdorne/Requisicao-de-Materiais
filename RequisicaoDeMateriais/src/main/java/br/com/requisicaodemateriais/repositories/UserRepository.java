package br.com.requisicaodemateriais.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.compositekeys.UserId;
import br.com.requisicaodemateriais.entities.projections.UserProjection;

public interface UserRepository extends JpaRepository<User, UserId>{
	
//	@Query("select i from User i where i.id.system = '06' and i.userName = :userName and i.senha = :password")
//	public Optional<User> searchLogin(@Param("userName") String userName, @Param("password") String password);
//	
//	@Query("select i from User i where i.id.system = '06' and i.userName = :userName and i.senha = :password")
//	public Optional<UserProjection> searchLogin2(@Param("userName") String userName, @Param("password") String password);
//	
	public Optional<UserProjection> findByUserNameAndSenhaAndIdCodigoSis(String userName, String password, String codigoSis);
	
}
