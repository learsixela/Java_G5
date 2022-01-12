package com.desafiolatam.f20220110.models;

public class Persona {
	private String nombre;
	private String rut;
	private float altura;
	private Direccion direccion;

	public Persona() {
		super();
	}
	public Persona(String nombre, String rut, float altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", altura=" + altura + ", direccion=" + direccion + "]";
	}

	public void metodoInicial() {
		System.out.println("Estoy en el objeto padre");
	}
	
	public int sumaPadre() {
		return 2+3;
	}

	
}
