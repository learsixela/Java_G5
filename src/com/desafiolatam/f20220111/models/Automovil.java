package com.desafiolatam.f20220111.models;

public class Automovil {
	//atributos
	private String color;
	private float velocidad;
	private int ruedas;
	private String motor;
	//--
	private Boolean patente;
	private Boolean permisoCirculacion;
	private int revisionTecnica;
	
	
	//constructores
	public Automovil() {
		super();
	}
	
	public Automovil(float velocidad) {
		this.velocidad = velocidad;
	}
	public Automovil(String color) {
		this.motor = color;
	}
	

	
	public Automovil(String color, float velocidad, int ruedas, String motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}
	//Getters&&Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public Boolean getPatente() {
		return patente;
	}

	public void setPatente(Boolean patente) {
		this.patente = patente;
	}

	public Boolean getPermisoCirculacion() {
		return permisoCirculacion;
	}

	public void setPermisoCirculacion(Boolean permisoCirculacion) {
		this.permisoCirculacion = permisoCirculacion;
	}

	public int getRevisionTecnica() {
		return revisionTecnica;
	}

	public void setRevisionTecnica(int revisionTecnica) {
		this.revisionTecnica = revisionTecnica;
	}

	//Metodos
	@Override
	public String toString() {
		return "Automovil [color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas + ", motor=" + motor
				+ "]";
	}
	
	public void circulacionCiudad(int revision,Boolean permiso, Boolean patente ) {
		
		this.revisionTecnica = revision;
		this.permisoCirculacion = permiso;
		this.patente = patente;
		
		//lo mismo
		setRevisionTecnica(revision);
		setPermisoCirculacion(permiso);
		setPatente(patente);

	}
	
	public void arranca() {
		System.out.println("El color es: "+color);
	}
	public void frena() {}
	public void dobla() {}
	
}
