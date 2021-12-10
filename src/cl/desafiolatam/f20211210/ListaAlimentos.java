package cl.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaAlimentos {

	public static void main(String[] args) {		
		ordenar();
	}
	
	public static void ordenar() {
		ArrayList<String> almuerzos = new ArrayList<String>();
		almuerzos.add("Cazuela");
		almuerzos.add("Porotos");
		almuerzos.add("Pastel de Choclo");
		almuerzos.add("Ají de gallina");
		almuerzos.add("Ceviche");
		almuerzos.add("Arepas");
		
		Collections.sort(almuerzos);
		Collections.reverse(almuerzos);
		
		ArrayList<String> almuerzos2 = new ArrayList<String>();
		/* NUNCA HACER ESTO, NO ES UNA COPIA */
		//almuerzos2 = almuerzos;
		
		//COPIA DE LA LISTA ORIGINAL
		almuerzos2.addAll(almuerzos);
		
		//COPIA DE LA LISTA ORIGINAL
		ArrayList<String> almuerzos3 = new ArrayList<String>(almuerzos);
		
		System.out.println("** Menu de Almuerzos **");
		
		for (int i = 0; i < almuerzos.size(); i++) {
			System.out.println(" * "+ almuerzos.get(i));
		}
		System.out.println();
		for (Iterator iterator = almuerzos.iterator(); iterator.hasNext();)
		{
			String elemento = (String) iterator.next();
			//iterator.next();
			//iterator.next();
			//System.out.println("elemento "+iterator.next());
			
		}
		
		almuerzos.add("Lazaña");
		
		System.out.println("ALMUERZOS "+ almuerzos);
		System.out.println("ALMUERZOS 2 "+ almuerzos2);
		System.out.println("ALMUERZOS 3 "+ almuerzos3);
		
	}

}
