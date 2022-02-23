package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idAgenda = 0, opcionMenu = 0, seleccionNota = 0, idNota = 1, opcionUrgente = 0;
		String cabecera, cuerpo;
		boolean urgente;
		System.out.println("Bienvenido a Appuntacosas");
		System.out.println("Indique el número de identificación");
		idAgenda = Leer.datoInt();		
		List <Nota> lista = new ArrayList <Nota> ();
		Nota n;
		Agenda a = new Agenda (idAgenda, lista);
		
		mostrarMenu ();
		opcionMenu = Leer.datoInt();
		switch (opcionMenu) {
			case 1:
				a.mostrarNotas();
				System.out.println("Indique el número de la nota");
				seleccionNota = Leer.datoInt();
				a.mostrarUnaNota(seleccionNota);
				break;
			case 2:
				System.out.println("Hay un total de " + a.mostrarTotalNotas() + " notas almacenadas");
				break;
			case 3:
				System.out.println("Indique la cabecera de la nota");
				cabecera = Leer.dato();
				System.out.println("Indique el cuerpo de la nota");
				cuerpo = Leer.dato();
				do {
					System.out.println("¿Es urgente? Pulse 1 si lo es, pulse 2 si no lo es");
					opcionUrgente = Leer.datoInt();
				}while (opcionUrgente != 1 && opcionUrgente != 0);
				urgente = convertirIntABoolean (opcionUrgente);
				n = new Nota (idNota, cabecera, cuerpo, urgente);
				a.addNota(n);
				
				break;
			case 4:
				break;
			case 0:
				break;
			default:
				System.out.println("Por favor, elija una opción correcta");
				break;
		}
		
		System.out.println("Gracias por usar el programa");
		
		
		
		
		
		
		

	}
	
	public static void mostrarMenu () {
		System.out.println("Pulse 1 para buscar una nota");
		System.out.println("Pulse 2 para saber cuántas notas hay almacenadas");
		System.out.println("Pulse 3 para agregar una nota");
		System.out.println("Pulse 4 para borrar una nota");
		System.out.println("Pulse 0 para salir" );
	}
	
	public static boolean convertirIntABoolean (int num) {
		if (num >= 1) {
			return true;
		}else {
			return false;
		}
	}

}
