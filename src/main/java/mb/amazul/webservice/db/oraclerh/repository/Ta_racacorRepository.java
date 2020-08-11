package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_racacor;

@Repository
public interface Ta_racacorRepository extends JpaRepository<Ta_racacor, Long>{

	List<Ta_racacor> findAllByOrderByNome();

}
