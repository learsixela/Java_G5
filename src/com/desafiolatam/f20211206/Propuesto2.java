package com.desafiolatam.f20211206;

import java.util.Scanner;

public class Propuesto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float nota1 = 0f;
		Float nota2 = 0f;
		Float nota3 = 0f;
		Float promedio = 0f;
		String mensaje = "";
		String estado = "REPROBADO";
		/*
		 * Crear y mostrar en pantalla, una hoja de calificaciones que 
			tendr√° la siguiente informaci√≥n:
			‚ó? Nombre completo del estudiante.
			‚ó? Asignatura.
			‚ó? Nombre del Docente.
			‚ó? Nota 1
			‚ó? Nota 2.
			‚ó? Nota 3
		 * */
		
		System.out.println("Ingrese nombre completo alumno");
		String alumno = sc.nextLine();
		System.out.println("Nombre Asignatura");
		String asignatura= sc.nextLine();
		System.out.println("Ingrese nombre del Docente");
		String docente = sc.nextLine();

		Double n4 = 23446563430d;
		
		do {
			System.out.println("Ingrese nota 1");
			nota1 = sc.nextFloat();			
		}while(nota1 <= 0 || nota1 >7);
		
		
		do {
			System.out.println("Ingrese nota 2");
			nota2 = sc.nextFloat();
		}while(nota2 <= 0 || nota2 >7);
		
		do {
			System.out.println("Ingrese nota 3");
			nota3 = sc.nextFloat();		 
			sc.nextLine();
		}while(nota3 <= 0 || nota3 >7);
		

		promedio = (nota1+nota2+nota3)/3;

		if(promedio < 4) {
			mensaje = "Debes dar una prueba de recuperaci√≥n para poder rendir el examen final";
		}else if (promedio >= 4 && promedio <=5.4) {
			mensaje = "Debes rendir el examen final para aprobar";
			estado = "A EXAMEN";
		}else {
			mensaje = "Felicitaciones! Te eximiste del examen y aprobaste";
			estado = "APROBADO";
		}
		
		System.out.println("******* Hoja Calificiones  *******");
		System.out.println("*Alumno     "+alumno+"            ");
		System.out.println("*Asignatura "+asignatura+"        ");
		System.out.println("*Docente    "+docente+"           ");
		System.out.println("***********************************");
		System.out.println("* Evaluacion **** Calificacion  ***");
		System.out.println("* nota 1     ****    "+ nota1 +"   ***");
		System.out.println("* nota 2     ****    "+ nota2 +"   ***");
		System.out.println("* nota 3     ****    "+ nota3 +"   ***");
		System.out.println("***********************************");
		System.out.println("** PROMEDIO  **** "+Math.round(promedio*100.0)/100.0+"  ******");
		System.out.println("** ESTADO    **** "+estado+"       ***");
		System.out.println("**"+mensaje+"***");
		/*
		if (promedio >= 4) {
			System.out.println("** ESTADO    **** APROBADO       ***");
		}else {
			System.out.println("** ESTADO    **** REPROBADO       ***");
		}
		*/
		System.out.println("***********************************");
		sc.close();
	}

}
