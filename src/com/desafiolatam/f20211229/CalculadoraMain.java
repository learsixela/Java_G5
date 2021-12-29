package com.desafiolatam.f20211229;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		String numeroString = sc.nextLine();
		System.out.println(numeroString+10);
		//conversion de String a Integer
		//"5.2" -> 5.2
		int numeroConvertido= Integer.parseInt(numeroString);		
		System.out.println(numeroConvertido + 10);
		
		System.out.println("Ingrese numero 1");
		float a = sc.nextFloat(); //2
		System.out.println("Ingrese numero 2");
		float b = sc.nextFloat(); //3
		System.out.println("a + b es igual a "+ (a+b));
		System.out.println("a * b es igual a "+ (a*b));
		System.out.println("a - b es igual a "+ (a-b));
		System.out.println("a / b es igual a "+ (a/b));
		
		int a2 = 1;
		int b2 = 2;
		/*a esto se le llama cast, es una transformación de un tipo de
		datos a otro tipo.*/
		System.out.println((float)a2/b2);
		

	}

}
