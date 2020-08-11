package mb.amazul.webservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mb.amazul.webservice.db.oraclerh.model.Adm_Hieraquias;
import mb.amazul.webservice.db.oraclerh.model.Adm_Unidades;
import mb.amazul.webservice.db.oraclerh.model.Cs_Cargos;
import mb.amazul.webservice.db.oraclerh.model.Cs_Classes;
import mb.amazul.webservice.db.oraclerh.model.Do_funcionarios;
import mb.amazul.webservice.db.oraclerh.model.Fp_Turnos;
import mb.amazul.webservice.db.oraclerh.model.Fp_raisdesligamentotipos;
import mb.amazul.webservice.db.oraclerh.model.Ta_areasconhecimento;
import mb.amazul.webservice.db.oraclerh.model.Ta_bancoagencias;
import mb.amazul.webservice.db.oraclerh.model.Ta_bancos;
import mb.amazul.webservice.db.oraclerh.model.Ta_emissoresdocumentos;
import mb.amazul.webservice.db.oraclerh.model.Ta_estadoscivis;
import mb.amazul.webservice.db.oraclerh.model.Ta_formacoes;
import mb.amazul.webservice.db.oraclerh.model.Ta_grausensino;
import mb.amazul.webservice.db.oraclerh.model.Ta_niveisescolaridade;
import mb.amazul.webservice.db.oraclerh.model.Ta_racacor;
import mb.amazul.webservice.db.oraclerh.model.Ta_religioes;
import mb.amazul.webservice.db.oraclerh.model.Ta_terceiros;
import mb.amazul.webservice.db.oraclerh.model.Ta_tipossangue;
import mb.amazul.webservice.db.oraclerh.repository.Adm_HierarquiasRepository;
import mb.amazul.webservice.db.oraclerh.repository.Adm_UnidadesRepository;
import mb.amazul.webservice.db.oraclerh.repository.Cs_CargosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Cs_ClassesRepository;
import mb.amazul.webservice.db.oraclerh.repository.Do_funcionariosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Fp_TurnosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Fp_raisdesligamentotiposRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_areasconhecimentoRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_bancoagenciasRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_bancosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_emissoresdocumentosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_estadoscivisRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_formacoesRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_grausensinoRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_niveisescolaridadeRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_racacorRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_religioesRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_terceirosRepository;
import mb.amazul.webservice.db.oraclerh.repository.Ta_tipossangueRepository;

@RestController
public class OracleParaSiscad {

	@Autowired
	private Do_funcionariosRepository do_funcionariosRepository;

	@Autowired
	private Ta_bancoagenciasRepository bancoagenciasRepository;

	@Autowired
	private Ta_bancosRepository bancosRepository;

	@Autowired
	private Ta_emissoresdocumentosRepository emissoresdocumentosRepository;

	@Autowired
	private Ta_estadoscivisRepository estadoscivisRepository;

	@Autowired
	private Ta_formacoesRepository formacoesRepository;

	@Autowired
	private Ta_niveisescolaridadeRepository niveisescolaridadeRepository;

	@Autowired
	private Ta_racacorRepository racacorRepository;

	@Autowired
	private Ta_religioesRepository religioesRepository;

	@Autowired
	private Ta_terceirosRepository terceirosRepository;

	@Autowired
	private Ta_tipossangueRepository tipossangueRepository;

	@Autowired
	private Fp_raisdesligamentotiposRepository raisdesligamentotiposRepository;

	@Autowired
	private Ta_grausensinoRepository grausensinoRepository;

	@Autowired
	private Ta_areasconhecimentoRepository areasconhecimentoRepository;

	@Autowired
	private Cs_CargosRepository cs_cargosrepository;

	@Autowired
	private Adm_UnidadesRepository adm_unidadesrepository;

	@Autowired
	private Adm_HierarquiasRepository adm_hierarquiasrepository;

	@Autowired
	private Cs_ClassesRepository cs_classesRepository;

	@Autowired
	private Fp_TurnosRepository fp_turnosRepository;

