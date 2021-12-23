package com.desafiolatam.f20211223;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero de primeros pares a mostrar");
		int n = sc.nextInt();
		
		// X%2==0; es par
		//n=4 -> 0,2,4,6
		//n=6 -> 0,2,4,6,8,10
		int cantidadPares = 0;//2
		int numero = 0;//3
		while (cantidadPares < n) {//0<2
			if(numero%2==0) {
				System.out.println(numero);
				cantidadPares++;
			}
			numero++;
		}
		System.out.println();
		
		int cantPares = 0;
		for (int i = 0; cantPares < n; i++) {
			if(i%2==0) {
				System.out.println(i);
				cantPares++;
			}
		}
		
		

	}

}
