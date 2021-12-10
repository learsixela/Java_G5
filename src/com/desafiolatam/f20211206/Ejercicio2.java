package com.desafiolatam.f20211206;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Calcular la velocidad de un auto en km/h teniendo 
		la distancia y el tiempo, cabe destacar que puedes 
		usar decimales para la entrada de datos.
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Calculo de velocidad* *");
		System.out.println("Ingrese la distancia");
		Float distancia = sc.nextFloat();
		System.out.println("Ingrese el tiempo");
		Float tiempo = sc.nextFloat();
		//validacion (condicional)
		if(tiempo > 0) {
			System.out.println("La velocidad es (v=d/t) -> "+ distancia/tiempo);
		}else {
			System.out.println("El tiempo no puede ser negativo ni igual a cero");
		}
		sc.close();
		
	}

}
