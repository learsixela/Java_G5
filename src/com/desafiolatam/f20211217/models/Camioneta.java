package com.desafiolatam.f20211217.models;

public class Camioneta extends Vehiculo {

	private String pickup;
	
	public Camioneta(String pickup) {
		super();
		this.pickup = pickup;
	}

	public Camioneta() {
		super();
	}

	public Camioneta(String color, float velocidad, int ruedas, Float motor,String pickup) {
		super(color, velocidad, ruedas, motor);
		this.pickup = pickup;
	}

	@Override
	public String toString() {
		return "Camioneta ["+super.toString()+"]";
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String misParametros(String texto) {
		return texto  + "";
	}




	
}
