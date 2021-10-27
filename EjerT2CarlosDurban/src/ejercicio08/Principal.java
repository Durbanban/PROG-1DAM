package ejercicio08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 8
		// Leer una secuencia de 10 números y mostrar sólo la suma y el producto de todos ellos.
		System.out.println("Bienvenido al programa de sumas y productos totales");
		
		int num = 0, resSuma = 0, cont = 0, resMultip = 0, opcion = 0, tope = 10;
		System.out.println("Pulse 0 para salir");
		System.out.println("Pulse cualquier tecla para iniciar");
		opcion = Leer.datoInt();
			do {
				cont = 0;
				resMultip = 1;
				resSuma = 0;
				System.out.println("Para salir pulse 0");
				opcion = Leer.datoInt();
			
				while ( cont<tope) {
					System.out.println("Introduzca un número que quiere sumar o multiplicar: ");
					num = Leer.datoInt();
					resSuma = resSuma + num;
					resMultip = resMultip * num;
					cont++;
			
				}
			}while(opcion != 0);
			
		
			System.out.printf("La suma de todos los números es: %d\n", resSuma);
			System.out.printf("El producto de todos los números es: %d", resMultip);
			
			}

	}


