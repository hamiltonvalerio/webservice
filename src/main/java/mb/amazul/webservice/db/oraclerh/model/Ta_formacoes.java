package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "TA_FORMACOES")
public class Ta_formacoes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3442983406264365077L;

	@Id
	private Long handle;
	private String nome;
	private Integer area;
	private Integer grau;
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
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getGrau() {
		return grau;
	}
	public void setGrau(Integer grau) {
		this.grau = grau;
	}
	
	
}
