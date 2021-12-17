package com.desafiolatam.f20211216;

import com.desafiolatam.f20211216.models.Automovil;

public class Main {

	public static void main(String[] args) {
		//instancia de la clase automovil
		Automovil automovil = new Automovil();
		System.out.println(automovil.toString());
		automovil.setColor("Rojo");
		automovil.setTipoMaterial("Plastico");
		//automovil.setAltura(3.2d);
		automovil.setAnchura(1.2d);
		System.out.println(automovil.toString());
		
		//instancia de un nuevo automovil
		Automovil automovil2 = new Automovil();
		System.out.println(automovil2.toString());
		System.out.println(automovil.toString());
		System.out.println();
		
		//instancia de un nuevo automovil
		Automovil automovil3 = new Automovil("Azul",4.1d,2.2d,null);
		System.out.println(automovil3.toString());
	}

}