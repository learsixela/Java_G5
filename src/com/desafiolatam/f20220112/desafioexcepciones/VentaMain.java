package com.desafiolatam.f20220112.desafioexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VentaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		System.out.println("Ingrese su nombre");
		String nombre= sc.nextLine();
		cliente.setNombre(nombre);
		
		try {
			System.out.println("Ingrese su edad");
			int edad = sc.nextInt();
			cliente.setEdad(edad);
			
			
		} catch (InputMismatchException ime) {
			//System.out.println("Error de ingreso de edad " + ime);
			throw new  InputMismatchException("Error de ingreso de edad ");
		}finally {
			sc.close();
			System.out.println("Venta finalizada...");
		}
		
		
		Vehiculo vehiculo = new Vehiculo("Blanco","HHSS-23");
		
		LibroVenta libroVenta = new LibroVenta("ventaBlanco","12012022");
		
		libroVenta.guardarVenta(cliente, vehiculo);
		
		
		
		
	}

}
