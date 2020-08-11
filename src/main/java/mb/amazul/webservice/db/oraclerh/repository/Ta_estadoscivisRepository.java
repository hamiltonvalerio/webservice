package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_estadoscivis;

@Repository
public interface Ta_estadoscivisRepository extends JpaRepository<Ta_estadoscivis, Long>{

	List<Ta_estadoscivis> findAllByOrderByNome();

}
