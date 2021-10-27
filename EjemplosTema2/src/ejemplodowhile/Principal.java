package ejemplodowhile;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion =0;
		// Do...While
		//int a = 0, b = 0;
		System.out.println("Bienvenido al ejemplo do...while");
		System.out.println("Vamos a probar los bucles");
		//System.out.println("Introduzca un número");
		//a = Leer.datoInt();
		//System.out.println("Introduzca otro número");
		//b = Leer.datoInt();
		do {
			
			System.out.println("Pulse la sala que quiera:");
			System.out.println("1. Matrix");
			System.out.println("2. El señor de los anillos");
			System.out.println("3. John Wick");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			
			switch(opcion) {
				case 0:
					System.out.println("Ha decidido salir");
					break;
				case 1:
					System.out.println("Sala 1");
					break;
				case 2:
					System.out.println("Sala 2");
					break;
				case 3:
					System.out.println("Sala 3");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;					
			}
		}while (opcion != 0);
		System.out.println("Adios!");
	}

}
