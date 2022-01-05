package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numerosPares = new ArrayList<>();
		int opcion = 0;
		/*while(opcion==0) {
			System.out.println("Ingrese un numero");
			int numero = sc.nextInt();
			if(numero%2 == 0) {//validamos si es par
				numerosPares.add(numero);//guardando directamente dentro del arreglo
			}
			
			System.out.println("Quiere agregar otro numero?\n 0.-SI");
			opcion = sc.nextInt();
		}*/
		
		
		/*do {
			System.out.println("Ingrese un numero");
			int numero = sc.nextInt();
			if(numero%2 == 0) {//validamos si es par
				numerosPares.add(numero);//guardando directamente dentro del arreglo
			}
			
			System.out.println("Quiere agregar otro numero?\n 0.-SI");
			opcion = sc.nextInt();
		}while(opcion==0);*/
		
		for (int i = 0; opcion==0; i++) {
			System.out.println("Ingrese un numero");
			int numero = sc.nextInt();
			if(numero%2 == 0) {//validamos si es par
				numerosPares.add(numero);//guardando directamente dentro del arreglo
			}
			
			System.out.println("Quiere agregar otro numero?\n 0.-SI");
			opcion = sc.nextInt();
		}
		
		System.out.println("Arreglo resultante " + numerosPares);
	}

}