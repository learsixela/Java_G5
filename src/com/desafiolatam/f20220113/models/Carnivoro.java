package com.desafiolatam.f20220113.models;

public class Carnivoro extends Animal{
	//Carnivoro hereda(extends) metodos y atributos de Animal
	//metodos heredados: hacerSonido(), caminar() y dormir()
	//caminar() y dormir(), obligado a implementarlos por ser metodos abstractos
	
	@Override
	public void caminar() {

	}

	@Override
	public void dormir() {
	
	}

	public void haceSonido() {
		System.out.println("grrrr...");
	}


}
