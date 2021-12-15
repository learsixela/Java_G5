package com.desafiolatam.f20211215.models;

public class Escritorio {
	//atributos
	private Double tamaño;
	private String tipo;
	//constructores
	public Escritorio() {
		super();
	}
	public Escritorio(Double tamaño, String tipo) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
	}
	//get&set
	public Double getTamaño() {
		return tamaño;
	}
	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
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
		return "Escritorio [tamaño=" + tamaño + ", tipo=" + tipo + "]";
	}
	
	//Metodos
	
	/**
	 * iapq - 20211215 - OT12334 se agrega nuevo tributo al objeto
	 * */
}
