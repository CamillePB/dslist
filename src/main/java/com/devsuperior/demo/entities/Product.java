package com.devsuperior.demo.entities;

public class Product {

	private Long id;
	private String nome;
	private Double price;
	
	private Department department;
	
	public Product() { 
		//contrutor sem argumentos
		//criar objetos sem instanciar dados
	}
	
	public Product(Long id, String nome, Double price, Department department) {
		this.id = id;
		this.nome = nome;
		this.price = price;
		this.department = department;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
