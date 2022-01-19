package com.desafiolatam.f20220117;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.desafiolatam.f20220117.models.Gato;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("e");
		list.add("13");
		
		for (String valor : list) {
			System.out.println(valor);
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String valor = (String) iterator.next();
			System.out.println(valor);
			
		}
		
		ArrayList<Gato> listaGatitos = new ArrayList<>();
		
		Gato tomas= new Gato();
		
		System.out.println(tomas.getColor());
		
		listaGatitos.add(tomas);
		
		listaGatitos.get(0);//tomas
		listaGatitos.get(0).getColor();//tomas.getColor()
		
		listaGatitos.get(0).setColor("Blanco");
		
		System.out.println(listaGatitos.get(0).getColor());
		System.out.println(tomas.getColor());
		
		List<Gato> silvestre = new ArrayList<>();
		

		
	}

}