package com.desafiolatam.f20220107.models;

public class Cocina {
	//atributos
	private double altura;
	private int cantidadHornillas;
	//constructores
	public Cocina() {
		super();
	}
	public Cocina(double altura, int cantidadHornillas) {
		super();
		this.altura = altura;
		this.cantidadHornillas = cantidadHornillas;
	}
	//getters&&Setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getCantidadHornillas() {
		return cantidadHornillas;
	}
	public void setCantidadHornillas(int cantidadHornillas) {
		this.cantidadHornillas = cantidadHornillas;
	}
	//metodos
	@Override
	public String toString() {
		return "Cocina [altura=" + altura + ", cantidadHornillas=" + cantidadHornillas + "]";
	}
	
	public static String prendeHorno() {
		return "";
	}

}
