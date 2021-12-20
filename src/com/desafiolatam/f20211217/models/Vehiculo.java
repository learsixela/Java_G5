package com.desafiolatam.f20211217.models;

public class Vehiculo {
	//atributos
	private String color;
	private float velocidad;
	private int ruedas;
	private Float motor;
	
	public Vehiculo() {
		super();
	}
	public Vehiculo(String color, float velocidad, int ruedas, Float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}
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
	public Float getMotor() {
		return motor;
	}
	public void setMotor(Float motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas + ", motor=" + motor
				+ "]";
	}
	
	
	
}
