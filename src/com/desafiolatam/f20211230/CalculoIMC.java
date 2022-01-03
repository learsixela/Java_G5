package com.desafiolatam.f20211230;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		
		if(edad < 18) {
			System.out.println("menor de edad, no puede usar el sistema");
		}else {
			System.out.println("Ingrese su peso");
			float peso = sc.nextFloat();
			System.out.println("Ingrese su estatura");
			float estatura = sc.nextFloat();
			
			float imc = peso/estatura;
			System.out.println("su IMC es "+imc);
			if(imc < 18.5) {
				System.out.println("Bajo peso");
			}else if(imc >= 18.5 && imc < 25) {
				System.out.println("Normal");
			}else if(imc >= 25 && imc < 30) {
				System.out.println("Sobrepeso");
			}else {
				System.out.println("Obeso");
			}
			
			
		}
		
	}

}
