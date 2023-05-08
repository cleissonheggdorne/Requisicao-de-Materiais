package br.com.requisicaodemateriais.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.entities.projections.BalanceProjection;
import br.com.requisicaodemateriais.entities.views.VwBalance;
import br.com.requisicaodemateriais.repositories.BalanceRepository;

@Service
public class BalanceService {
	final BalanceRepository balanceRepository;
	
	public BalanceService(BalanceRepository balanceRepository) {
		this.balanceRepository = balanceRepository;
	}
	
	public List<BalanceProjection> findByQtdGreaterThan(){
		//Saldo precisa ser maior que 0 (zero) para trazer na consulta
		return balanceRepository.findByIdAnoAndQtdGreaterThan(Integer.toString(LocalDate.now().getYear()), 0);
	}
	
	public VwBalance findByIdAnoAndCodigoProd(String ano, String codigoProd) {
		return balanceRepository.findByIdAnoAndCodigoProd(ano, codigoProd);
	}
}
