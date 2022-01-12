package com.desafiolatam.f20220112.models;


public class Cancion {
	
	private String nombre;
	private String genero;
	private String duracion;// 00:01:30
	
	public Cancion() {
		super();
	}
	public Cancion(String nombre, String genero, String duracion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + "]";
	}

}
