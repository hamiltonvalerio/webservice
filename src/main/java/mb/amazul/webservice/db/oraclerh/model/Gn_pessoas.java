package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "CORPORATIVO2015", name = "GN_PESSOAS")
public class Gn_pessoas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4936819294699219638L;

	@Id
	private Long handle;
	
	private String nome;
	
	private String apelido;

	public Long getHandle() {
		return handle;
	}

	public void setHandle(Long handle) {
		this.handle = handle;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}