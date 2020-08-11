package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_niveisescolaridade;

@Repository
public interface Ta_niveisescolaridadeRepository extends JpaRepository<Ta_niveisescolaridade, Long>{

	List<Ta_niveisescolaridade> findAllByOrderByNome();

}
