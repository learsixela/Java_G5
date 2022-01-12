package com.desafiolatam.f20211221;

import com.desafiolatam.f20211221.models.Gato;
import com.desafiolatam.f20211221.models.Mascota;
import com.desafiolatam.f20211221.models.Perro;

public class MascotasMain {

	public static void main(String[] args) {
		
		//Mascota mascota = new Mascota();
		
		//System.out.println(mascota.toString());
		
		Perro perro = new Perro();
		System.out.println(perro.horasSuenio());
		
		Gato gato = new Gato();
		System.out.println(gato.horasSuenio());
		
		/***/
		
		Mascota mascota1 = new Gato();
		System.out.println("gatito "+mascota1.horasSuenio());
		
		Mascota mascota2 = new Perro();
		System.out.println("perrito "+mascota2.horasSuenio());
		
		//Perro guau = new Mascota();
	}

}
