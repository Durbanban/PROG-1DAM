package ejercicio08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0, numLoteria = 0;
		Sorteo s1;
		
		System.out.println("Bienvenido a Loterías y Apuestas del Estado");
		do {
			System.out.println("Pulse 1 para elegir un número a jugar");
			System.out.println("Pulse 0 para salir");
			
			opcion = Leer.datoInt();
			if (opcion > 0 && opcion <= 1) {
				System.out.println("Por favor introduzca el número elegido");
				numLoteria = Leer.datoInt();
				s1 = new Sorteo (numLoteria);
				s1.comprobarGanador(numLoteria, s1.numPrimitiva());
			}else if (opcion > 1) {
				System.out.println("Por favor, elija una opción válida");
			}
		} while (opcion != 0);
		System.out.println("Gracias por jugar a la primitiva");
		

	}

}
