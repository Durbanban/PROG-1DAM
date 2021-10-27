package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 5
		/* Mostrar en pantalla un menú de un cine con 4 salas y las películas que se proyectan
		 * en cada una. Se debe leer la sala deseada y mostrar:
		 * a. Un mensaje con el precio de entrada, que será diferente en cada sala (por ejemplo
		 * sala vip, sala 3D, sala normal y sala para niños)
		 * b. Pedir número de entradas.
		 * c. Calcular el precio final y mostrarlo.
		 */
		
		int peli = 0, numEntrada = 0;
		double precSalaNorm = 6.5, precSala3D = 11, precSalaClassic = 4.5, precSalaKids = 7.0,
				precF = 0.0;
		System.out.println("Bienvenido a Cines Durbán");
		System.out.println("Pulse 1 para comprar John Wick 3");
		System.out.println("Pulse 2 para comprar Avatar 2");
		System.out.println("Pulse 3 para comprar Joker");
		System.out.println("Pulse 4 para comprar Lo que el viento se llevó");
		peli = Leer.datoInt();
		System.out.println("Indica el número de entradas: ");
		numEntrada = Leer.datoInt();
		if (numEntrada > 0 && numEntrada <= 10) {
			
			switch (peli) {
				case 1:
					System.out.printf("Se proyectará en una sala normal. Su precio es de %.2f €\n", precSalaNorm);
					precF = numEntrada * precSalaNorm;
					System.out.printf("Ha comprado %d entradas. Debe abonar %.2f €\n", numEntrada, precF);
					break;
				case 2:
					System.out.printf("Se proyectará en una sala 3D. Su precio es de %.2f €\n", precSala3D);
					precF = numEntrada * precSala3D;
					System.out.printf("Ha comprado %d entradas. Debe abonar %.2f €\n", numEntrada, precF);
					break;
				case 3:
					System.out.printf("Se proyectará en una sala para niños. Su precio es de %.2f €\n", precSalaKids);
					precF = numEntrada * precSalaKids;
					System.out.printf("Ha comprado %d entradas. Debe abonar %.2f €\n", numEntrada, precF);
					break;
				case 4:
					System.out.printf("Se proyectará en una sala de Clásicos. Su precio es de %.2f €\n", precSalaClassic);
					precF = numEntrada * precSalaClassic;
					System.out.printf("Ha comprado %d entradas. Debe abonar %.2f €\n", numEntrada, precF);
					break;
				default:
					System.out.println("Por favor, seleccione una de las 4 opciones");
		
			}
			}else {
				System.out.println("Por favor, seleccione entre 1 y 10 entradas");
		}
		System.out.println("Gracias por usar el menú. No se olvide de las palomitas!");
	}

}
