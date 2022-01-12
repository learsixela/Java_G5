package com.desafiolatam.f20220112.desafioexcepciones;

public class Vehiculo {

	private String color;
	private String patente;
	
	public Vehiculo() {
		super();
	}
	public Vehiculo(String color, String patente) {
		super();
		this.color = color;
		this.patente = patente;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", patente=" + patente + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
}
