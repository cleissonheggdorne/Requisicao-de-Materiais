package br.com.requisicaodemateriais.entities;

import java.io.Serializable;
import java.util.Optional;

import br.com.requisicaodemateriais.entities.compositekeys.WarehouseId;
import br.com.requisicaodemateriais.services.WarehouseService;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "al_almox")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Warehouse implements Serializable{

		private static final long serialVersionUID = 1L;

		@EmbeddedId
		private WarehouseId id;
		
		//@MapsId("codigoEmp")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false)
		private Company codigoEmp;
		
		//@MapsId("codigoFil")
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumns({
			@JoinColumn(name="codigo_emp", referencedColumnName = "codigo_emp", insertable=false, updatable=false),
			@JoinColumn(name="codigo_fil", referencedColumnName = "codigo_fil", insertable=false, updatable=false)
		})
		private Branch codigoFil;
		
		//@MapsId("codigoAlmox")
//		@Column(name="codigo_almox", insertable=false, updatable=false)
//		private String codigoAlmox;
		
		@Column(name="nome_almox")
		private String nomeAlmox;
		
		public static Optional<Warehouse> createWarehouse(String codigoAlmox, WarehouseService warehouseService) {
		    return warehouseService.findWarehouse(codigoAlmox);
		}

}
