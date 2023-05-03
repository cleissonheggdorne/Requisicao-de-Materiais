package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import br.com.requisicaodemateriais.entities.compositekeys.UserId;
import br.com.requisicaodemateriais.services.UserService;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gg_usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserId id;
	
	@MapsId("codigoSis")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_sis")
	private GgSystem codigoSis;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp"),
		@JoinColumn(name="codigo_g", referencedColumnName = "codigo_g")
	})
	private General pessoa;
	@Column(name="user_name")
	private String userName;
	@Column(name="status_user")
	private String statusUser;
	@Column(name="codigo_grp_usr") //chave estrangeira
	private String codigoGrpUser;
	@Column(name ="senha")
	private String senha;
	
	public static Optional<User> createUser(String codigoUser, UserService userService) {
	    return userService.findUser(codigoUser);
	}

	
}
