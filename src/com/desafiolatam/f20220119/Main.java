package com.desafiolatam.f20220119;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Map HashMap
		//clave;valor
		//la clave es unica, no se puede repetir
		Map<Integer, String> apellidosAlumnos = new HashMap<Integer,String>();
		//put agrega
		apellidosAlumnos.put(53, "Letelier");
		apellidosAlumnos.put(21, "Escobar");
		apellidosAlumnos.put(16, "Sepulveda");
		apellidosAlumnos.put(32, "Suboch");
		apellidosAlumnos.put(44, "Sepulveda");
		apellidosAlumnos.put(29, "Huidobro");
		
		System.out.println(apellidosAlumnos);
		//consultar por un registro lista.get(clave)
		System.out.println(apellidosAlumnos.get(4));//Sepulveda
		System.out.println();
		
		//recorrer dinamicamente Iterator - While
		Iterator iterator = apellidosAlumnos.keySet().iterator();
		
		while(iterator.hasNext()) {//existe data en el arreglo?
			Integer clave = (Integer) iterator.next();
			System.out.println(apellidosAlumnos.get(clave));
		}
		System.out.println();
		
		//retorna true si existe esa clave
		System.out.println(apellidosAlumnos.containsKey(3));
		//retorna true si existe ese valor
		System.out.println(apellidosAlumnos.containsValue("Letelier"));
		
		System.out.println("size "+apellidosAlumnos.size());
		//devuelve un arreglo de los valores
		System.out.println("valores del mapa "+apellidosAlumnos.values());

		System.out.println();
		//quitar un elemento de la lista
		apellidosAlumnos.remove(44);
		System.out.println(apellidosAlumnos);
		System.out.println();
		
		//entrySet
		System.out.println("entrySet: "+ apellidosAlumnos.entrySet());
		Set<Entry<Integer, String>> sete = apellidosAlumnos.entrySet();
		System.out.println("sete: "+sete); 
		
		Iterator<Entry<Integer, String>> it2 = sete.iterator();//apellidosAlumnos.entrySet().iterator();
		while(it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			Integer clave = entry.getKey();
			String valor = entry.getValue();
			
			System.out.println("La clave es: "+ clave+ ", El valor es: "+ valor);
			
		}
		System.out.println();

		apellidosAlumnos.clear();//borrar todos los elementos de la lista
		System.out.println(apellidosAlumnos);
		
		
		
	}

}