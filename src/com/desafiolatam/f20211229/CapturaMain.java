package com.desafiolatam.f20211229;

import java.util.Scanner;

public class CapturaMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Ingrese su nombre");
		 String nombre = sc.nextLine();
		 
		 System.out.println("Ingrese su edad");
		 int edad = sc.nextInt();
		 //--
		 System.out.println("Ingrese su altura");
		 float altura = sc.nextFloat();
		 System.out.println("Ingrese su peso");
		 float peso = sc.nextFloat();
		 
		 /***/
		 System.out.println("************************");
		 System.out.println("Hola, "+nombre);
		 System.out.println("su edad es "+edad);
		 System.out.println("su altura es "+altura);
		 System.out.println("su peso es "+peso);
		 System.out.println("************************");
	}

}
