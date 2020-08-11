package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "RH_AMAZUL", name = "ADM_HIERARQUIAS")
public class Adm_Hieraquias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3685641315997051973L;
	
	@Id
	private Long handle;
	private String nome;
	private String estrutura;
	private String ultimonivel;
	private String unidade;
	
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
	public String getEstrutura() {
		return estrutura;
	}
	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}
	public String getUltimonivel() {
		return ultimonivel;
	}
	public void setUltimonivel(String ultimonivel) {
		this.ultimonivel = ultimonivel;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}
