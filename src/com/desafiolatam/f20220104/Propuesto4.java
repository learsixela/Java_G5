package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Propuesto4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Ana");

		ArrayList<String> nombresEliminados = new ArrayList<String>();
		int opcion = 0;
		int contador = 0;
		ArrayList<String> nombresABuscar = new ArrayList<String>();

		do {
			System.out.println("Ingrese un nombre a buscar");
			String nombreIngresado = sc.nextLine();
			nombresABuscar.add(nombreIngresado);

			System.out.println("Desea ingresar otra nombre");
			System.out.println("0.- SI");
			opcion = sc.nextInt();
			sc.nextLine();
		} while (opcion == 0);

		System.out.println("a buscar " + nombresABuscar);

		// for de for o for anidado
		/*
		 * for (Iterator iterator = nombresABuscar.iterator(); iterator.hasNext();) {
		 * String abuscar = (String) iterator.next();
		 * 
		 * for (java.util.Iterator iterator2 = nombres.iterator(); iterator2.hasNext();)
		 * { String nombre = (String) iterator2.next();
		 * 
		 * if(abuscar.equalsIgnoreCase(nombre)) {
		 * System.out.println("nombre encontrado " + nombre); }
		 * 
		 * }
		 * 
		 * }
		 */
		for (String nombre : nombres) {
			for (String nbuscar : nombresABuscar) {

				if (nbuscar.equalsIgnoreCase(nombre)) {
					System.out.println("nombre encontrado " + nombre);
				}
			}
		}

		for (int i = 0; i < nombresABuscar.size(); i++) {			
			for (int j = 0; j < nombres.size(); j++) {
				if(nombresABuscar.get(i).equals(nombres.get(j))){
					System.out.println("nombre encontrado " + nombres.get(j));
				}
				
			}
		}

		System.out.println("arreglo nombres: " + nombres);
		System.out.println("nombres eliminados " + nombresEliminados);

	}

}