	@GetMapping(value = "/bancoagencias")
	public ResponseEntity<List<Ta_bancoagencias>> bancoagencias() {
		return ResponseEntity.ok(bancoagenciasRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/bancos")
	public ResponseEntity<List<Ta_bancos>> bancos() {
		return ResponseEntity.ok(bancosRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/emissoresdocumentos")
	public ResponseEntity<List<Ta_emissoresdocumentos>> emissoresdocumentos() {
		return ResponseEntity.ok(emissoresdocumentosRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/estadoscivis")
	public ResponseEntity<List<Ta_estadoscivis>> estadoscivis() {
		return ResponseEntity.ok(estadoscivisRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/niveisescolaridade")
	public ResponseEntity<List<Ta_niveisescolaridade>> niveisescolaridade() {
		return ResponseEntity.ok(niveisescolaridadeRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/racacor")
	public ResponseEntity<List<Ta_racacor>> racacor() {
		return ResponseEntity.ok(racacorRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/religioes")
	public ResponseEntity<List<Ta_religioes>> religioes() {
		return ResponseEntity.ok(religioesRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/terceiros")
	public ResponseEntity<List<Ta_terceiros>> terceiros() {
		return ResponseEntity.ok(terceirosRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/tipossangue")
	public ResponseEntity<List<Ta_tipossangue>> tipossangue() {
		return ResponseEntity.ok(tipossangueRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/raisdesligamentotipos")
	public ResponseEntity<List<Fp_raisdesligamentotipos>> raisdesligamentotipos() {
		return ResponseEntity.ok(raisdesligamentotiposRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/funcionarioponto")
	@ResponseBody
	public ResponseEntity<Do_funcionarios> funcionarioponto(@RequestParam("matricula") String matricula) {
		return ResponseEntity.ok(do_funcionariosRepository.getFunParaPonto(matricula));
	}

	@GetMapping(value = "/formacoes")
	public ResponseEntity<List<Ta_formacoes>> formacoes() {
		return ResponseEntity.ok(formacoesRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/grausensino")
	public ResponseEntity<List<Ta_grausensino>> grausensino() {
		return ResponseEntity.ok(grausensinoRepository.findAll());
	}

	@GetMapping(value = "/areasconhecimento")
	public ResponseEntity<List<Ta_areasconhecimento>> areasconhecimento() {
		return ResponseEntity.ok(areasconhecimentoRepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/listacargos")
	public ResponseEntity<List<Cs_Cargos>> listaCargos() {
		return ResponseEntity.ok(cs_cargosrepository.findAllByOrderByTitulo());
	}

	@GetMapping(value = "/listaunidades")
	public ResponseEntity<List<Adm_Unidades>> listaUnidades() {
		return ResponseEntity.ok(adm_unidadesrepository.findAllByOrderByNome());
	}

	@GetMapping(value = "/listaunidadesativas")
	public ResponseEntity<List<Adm_Unidades>> listaUnidadesAtivas() {
		return ResponseEntity.ok(adm_unidadesrepository.findAllByEmpresaOrderByNome(2));
	}

	@GetMapping(value = "/listahierarqs")
	public ResponseEntity<List<Adm_Hieraquias>> listaHierarquias(String unidade) {
		return ResponseEntity.ok(adm_hierarquiasrepository
				.findDistinctEstruturaByUltimonivelAndUnidadeOrderByEstruturaAsc("S", unidade));
	}

	@GetMapping(value = "/listahierarquias")
	public ResponseEntity<List<Adm_Hieraquias>> listaHier(String unidade) {
		return ResponseEntity.ok(adm_hierarquiasrepository.findDistinctEstruturaByUltimonivelOrderByEstruturaAsc("S"));
	}

	@GetMapping(value = "/listaniveis")
	public ResponseEntity<List<Cs_Classes>> listaNiveis() {
		return ResponseEntity.ok(cs_classesRepository.findByEmpresaOrderByNome(2));
	}

	@GetMapping(value = "/listaturnos")
	public ResponseEntity<List<Fp_Turnos>> listaTurnos() {
		return ResponseEntity.ok(fp_turnosRepository.findAllByOrderByNome());
	}
/*
	@PostMapping(value = "/insereformacao")
	public void createFormacao(String teste) {
		Integer t = 0;
		try {
			t = formacoesRepository.inserir(teste.trim());
		} catch (Exception e) {
			System.out.println("causa:" + e.getCause());

		}

		Ta_formacoes ta = new Ta_formacoes();
		if (t != null && t == 1) {
			try {
				// ta = formacoesRepository.getTaFormacaoNovo(teste.trim());
				ta = formacoesRepository.findByNome(teste.trim());
			} catch (Exception e) {
				System.out.println("causa:" + e.getCause());
			}
		}

	}
*/
	@PostMapping(value = "/insereformacao")
	@ResponseBody
	public ResponseEntity<Ta_formacoes> createFormacao(@RequestBody Ta_formacoes ta_formacoes) {
		Integer t = 0;
		try {
			t = formacoesRepository.inserir(ta_formacoes.getNome().trim());
		} catch (Exception e) {
			System.out.println("causa:" + e.getCause());
		}

		Ta_formacoes ta = new Ta_formacoes();
		if (t != null && t == 1) {
			try {
				ta = formacoesRepository.findByNome(ta_formacoes.getNome().trim());
			} catch (Exception e) {
				System.out.println("causa:" + e.getCause());
			}
		}
		return ResponseEntity.ok(ta);
	}

	@PostMapping(value = "/insereterceiro")
	@ResponseBody
	public ResponseEntity<Ta_terceiros> createTerceiro(@RequestBody Ta_terceiros ta_terceiros) {
		Integer t = terceirosRepository.inserir(ta_terceiros.getNome().trim());
		Ta_terceiros ta = new Ta_terceiros();
		if (t != null && t == 1) {
			ta = terceirosRepository.getTaTerceiroNovo(ta_terceiros.getNome().trim());
		}
		return ResponseEntity.ok(ta);
	}

	@PostMapping(value = "/inserefun")
	@ResponseBody
	public ResponseEntity<Do_funcionarios> createFun(@RequestBody Do_funcionarios do_funcionarios) {
		Integer t = do_funcionariosRepository.insereFun();
		Do_funcionarios fun = new Do_funcionarios();
		if (t != null && t == 1) {
			fun = new Do_funcionarios();
		}
		return ResponseEntity.ok(fun);
	}

}
