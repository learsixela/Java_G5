package com.desafiolatam.f20211206;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * FOR
		 */
		/* Realizar la tabla de multiplicar desde 2 al 5 */
		System.out.println("********************");
		/*
		 * for(int i = 0;i <= 10;i=i+1) { System.out.println(" 2 x "+ i +" = "+(2*i)); }
		 */
		System.out.println("********************");

		System.out.println("Ingrese el numero de la tabla a mostrar");
		int numero = sc.nextInt();
		for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		//solicitar el ingreso de 3 numeros 
		//e imprimir la suma total de los 3
		int total = 0;//variable acumuladora
		for(int i = 1; i<=3;i++ ) {
			System.out.println("Ingrese un numero");
			int numero1 = sc.nextInt();
			
			total = total + numero1;
		}
		
		System.out.println("La suma total es "+ total);
		
		// i+=1 ; i= i+1 ; i++
		// i+=2 ; i= i+2
		for(int i=5;i>0;i--) {
			System.out.println("segundo "+ i);
		}
	}

}
