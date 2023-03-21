package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gg_local")
public class LocaleName implements Serializable{

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name="codigo_emp")
		private String codigoEmp;
}

