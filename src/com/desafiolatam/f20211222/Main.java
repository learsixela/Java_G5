package com.desafiolatam.f20211222;

import java.util.ArrayList;

import com.desafiolatam.f20211222.models.Cardiologo;
import com.desafiolatam.f20211222.models.Medico;
import com.desafiolatam.f20211222.models.Neurologo;
import com.desafiolatam.f20211222.models.Oftalmologo;

public class Main {

	public static void main(String[] args) {
		//instancia de medico
		Medico medico = new Medico("House","1-9",55);
		//medico.consulta();
		
		/**
		 * Polimorfismo
		 * */
		Medico neurologo = new Neurologo("Tom","74574",40,"Neurologia");
		//neurologo.consulta();
		
		Medico cardiologo = new Cardiologo("Clara","46455", 37, "Cardiologia");
		//cardiologo.consulta();
		
		Medico oftalmologo = new Oftalmologo("Dina","74582", 42, "Oftalmologia");
		//oftalmologo.consulta();
		
		Oftalmologo of = new Oftalmologo();
		
		//Arreglo de Medico
		ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
		listaMedicos.add(medico);
		listaMedicos.add(neurologo);
		listaMedicos.add(cardiologo);
		listaMedicos.add(oftalmologo);
		listaMedicos.add(of);
		
		for (Medico medico2 : listaMedicos) {
			medico2.consulta();
			System.out.println(medico2.getClass().getSimpleName());
		}		
		
		/**
		 * Parseo o Casteo (transformar o convertir a )
		 * */
		//Variable de tipo Medico, se comporta como Neurologo, lo transformamos a Neurologo
		// (Upcasting)
		Neurologo neuro = (Neurologo) neurologo;
		System.out.println("\nespecialidad "+neuro.getEspecialidad());
		
		//Casteo implicito (Widening)
		int numeroInt = 44;
		double numeroDouble = numeroInt;
		
		//Casteo explicito (Narrowing)
		
		double numero2Double = 55d;
		int numero2Int = (int) numero2Double;		
		
		int numero3Int = 66;
		Double numero3Double= (double) numero3Int;
		
	}

}