package com.test.cucumberreport.model;

public class Cliente {
	
	private Long id;
	private String name;
	
	public Cliente() {
		this.id = 1000L;
		this.name = "Default";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		name = nome;
	}	
}
