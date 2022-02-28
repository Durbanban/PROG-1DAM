package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double descEdad = 30.0, descFamiliaNumerosa = 20.0;
		int idClub = 0, opcionMenu = 0;
		System.out.println("Bienvenido al Club Pijeda");
		
		System.out.println("Introduzca el id del Club");
		List <Socio> listaSocios = new ArrayList <Socio> ();
		List <Pista> listaPistas = new ArrayList <Pista> ();
		
		idClub = Leer.datoInt();
		
		Club club = new Club (idClub, listaSocios, listaPistas);
		
		mostrarMenuPrincipal ();
		opcionMenu = Leer.datoInt();
		
		
		
		

	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para dar de alta un socio");
		System.out.println("Pulse 2 para calcular cuota de un socio");
		System.out.println("Pulse 3 para modificar los datos de un socio");
		System.out.println("Pulse 4 para mostrar todos los socios VIP");
		System.out.println("Pulse 5 para borrar a un socio");
		System.out.println("Pulse 6 para gestión de pistas");
		System.out.println("Pulse 0 para salir");
	}
	
	public static void mostrarMenuPistas () {
		System.out.println("Pulse 1 para mostrar el numero de pistas disponibles");
		System.out.println("Pulse 2 para asignar una pista");
		System.out.println("Pulse 3 para modificar el precio de una pista");
		System.out.println("Pulse 0 para volver al menú principal");
	}

}
