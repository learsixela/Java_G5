package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Dado el siguiente esquema, calcular su área y perímetro 
		 *	en base a la siguiente fórmula:
		 *	Área = L * A
		 * 
		 */ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************************");
		System.out.println("* Calculo de Area (cm) *");
		System.out.println("************************");
		System.out.println();
		System.out.println("Ingrese largo del rectangulo");
		Float largo = sc.nextFloat();
		System.out.println("Ingrese alto del rectangulo");
		Float alto = sc.nextFloat();
		//condicional
		if(largo > 0) {
			
			if(alto > 0) {
				Float area = largo * alto;
				System.out.println("El valor del Area es " + area);				
			}else {
				System.out.println("El valor del alto no puede ser cero o negativo");
			}
			
		} else {
			System.out.println("El valor del largo no puede ser cero o negativo");
		}
		
		sc.close();
	//fin main	
	}
//fin
}
