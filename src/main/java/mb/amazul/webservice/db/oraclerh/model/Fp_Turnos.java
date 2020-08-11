package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "FP_TURNOS")
public class Fp_Turnos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4523147853374990169L;
	
	@Id
	private Long handle;
	private String nome;
	private String horassemana;
	
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
	public String getHorassemana() {
		return horassemana;
	}
	public void setHorassemana(String horassemana) {
		this.horassemana = horassemana;
	}
	
	
}
