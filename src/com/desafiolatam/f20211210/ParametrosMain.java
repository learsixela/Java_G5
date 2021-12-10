package com.desafiolatam.f20211210;

import com.desafiolatam.utilidades.Util;

public class ParametrosMain {

	public static void main(String[] args) {
		Util util = new Util();		
		
		if (args.length > 1) {
			Float promedio = util.promedioArrayEstatico(args);			
			System.out.println("El promedio es "+ promedio);
			
		}else if (args.length == 0) {  
            System.out.println("No ha pasado parametros");
        }
	}
	
}
