package com.desafiolatam.f20211216.models;

public class Automovil {
	//atributos
	private String color;
	private Double altura;
	private Double anchura;
	private String tipoMaterial;
	public Automovil() {
		super();
	}
	public Automovil(String color, Double altura, Double anchura, String tipoMaterial) {
		super();
		this.color = color;
		this.altura = altura;
		this.anchura = anchura;
		this.tipoMaterial = tipoMaterial;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getAnchura() {
		return anchura;
	}
	public void setAnchura(Double anchura) {
		this.anchura = anchura;
	}
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	
	@Override
	public String toString() {
		return "Automovil [color=" + color + ", altura=" + altura + ", anchura=" + anchura + ", tipoMaterial="
				+ tipoMaterial + "]";
	}
	
	
}
