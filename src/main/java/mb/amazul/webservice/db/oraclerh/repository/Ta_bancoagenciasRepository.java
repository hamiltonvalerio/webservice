package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_bancoagencias;

@Repository
public interface Ta_bancoagenciasRepository extends JpaRepository<Ta_bancoagencias, Long>{

	List<Ta_bancoagencias> findAllByOrderByNome();

}
