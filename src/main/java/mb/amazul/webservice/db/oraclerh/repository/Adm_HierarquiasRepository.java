package mb.amazul.webservice.db.oraclerh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mb.amazul.webservice.db.oraclerh.model.Adm_Hieraquias;

@Repository
public interface Adm_HierarquiasRepository extends JpaRepository<Adm_Hieraquias, Long>{
	List<Adm_Hieraquias> findDistinctEstruturaByUltimonivelAndUnidadeOrderByEstruturaAsc(String ultimonivel, String unidade);

	List<Adm_Hieraquias>  findDistinctEstruturaByUltimonivelOrderByEstruturaAsc(String string);
}
