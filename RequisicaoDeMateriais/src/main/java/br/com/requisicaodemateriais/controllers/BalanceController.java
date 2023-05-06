package br.com.requisicaodemateriais.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.requisicaodemateriais.entities.projections.BalanceProjection;
import br.com.requisicaodemateriais.services.BalanceService;

@RestController
@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
@RequestMapping("/api")
public class BalanceController {
	
	final BalanceService balanceService;
	
	public BalanceController(BalanceService balanceService) {
		this.balanceService = balanceService;
	}
	
	@GetMapping("/findall-itens")
    public ResponseEntity<?> findNoteByUser() {
				
		List<BalanceProjection> balanceList = balanceService.findByQtdGreaterThan();

        return ResponseEntity.ok(balanceList);
    }
	
}
