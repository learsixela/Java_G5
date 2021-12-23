package com.desafiolatam.f20211223;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//solicitud de datos
		System.out.println("Ingrese numero 1:");
		//almacemaniento de dato solicitado
		float numero1 = sc.nextFloat();
		System.out.println("Ingrese numero 2:");
		float numero2 = sc.nextInt();
		System.out.println("Ingrese numero 3:");
		float numero3 = sc.nextInt();
		
		// calculo de la operacion
		float div1 = 1/numero1;
		float div2 = 1/numero2;
		float div3 = 1/numero3;
		
		float suma = div1+div2+div3;
		
		float resultado= 1/suma;
		
		//mostrar el resultado
		System.out.println("El resultado de la suma es: "+resultado);
		
		sc.close();
	}

}