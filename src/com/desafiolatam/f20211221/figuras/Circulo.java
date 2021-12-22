package com.desafiolatam.f20211221.figuras;

public class Circulo extends Figura{

	private float radio;
	
	public Circulo() {
		super();		
	}

	public Circulo(String color) {
		super(color);
	}
	
	@Override
	public void pintar() {
		System.out.println("Metodo pintar() en Circulo");
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}


	
	
}
