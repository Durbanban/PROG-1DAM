package ejercicio10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 10
		// Leer un número y determinar su factorial.
		
		System.out.println("Bienvenido a Factoriales");
		int fact = 0, x = 1;
		
		do {
			x = 1;
			System.out.println("Indique un número para hacer su factorial");
			System.out.println("Indique un número negativo para salir");
			fact = Leer.datoInt();
			if ( fact >= 0) {
				for (int i = 0; (i+1) <= fact; i++) {
					x = x * (i+1);
				}
				System.out.println("El factorial de " + fact + " es " + x);
			}
		}while (fact >= 0);
		System.out.println("Gracias por usar el programa");
		

	}

}
