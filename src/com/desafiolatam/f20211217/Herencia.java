package com.desafiolatam.f20211217;

import com.desafiolatam.f20211217.models.Camioneta;
import com.desafiolatam.f20211217.models.Sedan;
import com.desafiolatam.f20211217.models.Vehiculo;

public class Herencia {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		Camioneta camioneta = new Camioneta("Azul",245.0f,4,2.4f,"3000lts");
		Vehiculo vehiculo = new Vehiculo();

		camioneta.setColor("Negra");
		System.out.println(camioneta.toString());
		System.out.println(vehiculo.toString());
	}

}
