package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_religioes;

@Repository
public interface Ta_religioesRepository extends JpaRepository<Ta_religioes, Long>{

	List<Ta_religioes> findAllByOrderByNome();

}
