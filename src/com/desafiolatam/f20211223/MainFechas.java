package com.desafiolatam.f20211223;

import java.util.Scanner;

public class MainFechas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
		String fecha1 = sc.nextLine();
		System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
		String fecha2 = sc.nextLine();
		/*Guardar cada parte de la fecha como integer, 
		 * es decir, el día, mes y año. 
		 * Utilizar substring de la clase String.*/
		
		//					30/12/2021 
		System.out.println(fecha1.substring(6));//(0,2); (3,5); (6)
	}
}
