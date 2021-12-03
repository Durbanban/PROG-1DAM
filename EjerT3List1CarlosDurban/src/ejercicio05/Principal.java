package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0, opAprobado = 0, opQuiniela = 0, tam = 10, opParidad = 0, opPrimitiva = 0, numPremiado = 0,
				numJugado = 0, max=0, min=0;
		int [] quiniela;
		char a;
		Sorteo num1 = new Sorteo ();
		
		
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
					max=3;
					min=1;
					do {
						System.out.println("\nBienvenido a la quiniela");
						System.out.println("Pulse 1 para generar una quiniela");
						System.out.println("Pulse 0 para volver al menú principal");
						opQuiniela = Leer.datoInt();
						if (opQuiniela != 0) {
							quiniela = new int [tam];
							for (int i = 0; i < quiniela.length; i++) {
								quiniela [i] = num1.calcularAleatorio(max, min);
							}
							
							for (int i = 0; i < quiniela.length; i++) {
								num1.mostrarGanadorQuin(num1.calcularGanador(quiniela[i]));
							}
							/*
							for (int i = 0; i < quiniela.length; i++) {
								a = quin.calcularQuiniela();
								if (a == '1') {
									System.out.printf("Resultado %d:\t%c\n", i+1, a);
								}else if (a == 'X') {
									System.out.printf("Resultado %d:\t\t%c\n", i+1, a);
								}else {
									System.out.printf("Resultado %d:\t\t\t%c\n", i+1, a);
								}
							}*/
						}
					}while (opQuiniela != 0);
					break;
				case 2:
					
					break;
				case 3:
					max=49;
					min=1;
					System.out.println("Dia su número");
					numJugado=Leer.datoInt();
					
					num1.mostrarGanador(num1.comprobarGanadorPrim(num1.calcularAleatorio(max, min), numJugado));
					
					
					
					
					
					
					
					
				
					break;
				default:
					System.out.println("Por favor elija una opción del menú. Gracias");
					break;
			}
		}while (opcion != 0);
		System.out.println("Gracias por usar el programa");

	}

}
