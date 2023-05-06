package br.com.requisicaodemateriais.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.projections.BalanceProjection;
import br.com.requisicaodemateriais.repositories.BalanceRepository;

@Service
public class BalanceService {
	final BalanceRepository balancerepository;
	
	public BalanceService(BalanceRepository balanceRepository) {
		this.balancerepository = balanceRepository;
	}
	
	public List<BalanceProjection> findByQtdGreaterThan(){
		//Saldo precisa ser maior que 0 (zero) para trazer na consulta
		return balancerepository.findByQtdGreaterThan(0);
	}
}
