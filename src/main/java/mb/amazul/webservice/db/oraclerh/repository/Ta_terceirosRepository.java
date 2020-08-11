package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_terceiros;

@Repository
public interface Ta_terceirosRepository extends JpaRepository<Ta_terceiros, Long> {

	@Modifying
	@Query(value = "insert into ta_terceiros (HANDLE,NOME,PRESTADORTIPO) VALUES (SEQ_TA_TERCEIROS.NEXTVAL,:nome,'E')", nativeQuery = true)
	@Transactional
	Integer inserir(@Param("nome") String nome);

	@Query(value = "SELECT handle, nome FROM ta_terceiros "
			+ "WHERE nome = :nome", nativeQuery = true)
	Ta_terceiros getTaTerceiroNovo(@Param("nome") String nome);

	List<Ta_terceiros> findAllByOrderByNome();

}
