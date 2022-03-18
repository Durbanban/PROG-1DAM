package intermedio;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idPersona = 1;
		
		List <Persona> listaPersonas = new ArrayList <Persona> ();
		
		listaPersonas.add(new Persona (idPersona ++, "Alejandro", "García", "605254690", 32, 168.0, 79.5, "Antonio Rodríguez Zepelín 56"));
		listaPersonas.add(new Persona (idPersona ++, "Pablo", "Pérez", "658401424", 27, 189.0, 97.1, "López de Gomara 4"));
		listaPersonas.add(new Persona (idPersona ++, "Carolina", "Herrera", "610021478", 48, 174.0, 64.8, "Ardilla 3"));
		listaPersonas.add(new Persona (idPersona ++, "Samuel", "Gutiérrez", "722584103", 37, 187.0, 90.8, "San Vicente de Paúl 46"));
		listaPersonas.add(new Persona (idPersona ++, "Víctor", "Santos", "698871036", 40, 161.0, 64.8, "Virgen de las torres 38"));
		listaPersonas.add(new Persona (idPersona ++, "Luis Miguel", "López", "741102589", 39, 187.0, 91.8, "Juan Sebastian Elcano"));
		listaPersonas.add(new Persona (idPersona ++, "Jose Ignacio", "Pérez", "699650017", 24, 174.0, 70.8, "Alfarería 124"));
		listaPersonas.add(new Persona (idPersona ++, "Marta", "Figueroa", "652587410", 27, 164.0, 57.8, "Virgen de Luján"));
		listaPersonas.add(new Persona (idPersona ++, "Eugenia", "Álvarez", "620259336", 38, 158.0, 48.8, "Castilla 32"));
		listaPersonas.add(new Persona (idPersona ++, "Jesús", "Casanova", "628545651", 41, 162.0, 70.8, "Castilla 105"));
		
		Agenda agenda = new Agenda (listaPersonas);
		
		
		System.out.println("Bienvenido al ejemplo intermedio de interfaces funcionales");
		
		agenda.mostrarAgenda();
		agenda.ordenarNatural();
		System.out.println();
		agenda.mostrarAgenda();
		
		
		

	}

}
