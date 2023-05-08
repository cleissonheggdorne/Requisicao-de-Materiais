package br.com.requisicaodemateriais.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.dtos.ExitDTO;
import br.com.requisicaodemateriais.entities.Exit;
import br.com.requisicaodemateriais.entities.Product;
import br.com.requisicaodemateriais.entities.compositekeys.ExitId;
import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import br.com.requisicaodemateriais.entities.projections.ExitProjection;
import br.com.requisicaodemateriais.entities.views.VwBalance;
import br.com.requisicaodemateriais.repositories.ExitRepository;

@Service
public class ExitService {
	
	final ExitRepository exitRepository;
	final BalanceService balanceService;
	final ProductService productService;
	
	public ExitService(ExitRepository exitRepository, BalanceService balanceService, ProductService productService) {
		this.exitRepository = exitRepository;
		this.balanceService = balanceService;
		this.productService = productService;
	}
	
	public List<ExitProjection> findByIdExitNoteId(ExitNoteId exitNoteId){
		return exitRepository.findByIdExitNoteId(exitNoteId);
	}
	
	public void save(List<ExitDTO> exitDtoList, ExitNoteId exitNoteId) {
		
		List<Exit> listExit = new ArrayList<>();
		for(ExitDTO exitDto: exitDtoList) {
			Exit exit = new Exit();
			
			VwBalance balance = balanceService.findByIdAnoAndCodigoProd(Integer.toString(LocalDate.now().getYear()), exitDto.getCodigoProd());
			
			exit.setId(new ExitId(exitNoteId, exitDto.getCodigoProd(), balance.getCodigoLote(), balance.getCodigoEnder()));
			
			Optional<Product> product = productService.findById(exitDto.getCodigoProd());
			
			exit.setDescricao(product.get().getDescricao());
			
			exit.setQtdSolicitada(exitDto.getQtdSolicitada());
						
			exit.setValorUnitario(balance.getValorUnitario());
			
			exit.setValorTotal(exitDto.getQtdSolicitada().multiply(balance.getValorUnitario()));
			
			listExit.add(exit);
		}
		
		exitRepository.saveAllAndFlush(listExit);
	}
}
