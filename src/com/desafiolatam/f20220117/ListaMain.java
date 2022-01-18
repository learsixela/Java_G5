package com.desafiolatam.f20220117;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import com.desafiolatam.f20220117.models.Ciudad;

public class ListaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Ciudad> ciudades = new ArrayList<>();
		int opcion = 0;
		do {
			System.out.println("Ingrese nombre de ciudad");
			String nombreCiudad = sc.nextLine();
			System.out.println("Ingrese region de ciudad");
			String nombreRegion= sc.nextLine();
			
			Ciudad ciudad = new Ciudad(nombreCiudad, nombreRegion);
			ciudades.add(ciudad);
			System.out.println("Ingrese un numero mayor a cero para repetir");
			System.out.println("(0) Salir");
			opcion = sc.nextInt();
			sc.nextLine();
		}while(opcion > 0);
		
		System.out.println(ciudades);
		
		for (Ciudad ciudad : ciudades) {
			System.out.println("Nombre ciudad: "+ciudad.getNombre());
			System.out.println("Nombre Region: "+ ciudad.getRegion());
			System.out.println();
		}
		
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println("Nombre ciudad: "+ciudades.get(0).getNombre());
			System.out.println("Nombre Region: "+ ciudades.get(0).getRegion());
			System.out.println();
		} 
		

		boolean existe = false;
		
		System.out.println("ingrese region a buscar" );
		String regionBuscar = sc.nextLine();
		
		ciudades.indexOf(regionBuscar);
		for (Iterator iterator = ciudades.iterator(); iterator.hasNext();) {
			Ciudad ciudad = (Ciudad) iterator.next();
			//System.out.println("Nombre ciudad: "+ciudad.getNombre());
			//System.out.println("Nombre Region: "+ ciudad.getRegion());
			System.out.println();
			if(ciudad.getRegion().equalsIgnoreCase(regionBuscar)) {
				existe = true;
			}
		}
		
		if(existe) {
			System.out.println("la Region existe en la lista");
		}else {
			System.out.println("Region no existe");
		}
		
		/**
		 * listIterator
		 * */
		
		ListIterator<Ciudad> ciudadesIterator = ciudades.listIterator();
		ciudadesIterator.hasNext();//true o false
		
		while(ciudadesIterator.hasNext()) {
			//ciudadesIterator.next() -> objeto ciudad
			Ciudad ciudadI = ciudadesIterator.next();
			System.out.println(ciudadI);
			System.out.println(ciudadI.getNombre());
			System.out.println(ciudadI.getRegion());
			System.out.println();
		}
		
		//recorrer en orden inverso
		while(ciudadesIterator.hasPrevious()) {
			Ciudad ciudadPrevius = ciudadesIterator.previous();
			System.out.println(ciudadPrevius);
		}
	}

}
