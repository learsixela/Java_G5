package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Propuesto2 {

	public static void main(String[] args) {
		
		agregaElemento();
	}

	//metodos o funciones
	//void -> no retorna informacion
	public static void agregaElemento() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> casa = new ArrayList<>();
		int opcion = 0;//sillones, mesa, sillas,MeSa
		int contador = 0;
		boolean existe = false;
		do {
			System.out.println("Ingrese elemento a la casa");
			String elemento = sc.nextLine();
			
			/*recorrer arreglo*/
			if(casa.size() == 0) {//casa vacia
				casa.add(elemento);
			}else {
				//solo se utiliza para saber si existe o no dentro del arreglo
				for (int i = 0; i < casa.size(); i++) {//casa[i] <->casa.get(i)
					if(casa.get(i).equalsIgnoreCase(elemento)) {
						System.out.println("Elemento ya existe");
						contador++;
						existe = true;
					}
				}
				
				if(contador == 0 ) { //if(!existe) {
					casa.add(elemento);
				}
			}
			

			System.out.println("Quiere agregar otro elemento a la casa?\n 0.-SI");
			opcion = sc.nextInt();
			sc.nextLine();
		}while(opcion==0);
		
		System.out.println("La casa: "+casa);
		//set reemplaza o modifica en esa posicion
		casa.set(0, "Cama");		
		System.out.println("La nueva casa: "+casa);
		
		System.out.println("Cantidad de elementos o tamaño "+ casa.size());//length
		
		//ordenas de mayor a menor o alfabeticamente, ascendente
		Collections.sort(casa);
		System.out.println("La nueva casa ordenada: "+casa);
		//invertir el orden 
		Collections.reverse(casa);
		System.out.println("La nueva casa ordenada reverse: "+casa);
	}
	
	
}
