package com.desafiolatam.f20220112;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.desafiolatam.f20220112.models.Cancion;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cancion> wurlitzer = new ArrayList<Cancion>();
		
		//intancias de cancion
		Cancion cancion0 = new Cancion();
		cancion0.setNombre("Fredy turbina");
		cancion0.setGenero("Folck");
		cancion0.setDuracion("00:03:00");
		
		//creacion 
		Cancion cancion1 = new Cancion("Tangananica tanganana", "rock", "00:02:00");
		Cancion cancion2 = new Cancion("Mi muñeca me hablo", "rock", "00:02:10");
		Cancion cancion3 = new Cancion("Delirio Espiritual", "rock", "00:03:10");
		Cancion cancion4 = new Cancion("Mi vecino pepe", "rock", "00:02:20");
		
		//agregamos al listado
		wurlitzer.add(cancion0);
		wurlitzer.add(cancion1);
		wurlitzer.add(cancion2);
		wurlitzer.add(cancion3);
		wurlitzer.add(cancion4);
		
		int contador = 1;
		
		//recorremos el arreglo
		for (Cancion cancion : wurlitzer) {
			System.out.println(contador+" "+cancion.getNombre());
			contador++;
		}
		
		System.out.println();
		
		int opcion = 0;
		try {
			System.out.println("Seleccione el numero de la canción");
			opcion = sc.nextInt();
			
		} catch (InputMismatchException ime) {
			System.out.println("Error de ingreso de datos");
		}
		
		try {
			System.out.println(wurlitzer.get(opcion-1));
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("No se encuentra la cancion");
		}
		
		
		
		
	}

}