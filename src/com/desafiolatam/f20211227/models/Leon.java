package com.desafiolatam.f20211227.models;

import com.desafiolatam.f20211227.interfaces.Genericos;

public class Leon extends Carnivoro implements Genericos{

	@Override
	public void metodoAnimal() {
		
	}


	@Override
	public int caminar() {
		System.out.println("camina en 4 extremidades");
		return 4;
	}

	@Override
	public int correr() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

}
