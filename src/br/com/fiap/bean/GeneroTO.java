package br.com.fiap.bean;

public class GeneroTO {
	private char id;
	private String nome;
	
	public GeneroTO(char id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
