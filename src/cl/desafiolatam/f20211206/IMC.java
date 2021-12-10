package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		getEdad();
		Float estatura = getEstatura();
		Float kilos = getKilos();
		calculoIMC( kilos, estatura);
		calculoIMC();
		
	}
	
	public static void getEdad() {
		Scanner sc = new Scanner(System.in);
		Integer edad = 0;
		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
		} while (edad < 18 || edad > 115);
	}
	
	public static Float getEstatura() {
		Scanner sc = new Scanner(System.in);
		Float estatura = 0f;
		do {
			System.out.println("Ingrese estatura en metros");
			estatura = sc.nextFloat();
		} while (estatura < 0.5);
		return estatura;
	}
	
	public static Float getKilos() {
		Scanner sc = new Scanner(System.in);
		Float kilos = 0f;
		do {
			System.out.println("Ingrese peso en kilogramos.");
			kilos = sc.nextFloat();
		} while (kilos < 1f);
		return kilos;
	}
	
	public static void calculoIMC(Float kilos,Float estatura) {
		Float iMC = kilos / (estatura * estatura);
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 – 24.9 Normal 25.0 – 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */
		if (iMC < 18.5) {
			System.out.println("Bajo peso");
		} else if (iMC >= 18.5 && iMC < 25) {
			System.out.println("Normal");
		} else if (iMC >= 25 && iMC < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}
	} 
	
	public static void calculoIMC() {
		Float estatura = getEstatura();
		Float kilos = getKilos();
		Float iMC = kilos / (estatura * estatura);
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 – 24.9 Normal 25.0 – 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */
		if (iMC < 18.5) {
			System.out.println("Bajo peso");
		} else if (iMC >= 18.5 && iMC < 25) {
			System.out.println("Normal");
		} else if (iMC >= 25 && iMC < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}
	} 
	
}
