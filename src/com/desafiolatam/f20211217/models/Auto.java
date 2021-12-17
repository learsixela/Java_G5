package com.desafiolatam.f20211217.models;

public class Auto {
	//atributos
	private String color;
	private float velocidad;
	private int ruedas;
	private Float motor;
	
	//public String nombre;
	//constructores
	public Auto() {
		super();
	}
	public Auto(String color, int ruedas) {
		super();
		this.color = color;
		this.ruedas = ruedas;
	}
	public Auto(String color, Float velocidad, int ruedas, Float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}
	//
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public Float getMotor() {
		return motor;
	}
	public void setMotor(Float motor) {
		this.motor = motor;
	}
	//metodos
	@Override
	public String toString() {
		return "** Mi objeto Auto [Color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas + ", motor=" + motor + "]";
	}
	
	public void miMetodo() {
		System.out.println("Estoy en mi metodo del Auto");
	}
	public void imprimirAlimento(Alimento comida) {
		System.out.println(comida.getComida() +" " + comida.getDescripcion());
		
	}

	
}
