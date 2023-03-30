package br.com.requisicaodemateriais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.requisicaodemateriais.entities.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	boolean existsByUserNameAndSenha(String userName, String senha);
	boolean findByUserNameAndSenha(String userName, String senha);
	
	@Query("select i from User i where i.id.system = '06' and i.userName = :userName and i.senha = :password")
	public User searchLogin(@Param("userName") String userName, @Param("password") String password);
	
}
