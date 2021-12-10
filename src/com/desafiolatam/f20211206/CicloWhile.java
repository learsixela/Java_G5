package com.desafiolatam.f20211206;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int edad = 0;
		/**
		 * WHILE
		 * */
		System.out.println("Ingrese edad");
		edad = sc.nextInt();
		// termino del while cuando la condicion es false
		while(edad >=18) {
			System.out.println("Dentro del while");
			contador = contador + 1;
			
			if(contador == 5) {
				edad = 0;
			}			
		}
		System.out.println("Fuera del while");
		
		sc.close();
	}

}
