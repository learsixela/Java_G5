package com.desafiolatam.f20220106.models;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String direccion;
	//Constructores
	//constructor vacio
	public Persona() {
		super();
	}
	//constructor con parametros
	public Persona(String nombre, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	//Getters&&Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//Metodos
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	public void caminar() {
		
	}
}
