package com.desafiolatam.f20211207;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int numero = sc.nextInt();
		if (esPar(numero)) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}

		System.out.println(esPar2(numero));
		System.out.println("***");
		//llamar todas las veces que sean necesarias a la funcion
		System.out.println(esPar2(4));
		System.out.println(esPar2(7));
		System.out.println(esPar2(88));
		System.out.println("***");
		System.out.println(esPar(77));
		test();
		
		sc.close();
	}

	// void no retorma, solo ejecuta
	// tipo_de_acceso tipo_de_retorno nombre_metodo( parametros) {
	// CODIGO
	// }

	public static boolean esPar(int numero) {
		if (numero % 2 == 0) {// par
			return true;
		} else {
			return false;
		}
	}

	public static String esPar2(int numero) {
		if (numero % 2 == 0) {// par
			return "El numero es par";
		} else {
			return "El numero es impar";
		}
	}
	
	public static void test() {
		System.out.println("Test...");
	}
}
