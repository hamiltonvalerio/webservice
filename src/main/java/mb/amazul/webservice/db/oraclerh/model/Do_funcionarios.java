package mb.amazul.webservice.db.oraclerh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(schema = "RH_AMAZUL", name = "Do_funcionarios")
public class Do_funcionarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5330711241083556833L;
	
	@Id
	private Long handle;

	private String dataadmissao;
	
	private String turno;
	
	private String hierarquia;
	
	private String pais;
	
	private String situacao;

	private String k_formatratamento;
	
	private String tipocolaborador;
	
	private String empresa;
	
	private String unidade;
	
	private String nome;
	
	private String datanascimento;
	
	private String estado;
	
	private String municipio;
	
	private String rgnumero;
	
	private String rgemissor;
	
	private String cpfnumero;
	
	private String estadocivil;
	
	private String religiao;
	
	private String sexo;
	
	private String racacor;
	
	private String tiposangue;
	
	private String email;

	private String cpnumero;
	
	private String cpserie;
	
	private String cpemissor;
	
	private String pisnumero;

	private String matricula;
	
	private String sindicato;
	
	//ate aqui
	
	private String cargo;
		
	private String concurso;
	
	private String classificacao;
	
	private String nivelescolaridade;
	
	private String k_nipncp;

	public Long getHandle() {
		return handle;
	}

	public void setHandle(Long handle) {
		this.handle = handle;
	}

	public String getDataadmissao() {
		return dataadmissao;
	}

	public void setDataadmissao(String dataadmissao) {
		this.dataadmissao = dataadmissao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getHierarquia() {
		return hierarquia;
	}

	public void setHierarquia(String hierarquia) {
		this.hierarquia = hierarquia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getK_formatratamento() {
		return k_formatratamento;
	}

	public void setK_formatratamento(String k_formatratamento) {
		this.k_formatratamento = k_formatratamento;
	}

	public String getTipocolaborador() {
		return tipocolaborador;
	}

	public void setTipocolaborador(String tipocolaborador) {
		this.tipocolaborador = tipocolaborador;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getRgnumero() {
		return rgnumero;
	}

	public void setRgnumero(String rgnumero) {
		this.rgnumero = rgnumero;
	}

	public String getRgemissor() {
		return rgemissor;
	}

	public void setRgemissor(String rgemissor) {
		this.rgemissor = rgemissor;
	}

	public String getCpfnumero() {
		return cpfnumero;
	}

	public void setCpfnumero(String cpfnumero) {
		this.cpfnumero = cpfnumero;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRacacor() {
		return racacor;
	}

	public void setRacacor(String racacor) {
		this.racacor = racacor;
	}

	public String getTiposangue() {
		return tiposangue;
	}

	public void setTiposangue(String tiposangue) {
		this.tiposangue = tiposangue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpnumero() {
		return cpnumero;
	}

	public void setCpnumero(String cpnumero) {
		this.cpnumero = cpnumero;
	}

	public String getCpserie() {
		return cpserie;
	}

	public void setCpserie(String cpserie) {
		this.cpserie = cpserie;
	}

	public String getCpemissor() {
		return cpemissor;
	}

	public void setCpemissor(String cpemissor) {
		this.cpemissor = cpemissor;
	}

	public String getPisnumero() {
		return pisnumero;
	}

	public void setPisnumero(String pisnumero) {
		this.pisnumero = pisnumero;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSindicato() {
		return sindicato;
	}

	public void setSindicato(String sindicato) {
		this.sindicato = sindicato;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getConcurso() {
		return concurso;
	}

	public void setConcurso(String concurso) {
		this.concurso = concurso;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getNivelescolaridade() {
		return nivelescolaridade;
	}

	public void setNivelescolaridade(String nivelescolaridade) {
		this.nivelescolaridade = nivelescolaridade;
	}

	public String getK_nipncp() {
		return k_nipncp;
	}

	public void setK_nipncp(String k_nipncp) {
		this.k_nipncp = k_nipncp;
	}
	
	

	
	
}
