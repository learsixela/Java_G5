package cl.desafiolatam.f20211207;

import java.util.Scanner;

public class AsteriscosYPuntos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;// definicion de variable
		boolean error = false;// variables de control

		// solicitamos el ingreso de datos
		//do {
			try {// error controlado
				do {
					// capturar el dato
					System.out.println("Ingrese cantidad de veces a mostrar *");
					cantidad = sc.nextInt();
				} while (cantidad < 1);
				error = false;
			} catch (Exception e) {
				System.out.println("Error de ingreso");
				error = true;
			}
		//} while (error);

		if (!error) {
			// validar el dato, no negativo y mayor a cero
			if (cantidad > 0) {
				// realizar la accion
				String caracter = "";
				for (int i = 1; i <= cantidad; i++) {
					//numero%2==0 -> par
					if(i%2==0) {//par
						caracter += ".";//caracter = caracter + ".";
					}else {//impar
						caracter += "*";//caracter = caracter + "*";
					}
					System.out.println(caracter);									
				}

				System.out.println("Resultado final  " + caracter);
			} else {
				System.out.println("SOlo numeros positivos mayor a cero");
			}
		}
	}

}
