package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 16
		/* Realizar una “mini-calculadora”, que realice las siguientes operaciones: suma, resta,
		 * multiplicación, división y decir si un número es par o impar. Se hará con un menú, y se pedirá
		 * en cada caso del switch los datos necesarios para realizar las operaciones. Se valorarán las
		 * comprobaciones que se hagan sobre los datos introducidos (por ejemplo, no dividir por cero).
		 */
		
		System.out.println("Bienvenido a la calculadora en eclipse");
		int opcion = 0, numSuma = 0, resSuma = 0, numResta = 0, resResta = 0, numMulti = 0, resMulti = 1, numParImpar = 0;
		double  resDiv = 1.0, dividendo = 0.0, divisor = 0.0;
		do {
			System.out.println("Para sumar pulse 1");
			System.out.println("Para restar pulse 2");
			System.out.println("Para multiplicar pulse 3");
			System.out.println("Para dividir pulse 4");
			System.out.println("Para saber si un número es par o impar pulse 5");
			System.out.println("Para salir pulse 0");
			opcion = Leer.datoInt();
			
			switch(opcion) {
				case 1:
					resSuma = 0;
					System.out.println("Introduzca un número");
					System.out.println("Para volver al menú de operaciones pulse 0");
					numSuma = Leer.datoInt();
					while (numSuma != 0) {
						resSuma = numSuma + resSuma;
						System.out.printf("El resultado es: %d\n", resSuma);
						System.out.println("Introduzca otro número a sumar o pulse 0 para volver al menú de operaciones");
						numSuma = Leer.datoInt();
					}
					break;
					
				case 2:
					resResta = 0;
					System.out.println("Introduzca un número");
					System.out.println("Para volver al menú de operaciones pulse 0");
					numResta = Leer.datoInt();
					while (numResta != 0) {
						resResta = numResta + resResta;
						System.out.printf("El resultado es: %d\n", resResta);
						System.out.println("Introduzca otro número a restar o pulse 0 para volver al menú de operaciones");
						numResta = Leer.datoInt()*-1;
					}
					break;
					
				case 3:
					resMulti = 1;
					System.out.println("Introduzca un número");
					System.out.println("Para volver al menú de operaciones pulse 0");
					numMulti = Leer.datoInt();
					while (numMulti != 0) {
						resMulti = numMulti * resMulti;
						System.out.printf("El resultado es: %d\n", resMulti);
						System.out.println("Introduzca otro número a multiplicar o pulse 0 para volver al menú de operaciones");
						numMulti = Leer.datoInt();
						
					}
					break;
					
				case 4:
					resDiv = 1;
					System.out.println("Introduzca un número");
					dividendo = Leer.datoDouble();
					System.out.println("Introduzca un número para dividirlo");
					System.out.println("Para volver al menú de operaciones pulse 0");
					divisor = Leer.datoDouble();
					while (divisor != 0) {
						resDiv = dividendo / divisor;
						System.out.printf("El resultado es: %.2f\n", resDiv);
						System.out.println("Introduzca otro número a dividir o pulse 0 para volver al menú de operaciones");
						dividendo = resDiv;
						divisor = Leer.datoDouble();
					}
					break;
				case 5:
					System.out.println("Introduzca un número");
					System.out.println("Para volver al menú de operaciones pulse 0");
					numParImpar = Leer.datoInt();
					while (numParImpar !=0) {
						if (numParImpar % 2 == 0) {
							System.out.println("El " + numParImpar + " es un número par");	
						}else {
							System.out.println("El " + numParImpar + " es un número impar");
						}
						System.out.println("Introduzca otro número o pulse 0 para volver al menú de operaciones");
						numParImpar = Leer.datoInt();
					}
					break;
				default:
					System.out.println("Por favor introduzca un número entre 0 y 5\n");
					break;
				case 0:
					break;
					
					
					
				
			}
			
		}while (opcion != 0);
		System.out.println("Gracias por usar la calculadora");
	}

}
