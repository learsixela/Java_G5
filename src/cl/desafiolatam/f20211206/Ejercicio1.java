package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Para ello debemos pedir al usuario los distintos campos 
			que se requerir谩n: 
			鈼? Nombre String
			鈼? Apellido String
			鈼? Direcci贸n String
			鈼? N煤mero Direcci贸n Integer
			鈼? Ciudad String
			鈼? Tel茅fono String
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
		System.out.println("Direcci贸n destinatario.");
		String direccion = sc.nextLine();
		System.out.println("N煤mero Direcci贸n destinatario.");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Ciudad destinatario.");
		String ciudad = sc.nextLine();
		System.out.println("T茅lefono destinatario.");
		String telefono = sc.nextLine();
		
		System.out.println();
		//impresion de los datos capturados
		System.out.println("***********************");
		System.out.println("Los datos del destinatario son:");
		System.out.println("nombre y apellido: "+nombre+" "+apellido+",");
		System.out.println("de direcci贸n: "+direccion+" #"+numero+",");
		System.out.println("en la ciudad de: "+ciudad+",");
		System.out.println("y t茅lefono: "+telefono+".");
		System.out.println("***********************");
		sc.close();
	}

}
