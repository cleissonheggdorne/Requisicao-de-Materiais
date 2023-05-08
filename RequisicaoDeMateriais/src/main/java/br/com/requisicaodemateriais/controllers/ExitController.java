package br.com.requisicaodemateriais.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.requisicaodemateriais.dtos.ExitDTO;
import br.com.requisicaodemateriais.entities.Exit;
import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import br.com.requisicaodemateriais.entities.projections.ExitProjection;
import br.com.requisicaodemateriais.services.ClassServiceException;
import br.com.requisicaodemateriais.services.ExitService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="*", maxAge = 3600) //Permitir ser acessado de Qualquer fonte
@RequestMapping("/api")
public class ExitController {
	
	final ExitService exitService;
	
	public ExitController(ExitService exitService) {
		this.exitService = exitService;
	}
	
	@GetMapping("/find-itens-by-note")
    public ResponseEntity<?> findNoteByUser(@RequestBody ExitNoteId exitNoteId)
//    		@RequestParam("codigo-emp") String codigoEmp,
//    	    @RequestParam("codigo-fil") String codigoFil,
//    	    @RequestParam("ano") String ano,
//    	    @RequestParam("numero-saida") String numeroSaida)
	{
		
		//ExitNoteId exitNoteId = new ExitNoteId(new BranchId(codigoEmp, codigoFil), ano, numeroSaida);
		
		List<ExitProjection> exitList = exitService.findByIdExitNoteId(exitNoteId);

        return ResponseEntity.ok(exitList);
    }
//	
//	@PostMapping("/save-itens-nota")
//    public ResponseEntity<?> saveNote(@RequestBody @Valid ExitDTO exitDto, BindingResult br) throws ClassServiceException {
//		
//		if(br.hasErrors()) {
//			return ResponseEntity.badRequest().body(br.getAllErrors());
//		}
//		Exit exitSave = exitService.save(exitDto);
//        return ResponseEntity.ok(exitNoteSave);
//    }
}
