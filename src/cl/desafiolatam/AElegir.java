package cl.desafiolatam;

public class AElegir {

	    public static void main(String[] args) {
	        String[] alumnos = {
	        		"Israel Palma",
	        		"Alexandra Suboch",
	        		"Andres Ramiro Molina",
	        		"Carol Riquelme",
	        		"Constanza Roa",
	        		"Cristian Acosta",
	        		"Cristian Alarcon",
	        		"Desiree Sotillo",
	        		"Geovana Duque",
	        		"Hugo Letelier",
	        		"Jorge Escobar",
	        		"Juan Gonzalez",
	        		"Juan Pablo Torres",
	        		"Luis Armando Sanhueza",
	        		"Maité Recabal Fernández",
	        		"Milton Hernandez",
	        		"Pablo Malhue",
	        		"Pablo Romero",
	        		"Paula Asencio",
	        		"Rodrigo Olmedo",
	        		"Romina Gaete",
	        		"Sebastian Vera",
	        		"Sergio Antonio Maass",
	        		"Soledad Silva",
	        		"Wladimir Navarrete",
	        		"Yuri Ascencio",
	        		"German Pinto"
	        };
	        int indiceAleatorio = (int) Math.floor(Math.random()*27);
	        System.out.println("** Numero elegido:"+indiceAleatorio );
	        String juegoAleatorio = alumnos[indiceAleatorio];
	        System.out.printf("La alumna o alumno es: %s", juegoAleatorio);
	    }


}
