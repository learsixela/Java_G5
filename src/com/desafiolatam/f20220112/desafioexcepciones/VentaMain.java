package com.desafiolatam.f20220112.desafioexcepciones;

public class VentaMain {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Ayun");
		cliente.setEdad(30);
		
		Vehiculo vehiculo = new Vehiculo("Blanco","HHSS-23");
		
		LibroVenta libroVenta = new LibroVenta("ventaBlanco","12012022");
		
		libroVenta.guardarVenta(cliente, vehiculo);
		
		System.out.println("Venta finalizada...");
		
		
	}

}
