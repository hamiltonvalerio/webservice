package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Adm_Unidades;

@Repository
public interface Adm_UnidadesRepository extends JpaRepository<Adm_Unidades, Long>{
	
	List<Adm_Unidades> findAllByEmpresa(Integer i);

	List<Adm_Unidades> findAllByOrderByNome();

	List<Adm_Unidades> findAllByEmpresaOrderByNome(Integer i);
	
}
