package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Para ello debemos pedir al usuario los distintos campos 
			que se requerirán: 
			�? Nombre String
			�? Apellido String
			�? Dirección String
			�? Número Dirección Integer
			�? Ciudad String
			�? Teléfono String
		 * */
		Scanner sc = new Scanner(System.in);

		System.out.println("*******************");
		System.out.println("*    Destinatario *");
		System.out.println("*******************");
		System.out.println("Por favor ingrese los siguientes datos");
		System.out.println();
		System.out.println("Nombre destinatario.");
		String nombre = sc.nextLine();
		System.out.println("Apellido destinatario.");
		String apellido = sc.nextLine();
		System.out.println("Dirección destinatario.");
		String direccion = sc.nextLine();
		System.out.println("Número Dirección destinatario.");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Ciudad destinatario.");
		String ciudad = sc.nextLine();
		System.out.println("Télefono destinatario.");
		String telefono = sc.nextLine();
		
		System.out.println();
		//impresion de los datos capturados
		System.out.println("***********************");
		System.out.println("Los datos del destinatario son:");
		System.out.println("nombre y apellido: "+nombre+" "+apellido+",");
		System.out.println("de dirección: "+direccion+" #"+numero+",");
		System.out.println("en la ciudad de: "+ciudad+",");
		System.out.println("y télefono: "+telefono+".");
		System.out.println("***********************");
		sc.close();
	}

}
