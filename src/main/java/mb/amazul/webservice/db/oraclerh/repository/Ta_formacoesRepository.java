package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_formacoes;

@Repository
public interface Ta_formacoesRepository extends JpaRepository<Ta_formacoes, Long>{
	@Modifying
	@Query(value ="insert into ta_formacoes (HANDLE,NOME,AREA,GRAU,K_SIESTCODIGO) VALUES (SEQ_TA_FORMACOES.NEXTVAL,:nome,28,8,'99999999')", nativeQuery = true)
	@Transactional
	Integer inserir(@Param("nome") String nome);

	@Query(value = "SELECT handle, nome FROM ta_formacoes "
			+ "WHERE nome = ':nome'", nativeQuery = true)
	Ta_formacoes getTaFormacaoNovo(@Param("nome") String nome);

	List<Ta_formacoes> findAllByOrderByNome();

	Ta_formacoes findByNome(String trim);
}
