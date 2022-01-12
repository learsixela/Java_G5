package com.desafiolatam.f20220111.models;

public class CalculoArea {
	private float resultado;//variable de instancia
	public int total;

	public CalculoArea() {
		super();
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	//area de un cuadrado
	public float calculoArea(int lado) {
		resultado = lado * lado;
		return resultado;
	}
	
	//area de un rectangulo
	public int calcularArea(int ancho, int alto) {
		//variables locales
		int resultado = ancho * alto;
		return resultado;
	}
	
	//area triangulo
	public float calculoArea(float base, float altura) {
		
		float resultado = (base * altura)/2;
		
		return resultado;
	}
	
}
