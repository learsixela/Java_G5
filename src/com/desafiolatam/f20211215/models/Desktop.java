package com.desafiolatam.f20211215.models;

public class Desktop {
	//atributos
	private Double tamanio;
	private String tipo;
	
	//Metodos
	public static String test(String text) {
		return "";
	}
	
	//constructores
	public Desktop() {
		super();
	}
	public Desktop(Double tamanio, String tipo) {
		super();
		this.tamanio = tamanio;
		this.tipo = tipo;
	}
	//get&set
	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}
	
	public String getTipo() { 
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//toString
	@Override
	public String toString() {
		return "Escritorio [tamanio=" + tamanio + ", tipo=" + tipo + "]";
	}


	
}
