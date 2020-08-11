package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Cs_Cargos;

@Repository
public interface Cs_CargosRepository extends JpaRepository<Cs_Cargos, Long>{
	
	List<Cs_Cargos> findAllByOrderByTitulo();

}
