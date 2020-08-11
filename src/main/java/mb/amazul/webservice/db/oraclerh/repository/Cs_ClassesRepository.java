package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Cs_Classes;

@Repository
public interface Cs_ClassesRepository extends JpaRepository<Cs_Classes, Long>{
	
	public List<Cs_Classes> findByEmpresa(Integer empresa);

	public List<Cs_Classes> findByEmpresaOrderByNome(Integer i);
	
}
