package com.desafiolatam.f20220107.models;

public class Bateria {
	private int cantidadPlatillos;
	private String tipoPedal;
	private int cantidadCajas;
	public Bateria() {
		super();
	}
	public Bateria(int cantidadPlatillos, String tipoPedal, int cantidadCajas) {
		super();
		this.cantidadPlatillos = cantidadPlatillos;
		this.tipoPedal = tipoPedal;
		this.cantidadCajas = cantidadCajas;
	}
	public int getCantidadPlatillos() {
		return cantidadPlatillos;
	}
	public void setCantidadPlatillos(int cantidadPlatillos) {
		this.cantidadPlatillos = cantidadPlatillos;
	}
	public String getTipoPedal() {
		return tipoPedal;
	}
	public void setTipoPedal(String tipoPedal) {
		this.tipoPedal = tipoPedal;
	}
	public int getCantidadCajas() {
		return cantidadCajas;
	}
	public void setCantidadCajas(int cantidadCajas) {
		this.cantidadCajas = cantidadCajas;
	}
	
	
}
