package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "FP_RAISDESLIGAMENTOTIPOS")
public class Fp_raisdesligamentotipos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1888764845011060423L;
	
	@Id
	private Long handle;
	private Integer codigo;
	private String nome;
	public Long getHandle() {
		return handle;
	}
	public void setHandle(Long handle) {
		this.handle = handle;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
