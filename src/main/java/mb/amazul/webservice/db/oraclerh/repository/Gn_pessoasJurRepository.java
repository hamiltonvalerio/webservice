package mb.amazul.webservice.db.oraclerh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Gn_pessoasJur;

@Repository
public interface Gn_pessoasJurRepository extends JpaRepository<Gn_pessoasJur, Long>{

}
