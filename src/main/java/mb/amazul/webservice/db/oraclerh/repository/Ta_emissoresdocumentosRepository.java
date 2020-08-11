package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_emissoresdocumentos;

@Repository
public interface Ta_emissoresdocumentosRepository extends JpaRepository<Ta_emissoresdocumentos, Long>{

	List<Ta_emissoresdocumentos> findAllByOrderByNome();

}
