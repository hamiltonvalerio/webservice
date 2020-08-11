package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Fp_Turnos;

@Repository
public interface Fp_TurnosRepository extends JpaRepository<Fp_Turnos, Long>{

	List<Fp_Turnos> findAllByOrderByNome();

}
