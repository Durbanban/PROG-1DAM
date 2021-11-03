package ejercicio01;

import lectura.Leer;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 1
		int [] arrayLitros;
		int dias = 0, opcion = 0, tam = 0, max = 0, min = 0, pos = 0, litrosDia = 0, suma = 0, 
				diasLluvia = 0, diaComparar = 0, porcentaje = 0, cien = 100, mediaPueblo = 15;
		double media = 0.0;
		Random num = new Random (System.nanoTime());
		System.out.println("Bienvenido a la estación meteorológica");
		System.out.println("¿Cuántos días quiere que tenga el array?");
		tam = Leer.datoInt();
		while (tam < 0) {
			System.out.println("Por favor, indique un número de días positivo");
			tam = Leer.datoInt();
		}
		arrayLitros = new int [tam];
		do {
			System.out.println("\nPulse 1 para generar el array con aleatorios");
			System.out.println("Pulse 2 para mostrar todos los datos");
			System.out.println("Pulse 3 para mostrar los litros por día");
			System.out.println("Pulse 4 para mostrar los días que ha llovido");
			System.out.println("Pulse 5 para mostrar la media diaria de lluvia");
			System.out.println("Pulse 6 para mostrar la media diaria de lluvia en mi pueblo");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 1:
					System.out.println("Indique el número máximo posible para el array");
					max = Leer.datoInt();
					while (max < 0) {
						System.out.println("El número tiene que ser mayor que 0. Gracias");
						System.out.println("Indique el número máximo posible para el array");
						max = Leer.datoInt();
					}
					System.out.println("Ahora indique el número mínimo posible del array");
					min = Leer.datoInt();
					while (min > max) {
						System.out.println("No puede ser mayor que el número máximo. Gracias");
						System.out.println("Ahora indique el número mínimo posible del array");
						min = Leer.datoInt();
					}
					for (int i = 0; i < arrayLitros.length; i++) {
					arrayLitros [i] = num.nextInt(max - min + 1) + 1;
					
					}
					break;
				case 2:
					System.out.println("Día\t\t\tCantidad");
					for (int i = 0; i < arrayLitros.length; i++) {
						System.out.printf("%d\t\t\t%d\n",(i+1), arrayLitros[i]);
					}
					break;
				case 3:
					System.out.println("Indique el día que quiere comprobar");
					pos = Leer.datoInt();
					while (pos > arrayLitros.length) {
						System.out.println("Indique un día comprendido en el array que ha creado");
						pos = Leer.datoInt();
					}
					for (int i = 0; i < arrayLitros.length; i++) {
						if ((i+1) == pos) {
							litrosDia = arrayLitros[i];
							System.out.println("La cantidad de litros el día " + (i+1) + " fue de " + litrosDia + "litros");
						}
					}
					break;
				case 4:
					for (int i = 0; i < arrayLitros.length; i++) {
						if (arrayLitros[i] > 0) {
							diasLluvia++; 
						}
					}
					System.out.printf("Ha llovido %d días", diasLluvia);
					break;
				case 5:
					for (int i = 0; i < arrayLitros.length; i++) {
						suma = suma + arrayLitros[i];
					}
					media = suma / arrayLitros.length;
					System.out.printf("La media diaria de lluvia ha sido de %.2f", media);
				case 6:
					System.out.printf("La media diaria de mi pueblo es %d\n", mediaPueblo);
					System.out.println("Indique el día que desea comparar");
					pos = Leer.datoInt();
					while (pos > arrayLitros.length) {
						System.out.println("Indique un día comprendido en el array que ha creado");
						pos = Leer.datoInt();
					}
					for (int i = 0; i < arrayLitros.length; i++) {
						diaComparar = arrayLitros[pos-1];
						
					}
					porcentaje = (diaComparar / mediaPueblo) * cien;
					System.out.printf("El día %d llovió un %d %%" , arrayLitros[pos-1], porcentaje);
				case 0:
					break;
				default:
					System.out.println("Por favor, elija una opción entre 1 y 6.");
					System.out.println("Pulse 0 para salir");
					break;
					
					
				
			}
		}while (opcion != 0);
		System.out.println("Gracias por usar el programa");
		
	}

}
