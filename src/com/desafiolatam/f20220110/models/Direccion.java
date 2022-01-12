package com.desafiolatam.f20220110.models;

public class Direccion {
	private String nombre;
	private int numero;
	private String ciudad;
	private String region;
	public Direccion() {
		super();
	}
	public Direccion(String nombre, int numero, String ciudad, String region) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.ciudad = ciudad;
		this.region = region;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Direccion [nombre=" + nombre + ", numero=" + numero + ", ciudad=" + ciudad + ", region=" + region + "]";
	}
	

}
