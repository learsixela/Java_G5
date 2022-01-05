package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Collections;

public class Menu {

	public static void main(String[] args) {
		ordenar();//llamado al metodo
	}
	
	public static void ordenar() {
		ArrayList<String> platos = new ArrayList<>();
		platos.add("Cazuela");
		platos.add("Porotos");
		platos.add("Pastel de Choclo");
		platos.add("Ají de gallina");
		platos.add("Ceviche");
		platos.add("Arepas");

		Collections.sort(platos);
		Collections.reverse(platos);
		System.out.println("╔════════════════════╗");
		System.out.println("║      MENU          ║");
		System.out.println("╠════════════════════╣");
		/*for (int i = 0; i < platos.size(); i++) {
			System.out.printf("║ "+platos.get(i));
			//platos.get(i);//accediendo a cada uno de los elementos
			for(int j = 0; j < (19 - platos.get(i).length());j++) {
				System.out.printf(" ");
			}			
			System.out.printf("║\n");
		}
		*/
		// ╣ ║ ╗ ╝ ╚ ╔ ╩ ╦ ╠ ═ ╬ 
		
		for (String plato : platos) {
			System.out.println("║ "+plato);
		}
		System.out.println("╚════════════════════╝");
		
	}

}
