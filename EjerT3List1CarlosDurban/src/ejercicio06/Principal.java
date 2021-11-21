package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0, comprobacion = 0;
		CaraCruz moneda = new CaraCruz ();
		
		System.out.println("Bienvenido al juego de Cara o Cruz");
		do {
			System.out.println("\nPulse 1 para elegir cara");
			System.out.println("Pulse 2 para elegir cruz");
			System.out.println("Pulse 0 para salir");
			
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					comprobacion = moneda.lanzarMoneda();
					System.out.println("La elección ha sido " + opcion);
					System.out.println("El resultado es " + comprobacion + "\n");
					moneda.mostrarGanador(moneda.comprobarGanador(opcion, comprobacion));
					break;
				case 2:
					comprobacion = moneda.lanzarMoneda();
					System.out.println("La elección ha sido " + opcion);
					System.out.println("El resultado es " + comprobacion + "\n");
					moneda.mostrarGanador(moneda.comprobarGanador(opcion, comprobacion));
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor, elija una opción válida");
					break;
			} 
		} while (opcion != 0);
		System.out.println("Gracias por usar el programa");
		
		
		
	}

}
