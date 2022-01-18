package com.desafiolatam.f20220117;

public class SingletonMain {

	public static void main(String[] args) {
		InstitutoEducativo desafioLatam = InstitutoEducativo.getSingleton("Desafio Latam");
		System.out.println(desafioLatam.getNombre());
		
		InstitutoEducativo otraOtec = InstitutoEducativo.getSingleton("Chancho");
		System.out.println(otraOtec.getNombre());
		
		//InstitutoEducativo ie = new InstitutoEducativo("otraOtec");
		
	}
}
