package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.Warehouse;
import br.com.requisicaodemateriais.entities.compositekeys.WarehouseId;
import br.com.requisicaodemateriais.repositories.WarehouseRepository;

@Service
public class WarehouseService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final WarehouseRepository warehouseRepository;
	final CompanyService companyService;
	final BranchService branchService;
	
	public WarehouseService(WarehouseRepository warehouseRepository, CompanyService companyService, BranchService branchService) {
		this.warehouseRepository = warehouseRepository;
		this.companyService = companyService;
		this.branchService = branchService;
	}
	
	public Optional<Warehouse> findWarehouse(String codigoAlmox){
		//Optional<Company> company = Company.createCompany("001", companyService);
		//Optional<Branch> branch = Branch.createBranch("001", branchService);
		WarehouseId warehouseId = new WarehouseId("001", "001", codigoAlmox);
		return warehouseRepository.findById(warehouseId);
	}
}
