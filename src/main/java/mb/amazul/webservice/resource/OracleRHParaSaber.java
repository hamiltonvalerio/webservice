package mb.amazul.webservice.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mb.amazul.webservice.db.oraclerh.model.Cs_Classes;
import mb.amazul.webservice.db.oraclerh.model.Do_funcionarios;
import mb.amazul.webservice.db.oraclerh.model.Fp_Turnos;
import mb.amazul.webservice.db.oraclerh.model.Ta_niveisescolaridade;
import mb.amazul.webservice.db.oraclerh.repository.Cs_ClassesRepository;
import mb.amazul.webservice.db.oraclerh.repository.Do_funcionariosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Fp_TurnosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_niveisescolaridadeRepository;



@RestController
public class OracleRHParaSaber {


    @Autowired
    private Do_funcionariosRepository do_funcionariosRepository;
    
    @Autowired
    private Ta_niveisescolaridadeRepository ta_nivelescolaridadeRepository; 
   	
    
    /*
	 * @Autowired private Tb_usuarioRepository tb_usuarioRepository;
	 */
    
	/*
	 * @Autowired private Gn_pessoasRepository Gn_pessoasRepository;
	 */
    
	/*
	 * @Autowired private   Gn_pessoasJurRepository;
	 */
    
	/*
	 * @Autowired private UsersRepository usersRepository;
	 */
    
	

    @GetMapping(value = "/oraclerh")
    public ResponseEntity<List<Do_funcionarios>> testOracle() {
        return ResponseEntity.ok(do_funcionariosRepository.findAll());
    }
    
    
    @GetMapping(value = "/listaescolaridade")
    public ResponseEntity<List<Ta_niveisescolaridade>> listaEscolaridade(){
    	return ResponseEntity.ok(ta_nivelescolaridadeRepository.findAll());
    }
	
	@GetMapping(value = "/listafuncionarioparasaber") 
	public ResponseEntity<List<Do_funcionarios>> listaFuncionarioParaSaber(){
	  return ResponseEntity.ok(do_funcionariosRepository.findAll()); 
	}
	 
	@RequestMapping(value = "/testeJson")
	@ResponseBody
	public List<Do_funcionarios> getAllEmployeesJSON(Model model){
	    return do_funcionariosRepository.getFunParaSaber();
	}
    
}
