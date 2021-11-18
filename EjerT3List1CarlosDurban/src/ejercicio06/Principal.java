package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		CaraCruz moneda = new CaraCruz ();
		
		System.out.println("Bienvenido al juego de Cara o Cruz");
		System.out.println("Pulse 1 para jugar");
		System.out.println("Pulse 0 para salir");
		
		opcion = Leer.datoInt();
		System.out.println(moneda.lanzarMoneda(opcion));
	}

}
