package mb.amazul.webservice.db.oraclerh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Ta_grausensino;

@Repository
public interface Ta_grausensinoRepository extends JpaRepository<Ta_grausensino, Long>{

}
