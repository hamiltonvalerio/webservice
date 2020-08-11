package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_tipossangue;

@Repository
public interface Ta_tipossangueRepository extends JpaRepository<Ta_tipossangue, Long>{

	List<Ta_tipossangue> findAllByOrderByNome();

}
