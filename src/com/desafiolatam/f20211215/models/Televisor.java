package com.desafiolatam.f20211215.models;

public class Televisor {
	//atributos
	private String marca;
	private String definicion;
	
	public static void apagarTelevisor() {
		
	}
	//constructores
	public Televisor() {
		super();
	}

	public Televisor(String marca, String definicion) {
		super();
		this.marca = marca;
		this.definicion = definicion;
	}
	
	//get &set
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDefinicion() {
		return definicion;
	}
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	} 
	//toString
	@Override
	public String toString() {
		return "Televisor [marca=" + marca + ", definicion=" + definicion + "]";
	}
	
}
