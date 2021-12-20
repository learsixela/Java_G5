package com.desafiolatam.f20211220;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		double division = 0;
		
		try {
			 Integer numero = sc.nextInt();
			 if(numero.equals(0)) {
				 numero = null;
			 }
			 			 
			division = 3/numero;
			
		} catch (InputMismatchException e) {
			System.out.println("Error de ingreso: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Error matematico: " + e.getMessage());
			division = 0;
		} catch (Exception e) {
			System.out.println("Otro error: "+ e);
		}
		
		System.out.println("El resultado de la division es: "+ division);

		sc.close();
	}

}
