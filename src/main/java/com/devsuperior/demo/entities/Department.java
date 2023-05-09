package com.devsuperior.demo.entities;

public class Department {

	private Long id;
	private String nome;
	
	public Department() {
		//contrutor sem argumentos
				//criar objetos sem instanciar dados
	}
	
	public Department(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
