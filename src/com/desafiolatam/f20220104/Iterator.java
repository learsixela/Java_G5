package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Scanner;

public class Iterator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaFrutas = new ArrayList<String>();
		int opcion = 1;
		
		do {
			System.out.println("Ingrese nombre de una fruta");
			String fruta = sc.nextLine(); 
			listaFrutas.add(fruta);
			
			//-- menu de ingreso de datos nuevamente-
			System.out.println("Desea ingresar otra fruta");
			System.out.println("0.- SI");
			opcion = sc.nextInt();
			sc.nextLine(); 
		} while (opcion==0);
		
		System.out.println(listaFrutas);
		//Iterator
		for (java.util.Iterator iterator = listaFrutas.iterator(); iterator.hasNext();) {
			String fruta = (String) iterator.next();
			System.out.println(" fruta iterator "+fruta);			
		}
		
		// foreach (for de objetos)
		for (String fruta : listaFrutas) {
			System.out.println(" fruta foreach "+fruta);
		}
		
		
		
	}

}
