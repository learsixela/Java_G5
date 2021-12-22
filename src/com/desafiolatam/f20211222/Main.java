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
		}		
	}

}