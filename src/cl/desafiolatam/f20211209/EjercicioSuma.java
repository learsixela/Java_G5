package cl.desafiolatam.f20211209;

public class EjercicioSuma {

	public static void main(String[] args) {
		/* Construir un programa el cual nos permita sumar los 
			valores que estén entre 1 y 10 dentro de un arreglo.
		*/
		
		Integer suma = suma();
		System.out.println("La suma de los numeros entre 1 y 10 es  "+suma);

	}
	
//● Crear un método llamado Suma que retorna un número entero de la suma.
	public static Integer suma() {
//● Dentro del método suma, declarar una variable local llamada suma que parte en cero.		
		Integer suma = 0; 
//● Inicializar el arreglo con valores aleatorios.
		int[] arregloNumeros = {11,544,32,10,15,17,55}; //arregloNumeros.length = 7
//● Recorrer el arreglo con un ciclo for.
		for (int i = 0; i < arregloNumeros.length; i++) {
/*			● Dentro del ciclo, realizar condición if donde 
			preguntamos por los valores que están en el 
			intervalo solicitado.*/
			int numero = arregloNumeros[i];
			
			if(numero > 1 && numero < 10) {
//● Si la condición se cumple, sumará todos los valores.				
				suma = suma + numero;
			}
		}				
		return suma;
	}
}
