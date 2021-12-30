package com.desafiolatam.f20211230;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Condicionales if - else if - else
		// if siempre valida la verdad de la condicion
		System.out.println("Ingrese edad");
		int edad = sc.nextInt();

		if (edad < 18) {
			System.out.println("Usted es menor de edad");
		}

		if (edad < 18) {
			System.out.println("Menor de edad");
		} else {
			System.out.println("Mayor de edad");
		}

		System.out.println("Ingrese un numero");
		int numero = sc.nextInt();

		if (numero == 0) {
			System.out.println("Es igual a cero");
		} else {
			if (numero < 0) {
				System.out.println("Es menor a cero");
			} else {
				System.out.println("Es mayor a cero");
			}
		}
		// variacion
		if (numero == 0) {
			System.out.println("Es igual a cero");
		} else if (numero < 0) {
			System.out.println("Es menor a cero");
		} else if (numero > 0) {
			System.out.println("Es mayor a cero");
		}

	}

}
