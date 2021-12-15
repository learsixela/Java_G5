package com.desafiolatam.f20211215.models;

public class Cocina {
	//atributos
	private Double altura;
	private int cantidadHornillas;
	
	//metodo
	public static String prendeHorno() {
		return "";
	}

	public Cocina() {
		super();
	}

	public Cocina(Double altura, int cantidadHornillas) {
		super();
		this.altura = altura;
		this.cantidadHornillas = cantidadHornillas;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public int getCantidadHornillas() {
		return cantidadHornillas;
	}

	public void setCantidadHornillas(int cantidadHornillas) {
		this.cantidadHornillas = cantidadHornillas;
	}

	@Override
	public String toString() {
		return "Cocina [altura=" + altura + ", cantidadHornillas=" + cantidadHornillas + "]";
	}

}
