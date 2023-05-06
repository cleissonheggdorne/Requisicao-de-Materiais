package br.com.requisicaodemateriais.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.requisicaodemateriais.entities.compositekeys.VwBalanceId;
import br.com.requisicaodemateriais.entities.projections.BalanceProjection;
import br.com.requisicaodemateriais.entities.views.VwBalance;

public interface BalanceRepository extends JpaRepository<VwBalance, VwBalanceId> {
	List<BalanceProjection> findByQtdGreaterThan(int saldo);
}
