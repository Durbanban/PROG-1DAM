package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idPersona = 1, opcionMenu = 0;
		Persona p1 = new Persona (idPersona ++, "Victoria Beckam", 46, "victory.beck@yahoo.co.uk", 164, 50.4);
		Persona p2 = new Persona (idPersona ++, "Mel B", 49, "melanieB@yahoo.co.uk", 172, 54.6);
		Persona p3 = new Persona (idPersona ++, "Mel C", 52, "melCEE@gmail.co.uk", 157, 47.4);
		Persona p4 = new Persona (idPersona ++, "Geri Halliwell", 51, "thegerihot@outlook.co.uk", 165, 50.2);
		Persona p5 = new Persona (idPersona ++, "Emma Bunton", 46, "e.bunton@gmail.co.uk", 168, 53.2);
		ComparaPorNombreInverso cpnv = new ComparaPorNombreInverso (); 
		ComparaPorAltura cpa = new ComparaPorAltura ();
		ComparaPorPeso cpp = new ComparaPorPeso ();
		
		List <Persona> lista = new ArrayList <Persona> ();
		
		CrudPersona crudPersona = new CrudPersona (lista);
		
		crudPersona.agregarPersona(p5);
		crudPersona.agregarPersona(p3);
		crudPersona.agregarPersona(p2);
		crudPersona.agregarPersona(p1);
		crudPersona.agregarPersona(p4);
		
		System.out.println("Bienvenido a la lista ordenadApp (Spice Girls edition)");
		do {	
			mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					crudPersona.mostrarLista();
					break;
				case 2:
					crudPersona.ordenarNatural();
					crudPersona.mostrarLista();
					break;
				case 3:
					crudPersona.ordenarPorNombreInverso(cpnv);
					crudPersona.mostrarLista();
					break;
				case 4:
					crudPersona.ordenarPorAltura (cpa);
					crudPersona.mostrarLista();
					break;
				case 5:
					crudPersona.ordenarPorPeso (cpp);
					crudPersona.mostrarLista();
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción válida");
					break;
			}
		}while (opcionMenu != 0);		
		
		System.out.println("Gracias por usar el programa");
		

	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para mostrar la lista sin ordenar");
		System.out.println("Pulse 2 para mostrar la lista ordenada alfabéticamente");
		System.out.println("Pulse 3 para mostrar la lista ordenada alfabéticamente de manera inversa");
		System.out.println("Pulse 4 para mostrar la lista ordenada por altura (de menor a mayor)");
		System.out.println("Pulse 5 para mostrar la lista ordenada por peso (de mayor a menor)");
		System.out.println("Pulse 0 para salir");
	}

}
