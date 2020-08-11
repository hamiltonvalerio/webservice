package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_bancos;

@Repository
public interface Ta_bancosRepository extends JpaRepository<Ta_bancos, Long>{

	List<Ta_bancos> findAllByOrderByNome();


}
