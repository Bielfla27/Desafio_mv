package model;

import java.io.Serializable;

public class ModelCafe implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String comida;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	
	

}
