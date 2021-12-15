package com.desafiolatam.f20211215;

public class Celular {
	private String almacenamiento;

	public Celular() {
		super();
	}

	public Celular(String almacenamiento) {
		super();
		this.almacenamiento = almacenamiento;
	}
	
	//metodos
	public static void llamar(){
		
	}
	//get &set
	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "Celular [almacenamiento=" + almacenamiento + "]";
	}


	
}
