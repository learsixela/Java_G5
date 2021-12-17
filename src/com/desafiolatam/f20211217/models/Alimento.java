package com.desafiolatam.f20211217.models;

public class Alimento {
	private String comida;
	private String descripcion;
	
	public Alimento() {
		super();
	}
	public Alimento(String comida, String descripcion) {
		super();
		this.comida = comida;
		this.descripcion = descripcion;
	}
	
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
