package com.desafiolatam.f20211217.models;

public class Animal {

	private String nombre;
	private String raza;
	private String color;
	//colaboracion
	private Alimento alimento;
	
	public Animal() {
		super();
	}

	public Animal(String nombre, String raza, String color,Alimento alimento) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.setAlimento(alimento);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
	}
}
