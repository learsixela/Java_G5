package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
/*		System.out.println("*************");
		System.out.println("***Desafio Latam***");
		System.out.printf("\n\nHola\tmundo\t\n\n");
*/
		
/*		
		System.out.println("****************");
		System.out.println("Ingrese su nombre");
		String nombre = sc.next();
		
		System.out.println("Ingrese su edad");
		Integer edad = sc.nextInt();
		
		System.out.println("Hola "+nombre+" tu edad es: "+edad+".");
	*/
		String anio = "2021";
		String direccion="FFddDDfFFdd";
		Integer a�o= 2021;
		Integer mes =12;
		Double PI= 3.1416;
		Double FUERZA_DE_GRAVEDAD= 9.8;
		
		String cUno ="1";//representacion grafica
		String pUno = "uno";//como se expresa verbalmente
		Integer iUno = 1;//el numero
		int iiUno= 1;
		
		boolean verdadero = true;
		Boolean falso = false;
		//suma de String (concatenar)
		System.out.println("123"+"456");
		System.out.println("qwerty"+"45678");
		//String + numero = String
		System.out.println("qwerty"+45678);
		System.out.println(1234+"");
		String stringNumero = 1234+"";
		System.out.println(true+"123");
		//System.out.println(123+true);
		//Suma de numericos
		System.out.println(2+3);
		System.out.println(2*3);
		//la division siempre nos retorna un entero
		System.out.println(2/3);
		Integer division1= 4/3;
		Double division2 = (double) (4/3);
		Float division3 = (float) (4/3);
		Long division4 = (long) (4/3);
		//imprimir el contenido de la variable
		System.out.println("Integer: "+division1);
		System.out.println("Double: "+division2);
		System.out.println("Float: "+division3);
		System.out.println("Long: "+division4);
		System.out.println("4/3 = "+4/3);
		//resto de la division
		System.out.println("4%3 = "+4%3);
		
		//dividir un string
		
		String palabra= "paralelepipedo";

		String palabrita=palabra.substring(0, 4);
		System.out.println(palabrita);
		System.out.println(palabra.substring(0, 4));
		System.out.println(palabra.substring(4, 8));
		System.out.println(palabra.substring(8));
		
		//
		
		sc.close();
	}

}
