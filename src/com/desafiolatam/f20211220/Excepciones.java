package com.desafiolatam.f20211220;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double division = 0;

		try {
			System.out.println("Ingrese primer numero");
			String numero = sc.nextLine();

			System.out.println("Ingrese segundo numero");
			String numero2 = sc.nextLine();
			/*
			 * if(numero.equals(0)) { numero = null; }
			 */
			division = Integer.parseInt(numero) / Integer.parseInt(numero2);

		} catch (InputMismatchException e) {
			System.out.println("Error de ingreso: " + e.getMessage());
			throw new InputMismatchException(e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println("Error matematico: " + e.getMessage());
			division = 0;
			throw new ArithmeticException(e.getMessage());
			
		} catch (NumberFormatException nfe) {
			System.out.println(" Number exception: " + nfe.getMessage());

		} catch (NullPointerException e) {
			System.out.println("Null pointer: " + e.getMessage());
			throw new NullPointerException(e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Otro error: " + e);
			
		} finally {
			System.out.println("En finally ...");
			sc.close();
		}
		System.out.println("El resultado de la division es: " + division);
	}

}
