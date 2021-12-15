package com.desafiolatam.f20211215.models;

public class Escritorio {
	//atributos
	private Double tama�o;
	private String tipo;
	//constructores
	public Escritorio() {
		super();
	}
	public Escritorio(Double tama�o, String tipo) {
		super();
		this.tama�o = tama�o;
		this.tipo = tipo;
	}
	//get&set
	public Double getTama�o() {
		return tama�o;
	}
	public void setTama�o(Double tama�o) {
		this.tama�o = tama�o;
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
		return "Escritorio [tama�o=" + tama�o + ", tipo=" + tipo + "]";
	}
	
	//Metodos
	
	/**
	 * iapq - 20211215 - OT12334 se agrega nuevo tributo al objeto
	 * */
}
