package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "TA_EMISSORESDOCUMENTOS")
public class Ta_emissoresdocumentos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2993438884243855601L;
	
	@Id
	private Long handle;
	private String nome;
	private Integer pais;
	private Integer estado;
	private String sigla;
	
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
	public Integer getPais() {
		return pais;
	}
	public void setPais(Integer pais) {
		this.pais = pais;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	

}
