package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0, opAprobado = 0, opQuiniela = 0, tam = 10, opParidad = 0, opPrimitiva = 0, numPremiado = 0,
				numJugado = 0;
		int [] quiniela;
		char a;
		Sorteo num1 = new Sorteo ();
		Sorteo num2 = new Sorteo ();
		Sorteo num3 = new Sorteo ();
		Sorteo quin = new Sorteo ();
		Sorteo numParidad = new Sorteo();
		Sorteo numPrimitiva = new Sorteo();
		
		
		System.out.println("Bienvenido al programa de los sorteos");
		do {
			System.out.println("Pulse 1 para jugar la quiniela");
			System.out.println("Pulse 2 para generar par o impar");
			System.out.println("Pulse 3 para jugar a la primitiva");
			System.out.println("Pulse 4 para jugar al aprobado de programación");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();
			
			switch (opcion ) {
				case 1:
					do {
						System.out.println("\nBienvenido a la quiniela");
						System.out.println("Pulse 1 para generar una quiniela");
						System.out.println("Pulse 0 para volver al menú principal");
						opQuiniela = Leer.datoInt();
						if (opQuiniela != 0) {
							quiniela = new int [tam];
							for (int i = 0; i < quiniela.length; i++) {
								quiniela [i] = quin.calcularQuiniela();
							}
							for (int i = 0; i < quiniela.length; i++) {
								a = quin.calcularQuiniela();
								if (a == '1') {
									System.out.printf("Resultado %d:\t%c\n", i+1, a);
								}else if (a == 'X') {
									System.out.printf("Resultado %d:\t\t%c\n", i+1, a);
								}else {
									System.out.printf("Resultado %d:\t\t\t%c\n", i+1, a);
								}
							}
						}
					}while (opQuiniela != 0);
					break;
				case 2:
					System.out.println("Bienvenido a la paridad");
					do {
						System.out.println("Introduzca un número para saber si es par o impar");
						System.out.println("Pulse 0 para volver la menú prinpipal");
						opParidad = Leer.datoInt();
						if (opParidad != 0) {
							System.out.printf("El número %d es %s\n\n", opParidad, numParidad.calcularParidad(opParidad));
						}
					}while (opParidad != 0);
					break;
				case 3:
					System.out.println("Bienvenido a la primitiva");
					do {
						System.out.println("Pulse 1 para jugar al sorteo");
						System.out.println("Pulse 0 para volver al menú principal");
						opPrimitiva = Leer.datoInt();
						if (opPrimitiva != 0) {
							numJugado = numPrimitiva.numPrimitiva();
							System.out.printf("Su número es el %d\n", numJugado);
							numPremiado = numPrimitiva.numPrimitiva();
							System.out.printf("El número premiado hoy es el %d\n", numPremiado);
							if (numJugado == numPremiado) {
								System.out.println("¡¡Enhorabuena le ha tocado la lotería!!\n");
							}else {
								System.out.println("Lo sentimos usted no es afortunado. Suerte la próxima vez\n");
							}
						}
					}while (opPrimitiva != 0);
					break;
				case 4:
					System.out.println("Bienvenido al sorteo del aprobado en programación");
					do {
						System.out.println("Si consigue el número 666 está aprobado");
						System.out.println("Cualquier otro número del 0 al 999 nos vemos el año que viene");
						System.out.println("Pulse 1 para probar");
						System.out.println("Pulse 0 para volver al menú principal");
						opAprobado = Leer.datoInt();
						if (opAprobado != 0) {
							if (num1.calcularNum() == 6 && num2.calcularNum() == 6 && num3.calcularNum() == 6) {
								System.out.printf("¡Enhorabuena! Su número es %d%d%d y por lo tanto ha aprobado\n\n"
										+ "programación", num1.calcularNum(), num2.calcularNum(), num3.calcularNum());
							}else {
								System.out.printf("Lo sentimos. Su número es %d%d%d y por lo tanto nos vemos el "
										+ "año que viene\n\n", num1.calcularNum(), num2.calcularNum(), num3.calcularNum());
							}
						}
					}while (opAprobado != 0);
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción del menú. Gracias");
					break;
			}
		}while (opcion != 0);
		System.out.println("Gracias por usar el programa");

	}

}
