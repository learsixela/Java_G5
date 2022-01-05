package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArreglosDinamicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> vocales = new ArrayList<>(); 
		//agregando un dato al arreglo
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		vocales.add("y");
		vocales.add("qwertyuiop");
		 //elimina elemento por posicion
		vocales.remove(6);
		System.out.println("vocales "+vocales);
		
		/***/
		ArrayList<String> ingredientesPizza = new ArrayList<>();
		ingredientesPizza.add("masa");
		ingredientesPizza.add("queso");
		ingredientesPizza.add("tomate");
		ingredientesPizza.add("pi�a");
		System.out.println("pizza1 "+ingredientesPizza);
		//eliminar elemento por valor
		ingredientesPizza.remove("pi�a");
		System.out.println("pizza2 "+ingredientesPizza);
		
		System.out.println("Ingrese ingrediente a buscar");
		String ingrediente = sc.nextLine();
		
		if(ingredientesPizza.contains(ingrediente.toLowerCase())) {
			System.out.println("ingrediente ya existe");
		}else {
			ingredientesPizza.add(ingrediente);
		}
		System.out.println(ingredientesPizza);
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(44);
		
		System.out.println("arreglo actual "+ vocales);
		ArrayList<String> vocals = new ArrayList<>();
		vocals.add("e");
		vocals.add("o");
		vocals.add("y");
		vocales.removeAll(vocals);
		System.out.println("nuevo arreglo "+ vocales);
		
		//eliminando TODOS los elementos del arreglo
		vocales.clear();
		System.out.println("vocales clear : "+vocales);
		

	}

}
