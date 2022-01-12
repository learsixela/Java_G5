package com.desafiolatam.f20220111;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErroresMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer dividendo = 100;//null;
		System.out.println("Ingrese un numero");
		String numero = "";
		int resultado = 0;
		try {
			numero = sc.nextLine();//asdASD1234!·$
			
			resultado = dividendo+  Integer.parseInt(numero);
			
		} catch (NumberFormatException nfe) {
			System.out.println("Error de conversion de datos "+nfe);
			
		} catch (NullPointerException npe) {
			System.out.println("Valor nulo "+npe.getMessage() );
			resultado = 0;
			
			 throw new NullPointerException("Valor nulo ");
			
		} catch (ArithmeticException ae) {
			System.out.println("No se puede dividir por cero");
			 throw new ArithmeticException("/ by por cero");
			 
		} catch (InputMismatchException ime) {
			System.out.println("Error de ingreso: "+ ime);
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error, avisele al programador "+ e);
		} finally {
			//cierres de acceso a base datos u otro
			sc.close();
			System.out.println("finally**");
		}
		
		
		
		System.out.println("Fin del programa");
	}

}
