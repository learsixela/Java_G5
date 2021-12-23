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
		//System.out.println(fecha1.substring(6));//(0,2); (3,5); (6)
		int dia1 = Integer.parseInt(fecha1.substring(0,2));//30
		int mes1 = Integer.parseInt(fecha1.substring(3,5));//12
		int anio1 = Integer.parseInt(fecha1.substring(6));//2021
		
		int dia2 = Integer.parseInt(fecha2.substring(0,2));
		int mes2 = Integer.parseInt(fecha2.substring(3,5));
		int anio2 = Integer.parseInt(fecha2.substring(6));
		
		 // si el año es menor, la fecha es mayor 
		
		if(anio1 > anio2) {//2000  > 1980
			System.out.println("Fecha 2 es mas antigua ");
		}else if(anio1 < anio2) {//1980  < 2000
			System.out.println("Fecha 1 es mas antigua ");
		}else {//años iguales
			if(mes1 > mes2) {
				System.out.println("fecha 2 es mayor");
			}else if(mes1 < mes2) {
				System.out.println("fecha 1 es mayor");
			}else {//meses iguales
				if(dia1 > dia2) {
					System.out.println("fecha 2 es mayor");
				}else if(dia1 < dia2) {// 2 < 25
					System.out.println("fecha 1 es mayor");
				}else {//dias iguales
					System.out.println("Es la misma fecha");
				}
			}
		}
		//20/12/2021 fecha 1
		//20/12/2021 fecha 2 

		//2000/12/12
		
	}
}
