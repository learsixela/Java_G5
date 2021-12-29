package com.desafiolatam.f20211227.models;

import java.util.List;

public abstract class Carnivoro extends Animal{
	private List<String> carnesFavoritas;

	public List<String> getCarnesFavoritas() {
		return carnesFavoritas;
	}

	public void setCarnesFavoritas(List<String> carnesFavoritas) {
		this.carnesFavoritas = carnesFavoritas;
	}
	
	
}
