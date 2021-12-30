package com.desafiolatam.f20211229;

import java.util.Scanner;

public class Velocidad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la distancia recorrida");
		float distancia = sc.nextFloat();
		System.out.println("Ingrese el tiempo utilizado");
		float tiempo = sc.nextFloat();
		//v= d/t
		float velocidad = distancia/tiempo;
		
		System.out.println("La velocidad es: "+velocidad+ " km/h");
		
		

	}

}
