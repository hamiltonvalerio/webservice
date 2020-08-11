package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_areasconhecimento;

@Repository
public interface Ta_areasconhecimentoRepository extends JpaRepository<Ta_areasconhecimento, Long>{

	List<Ta_areasconhecimento> findAllByOrderByNome();

}
