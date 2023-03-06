package br.com.firstspringproject.FirstSpringProject.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "al_saida")
public class Exit implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="num_ped_saida")
	private String numPedEntra;
	@Column(name="codigo_g")
	private String codigoG;
	@Column(name="codigo_user")
	private String codigoUser;
	@Column(name="codigo_almox")
	private String codigoAlmox;
	@Column(name="codigo_local")
	private String codigoLocal;
	
	
}

