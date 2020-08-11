package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Fp_raisdesligamentotipos;

@Repository
public interface Fp_raisdesligamentotiposRepository extends JpaRepository<Fp_raisdesligamentotipos, Long>{

	List<Fp_raisdesligamentotipos> findAllByOrderByNome();

}
