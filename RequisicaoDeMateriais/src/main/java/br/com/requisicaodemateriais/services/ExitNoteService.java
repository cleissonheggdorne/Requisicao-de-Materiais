package br.com.requisicaodemateriais.services;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.requisicaodemateriais.dtos.ExitNoteDTO;
import br.com.requisicaodemateriais.entities.Branch;
import br.com.requisicaodemateriais.entities.ExitNote;
import br.com.requisicaodemateriais.entities.User;
import br.com.requisicaodemateriais.entities.compositekeys.ExitNoteId;
import br.com.requisicaodemateriais.entities.projections.ExitNoteProjection;
import br.com.requisicaodemateriais.repositories.ExitNoteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ExitNoteService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	protected EntityManager entityManager;
	
	final ExitNoteRepository exitNoteRepository;
	final AllocationService allocationService;
	final ExitTypeService exitTypeService;
	final UserService userService;
	final SystemService systemService;
	final LocaleNameService localeNameService;
	final WarehouseService warehouseService;
	final GeneralService generalService;
	final BranchService branchService;
	
	
	public ExitNoteService(ExitNoteRepository exitNoteRepository, AllocationService allocationService,
			ExitTypeService exitTypeService, UserService userService, SystemService systemService,
			LocaleNameService localeNameService, WarehouseService warehouseService, GeneralService generalService,
			BranchService branchService) {
		this.exitNoteRepository = exitNoteRepository;
		this.allocationService = allocationService;
		this.exitTypeService = exitTypeService;
		this.userService = userService;
		this.systemService = systemService;
		this.localeNameService = localeNameService;
		this.warehouseService = warehouseService;
		this.generalService = generalService;
		this.branchService = branchService;
	}
	
	public ExitNote save(ExitNoteDTO exitNoteDto) throws ClassServiceException {
		Integer numeroSaida = obterNumeroSaida("001", "001", Integer.toString(LocalDate.now().getYear()));
		//Instância Chave Estrangeira ExitNote
		
		ExitNote exitNote = new ExitNote();
		
		Optional<Branch> branch = Branch.createBranch("001", branchService);
		
		ExitNoteId exitNoteId = new ExitNoteId(branch.get(), Integer.toString(LocalDate.now().getYear()), String.format("%09d",numeroSaida));
		
		exitNote.setId(exitNoteId);
		
		exitNote.setCodigoFicha(exitNoteDto.getCodigoFicha());
		
		exitNote.setCodigoBaixa(exitNoteDto.getCodigoBaixa());
		
		Optional<User> userInfo = User.createUser(exitNoteDto.getUserInfo(), userService);
		exitNote.setUserInfo(userInfo.get());
		
		exitNote.setCodigoLocal(exitNoteDto.getCodigoLocal());
		
		exitNote.setCodigoAlmox(exitNoteDto.getCodigoAlmox());

		exitNote.setCodigoGReceptor(userInfo.get().getPessoa().getCodigoG());
		
 		exitNote.setCodigoGUsuario(userInfo.get().getPessoa().getCodigoG());
		
		exitNote.setDataSaida(new Date());
		
		exitNote.setHoraSaida(Integer.toString(LocalDateTime.now().getHour())+
				Integer.toString(LocalDateTime.now().getMinute())+
				Integer.toString(LocalDateTime.now().getSecond()));
		
		exitNote.setJustificativa(exitNoteDto.getJustificativa());
		return exitNoteRepository.saveAndFlush(exitNote);
	}
	
	public Integer obterNumeroSaida(String codigoEmp, String codigoFil, String ano) {
	  try {
	    StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("proc_sequencial")
	    .registerStoredProcedureParameter(1, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(2, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(3, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(4, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(5, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(6, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(7, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(8, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(9, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(10, String.class, ParameterMode.IN)
	    .registerStoredProcedureParameter(11, String.class, ParameterMode.IN)
	    .setParameter(1, "al_notasaida")
	    .setParameter(2, codigoEmp)
	    .setParameter(3, codigoFil)
	    .setParameter(4, ano)
	    .setParameter(5, "<Null>")
	    .setParameter(6, "<Null>")
	    .setParameter(7, "<Null>")
	    .setParameter(8, "<Null>")
	    .setParameter(9, "<Null>")
	    .setParameter(10, "<Null>")
	    .setParameter(11, "<Null>");
	    
	    storedProcedure.execute();
	    return (Integer) storedProcedure.getSingleResult();
	  }catch(Exception e) {
		  e.getStackTrace();
		  return null;
      }finally {
    	  entityManager.close();
	  }
	}
	
	public List<ExitNoteProjection> findByUserInfo(String codigoUser) {
		Optional<User> user = User.createUser(codigoUser, userService);
		return exitNoteRepository.findByUserInfo(user.get());
	}
}