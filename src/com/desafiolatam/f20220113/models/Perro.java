package com.desafiolatam.f20220113.models;

import com.desafiolatam.f20220113.interfaces.MetodosInterface;

public class Perro extends Animal  implements MetodosInterface{
	public void haceSonido() {
		System.out.println("Guau Guau");
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		System.out.println("duerme 14 horas al dia");
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
}
