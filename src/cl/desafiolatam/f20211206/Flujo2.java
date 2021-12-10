package cl.desafiolatam.f20211206;

public class Flujo2 {

	public static void main(String[] args) {
		//if
		int numero1 = 5;
		int numero2 = 6;
		
		if(numero1 == numero2) {
			System.out.println("Son iguales");
		}else {
			if(numero1 < numero2) {
				System.out.println("numero2 es mayor a numero1");
				System.out.println("numero1 es menor a numero2");
			}else {
				System.out.println("numero2 es menor a numero1");
				System.out.println("numero1 es mayor a numero2");
			}
			//System.out.println("No son iguales");
		}
		
		// else if , cuando tengamos mas de 2 opciones
		if(numero1 == numero2) {
			System.out.println("Son iguales");
		} else if (numero1 < numero2){
			System.out.println("numero2 es mayor a numero1");
			System.out.println("numero1 es menor a numero2");
		}else {
			System.out.println("numero2 es menor a numero1");
			System.out.println("numero1 es mayor a numero2");
		}
		
		/**
		 * String
		 * */
		
		String palabra1 = "AeIoU";//65+101+73+111+85 = 435
		String palabra2 = "aeiou";//97+101+105+111+117 = 531
		
		// no hacer NUNCA ->if(palabra1 == palabra2) {
		if(palabra1.equals(palabra2)) {
		//equals, retorna true o false
			System.out.println("if "+ palabra1.equals(palabra2));
		}else {
			System.out.println("else "+palabra1.equals(palabra2));
		}
		
		System.out.println("equalsIgnoreCase  "+palabra1.equalsIgnoreCase(palabra2));
		System.out.println("compareTo "+palabra2.compareTo(palabra1));
		//comparacion lexica
		
		System.out.println(palabra1.toLowerCase());
		System.out.println(palabra1.toUpperCase());
		
//--
	}

}
