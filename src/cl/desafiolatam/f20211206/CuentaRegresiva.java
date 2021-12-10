package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class CuentaRegresiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int correcto = 0;
		do {
			System.out.println("Ingrese un numero");
			try {
				numero = sc.nextInt();
			} catch (Exception e) {
				System.out.println(" error -> " + e);
			}

			if (numero > 0) {
				for (int i = numero; i > 0; i--) {
					System.out.println("segundo " + i);
				}
				correcto = 1;
			} else {
				System.out.println("Debe ingresar un numero mayor a 0");
			}

		} while (correcto == 0);

		sc.close();

	}
}
