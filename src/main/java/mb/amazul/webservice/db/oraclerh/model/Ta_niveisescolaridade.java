package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "TA_NIVEISESCOLARIDADE")
public class Ta_niveisescolaridade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2808774314833574993L;
	
	@Id
	private Long Handle;
	private String nome;
	private Integer k_codamazulprev;
	public Long getHandle() {
		return Handle;
	}
	public void setHandle(Long handle) {
		Handle = handle;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getK_codamazulprev() {
		return k_codamazulprev;
	}
	public void setK_codamazulprev(Integer k_codamazulprev) {
		this.k_codamazulprev = k_codamazulprev;
	}
	
	
	
}
