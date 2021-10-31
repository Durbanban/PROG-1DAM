package ejercicio14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 14
		/* Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de
		 * un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra
		 * por ventas se calculará mediante el 20 % de lo vendido en total al mes.
		 */
		
		
		double fijo = 1000.0, ventas = 0.0, comVentas = 0.0, porc = 20.0, numVentas = 0.0, totalVentas = 0.0,
				salario = 0.0, divisor = 100.0;
		System.out.println("Bienvenido a tu nómina");
		do {
			System.out.println("Indique el número de ventas que ha realizado este mes.");
			System.out.println("Pulse 0 para salir.");
			numVentas = Leer.datoDouble();
			if (numVentas > 0) {
				for (int i = 0; (i+1) <= numVentas; i++) {
					System.out.println("Indique el importe de la venta " + (i + 1) + " del mes:");
					ventas = Leer.datoDouble();
					totalVentas = totalVentas + ventas;
				}
				System.out.printf("El importe total de ventas ha sido: %.2f €\n", totalVentas);
				comVentas = (totalVentas * porc) / divisor;
				salario = fijo + comVentas;
				System.out.printf("Su salario este mes asciende a %.2f €\n", salario);
			}
		}while (numVentas > 0);
		System.out.println("Gracias por usar el programa");
		
		
		
		
		
		
		
	}

}
