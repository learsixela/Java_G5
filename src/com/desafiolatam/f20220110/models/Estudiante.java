package com.desafiolatam.f20220110.models;

public class Estudiante extends Persona {

	private float puntaje;

	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String rut, float altura) {
		super(nombre, rut, altura);
		
	}

	public Estudiante(float puntaje) {
		super();
		this.puntaje = puntaje;
	}

	public Estudiante(String nombre, String rut, float altura, float puntaje) {
		super(nombre, rut, altura);
		this.puntaje = puntaje;
	}

	public float getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Estudiante [puntaje=" + puntaje + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int sumaPadre() {
		return 3+4;
	}
	
	
}
