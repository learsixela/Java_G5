package cl.desafiolatam.f20211209;

public class Arrays {

	public static void main(String[] args) {
		//Conjunto de datos, ordenados segun su orden de ingreso,
		//separados por coma
		//todos comienzan en la posicion cero
		//(length)en todos podemos obtener el tamaño o cantidad de elementos
		
		int[] sinNumeros = {};//cero 
		System.out.println(sinNumeros.length);
		
		String[] vocales = {"a","e","i","o","u"};
		System.out.println(vocales.length);
		
		//definicion de arreglo estatico de tamaño 5
		int[] numerosPares = new int[15];
		//int[] numeroPares = {2,4,6,8,10};
		System.out.println("numerosPares "+numerosPares.length);
		
		String[] alumnos = new String[25]; //{"Romina","Soledad","Andres" };
		System.out.println();
		//Recorriendo arreglos
		System.out.println(" ** Recorrer dinamicamente **");
								//5
		for (int i = 0; i < vocales.length; i++) {
			//valor i (indice o posicion)
			System.out.printf("valor de i %d ", i);
			//acceder a cada elemento, uno por uno
			System.out.println(" Elemento "+ vocales[i]);
		}
		
		//acceso individual
		System.out.println();
		System.out.println(" ** Recorrer individualmente **");
		System.out.println("Elemento vocales[posicion 0] - "+ vocales[0] );//vocale.get(i)
		System.out.println("Elemento vocales[posicion 1] - "+ vocales[1] );
		System.out.println("Elemento vocales[posicion 2] - "+ vocales[2] );
		System.out.println("Elemento vocales[posicion 3] - "+ vocales[3] );
		System.out.println("Elemento vocales[posicion 4] - "+ vocales[4] );
	}
}
