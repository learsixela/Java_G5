package com.desafiolatam.f20211229;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		  	● Nombre completo del estudiante.
			● Asignatura.
			● Nombre del Docente.
			● Nota 1.
			● Nota 2.
			● Nota 3
		 * **/
		System.out.println("Ingrese nombre completo del estudiante");
		String estudiante = sc.nextLine();
		System.out.println("Ingrese nombre asignatura");
		String asignatura = sc.nextLine();
		System.out.println("Ingrese nombre del Docente");
		String docente = sc.nextLine();
		
		System.out.println("Ingresa nota 1");
		float nota1 = sc.nextFloat();
		System.out.println("Ingresa nota 2");
		float nota2 = sc.nextFloat();
		System.out.println("Ingresa nota 3");
		float nota3 = sc.nextFloat();
		
		System.out.println();
		System.out.println("*********************************");
		System.out.println("* Estudiante  ** " + estudiante+" *");
		System.out.println("* Docente     ** " + docente+" *");
		System.out.println("* Asignatura  ** " + asignatura+" *");
		System.out.println("*********************************");
		System.out.println("* Nota 1      ** " + nota1+" *");
		System.out.println("* Nota 2      ** " + nota2+" *");
		System.out.println("* Nota 3      ** " + nota3+" *");
		System.out.println("╚══════════════════════════════╝");
	}

}
