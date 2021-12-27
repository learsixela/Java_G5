package com.desafiolatam.f20211227.models;

public abstract class Omnivoro extends Animal{
	private String comidaFavoritas;

	public Omnivoro() {
		super();
	}

	public Omnivoro(String comidaFavoritas) {
		super();
		this.comidaFavoritas = comidaFavoritas;
	}

	public String getComidaFavoritas() {
		return comidaFavoritas;
	}

	public void setComidaFavoritas(String comidaFavoritas) {
		this.comidaFavoritas = comidaFavoritas;
	}
	
	public void metodoOmnivoro() {
		System.out.println("Metodo Omnivoro");
	}
	
	
}
