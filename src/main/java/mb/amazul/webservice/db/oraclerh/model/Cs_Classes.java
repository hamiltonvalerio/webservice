package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "CS_CLASSES")
public class Cs_Classes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6435334378475186123L;

	@Id
	private Long handle;
	private String nome;
	private Integer empresa;
	
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
	public Integer getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}
	
	
}
