package com.desafiolatam.f20211221.figuras;

public class Triangulo extends Figura{

	private float altura;
	
	public Triangulo() {
		super();
	}

	public Triangulo(String color) {
		super(color);
	}
	
	@Override
	public void pintar() {
		System.out.println("Metodo pintar() en Triangulo");
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void metodoTriangulo() {
		System.out.println("metodo de triangulo");
	}
	
	
}
