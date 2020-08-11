package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Do_funcionarios;

@Repository
public interface Do_funcionariosRepository extends JpaRepository<Do_funcionarios, Long> {

	@Query("SELECT f.handle, f.nome, f.cpfnumero, f.matricula, f.cargo, f.datanascimento, "
			+ "f.dataadmissao, f.rgnumero, f.pisnumero, f.email, f.concurso, f.classificacao, "
			+ "f.unidade, f.situacao,  f.hierarquia, f.nivelescolaridade FROM Do_funcionarios f")
	List<Do_funcionarios> getFunParaSaber();

	@Query("SELECT f.handle, f.nome, f.cpfnumero, f.matricula, f.cargo, f.datanascimento, "
			+ "f.dataadmissao, f.rgnumero, f.pisnumero, f.email, f.concurso, f.classificacao, "
			+ "f.unidade, f.situacao,  f.hierarquia, f.nivelescolaridade FROM Do_funcionarios f "
			+ "WHERE f.matricula = :matricula")
	Do_funcionarios getFunParaPonto(@Param("matricula") String matricula);

	@Modifying
	@Query(value = "INSERT INTO DO_FUNCIONARIOS\r\n"
			+ "(HANDLE,DATAADMISSAO,TURNO,HIERARQUIA,PAIS,SITUACAO,K_FORMATRATAMENTO,TIPOCOLABORADOR,EMPRESA,UNIDADE,NOME,DATANASCIMENTO,ESTADO,MUNICIPIO,RGNUMERO,RGEMISSOR,CPFNUMERO,ESTADOCIVIL,RELIGIAO,SEXO,RACACOR,TIPOSANGUE,EMAIL,CPNUMERO,CPSERIE,CPEMISSOR,PISNUMERO,MATRICULA,SINDICATO)\r\n"
			+ "VALUES (SEQ_DO_FUNCIONARIOS.NEXTVAL,'01112019',40,19015,64,1,1,1,2,56,'ADRIANO RODRIGUES','14061984',26,5055,346304702,100,'466.416.340-19',2,35,'M',8,4,'adriano_rodrigues_fsa@yahoo.com.br','99999','999',182,'853.83995.04-2','123456',20)", nativeQuery = true)
	@Transactional
	Integer insereFun();
}

/*
 * HANDLE, DATAADMISSAO, TURNO, HIERARQUIA, PAIS, SITUACAO, em admissao (fixo)
 * K_FORMATRATAMENTO, fixo TIPOCOLABORADOR, fixo EMPRESA, fixo UNIDADE, NOME,
 * DATANASCIMENTO, ESTADO, MUNICIPIO, RGNUMERO, RGEMISSOR, CPFNUMERO,
 * ESTADOCIVIL, RELIGIAO, SEXO, RACACOR, TIPOSANGUE, EMAIL, CPNUMERO, (numero
 * carteira de trabalho) campo novo CPSERIE, (numero serie carteira de trabalho)
 * campo novo CPEMISSOR, (numero emissor carteira de trabalho) campo novo
 * PISNUMERO, MATRICULA, SINDICATO fixo
 */