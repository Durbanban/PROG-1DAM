package ejercicio09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 9
		/* Leer una secuencia de números, hasta que el usuario introduzca un número negativo y mostrar
		 * la suma total de dichos números sin contar el negativo.
		 */
		System.out.println("Bienvenido a la suma de números positivos");
		int num = 0, totalSuma = 0;
		do {
			System.out.println("Por favor, introduzca números positivos a sumar. Para salir introduzca un número negativo");
			totalSuma = 0;
			num = Leer.datoInt();
			if (num >= 0) {
				while (num >= 0) {
					totalSuma = totalSuma + num;
					System.out.println("Introduzca otro número positivo");
					num = Leer.datoInt();
				}
			}
			System.out.printf("La suma de todos los números es: %d\n", totalSuma);
		}while (totalSuma > 0);
			System.out.println("Gracias por usar el programa");
		
	}

}
