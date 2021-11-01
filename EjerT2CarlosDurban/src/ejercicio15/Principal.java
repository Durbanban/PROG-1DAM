package ejercicio15;

import lectura.Leer;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 15
		/* Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,
		 * retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos
		 * necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al
		 * saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto.
		 */
		
		double saldo = 0.0, retirada = 0.0, ingreso = 0.0, valorEntradas = 0.0;
		int opcion = 0, numEntradas = 0, costEntrada = 0, max = 20, min = 1;
		Random num = new Random (System.nanoTime());
		
		
		System.out.println("Bienvenido a Caja Chorizo");
		System.out.println("Indique su primer ingreso para crear la cuenta");
		saldo = Leer.datoDouble();
		while (saldo < 0) {
			System.out.println("Su saldo inicial no puede ser negativo");
			System.out.println("Indique su primer ingreso para crear la cuenta");
			saldo = Leer.datoDouble();
		}
		do {
			System.out.println("Pulse 1 para ver su saldo");
			System.out.println("Pulse 2 para retirada de dinero");
			System.out.println("Pulse 3 para ingresar dinero");
			System.out.println("Pulse 4 para comprar entradas");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					System.out.printf("Su saldo es de %.2f €\n", saldo);
					break;
				case 2:
					do {
						System.out.println("Indique una cantidad a retirar");
						System.out.println("Pulse 0 para volver al menú de operaciones");
						retirada = Leer.datoDouble();
						if (saldo >= retirada) {
							saldo = saldo - retirada;
							System.out.printf("Después de retirar %.2f €, su saldo es de %.2f €\n", retirada, saldo);	
						}else {
							System.out.println("Saldo insuficiente. Consulte con su entidad");
						}
					}while (retirada != 0);
					break;
				case 3:
					do {
						System.out.println("Introduzca una cantidad a ingresar");
						System.out.println("Pulse 0 para volver la menú de operaciones");
						ingreso = Leer.datoDouble();
						if (ingreso >= 0) {
							saldo = saldo + ingreso;
							System.out.printf("Después de introducir %.2f €, su saldo es de %.2f €\n", ingreso, saldo);
						}else {
							System.out.println("No se admiten cantidades negativas");
						}
					}while (ingreso != 0);
					break;
				case 4:
					do {
						costEntrada = num.nextInt (max - min + 1) + min;
						System.out.printf("Las entradas cuestan %d € en este momento\n", costEntrada);
						System.out.println("¿Cuántas entradas quiere comprar?");
						System.out.println("Pulse 0 para volver al menú de operaciones");			
						numEntradas = Leer.datoInt();
						if (numEntradas >= 0) {
							valorEntradas = costEntrada * numEntradas;
							if (saldo >= valorEntradas) {
								saldo = saldo - valorEntradas;
								System.out.printf("Ha comprado %d entradas. Su saldo es de %.2f € \n\n", numEntradas, saldo);
							}else {
								System.out.println("Saldo insuficiente. Consulte con su entidad");
							}
						}else {
							System.out.println("No se pueden comprar entradas negativas");
						}
					}while (numEntradas != 0);
					break;
				case 0:
					System.out.println("Gracias por usar este cajero");
					break;
				default:
					System.out.println("Elija una opción entre 0 y 4. Muchas gracias");
					break;
					
					
			}
		}while (opcion != 0);
		System.out.println("Hasta la próxima");
		
		
		
	}

}
