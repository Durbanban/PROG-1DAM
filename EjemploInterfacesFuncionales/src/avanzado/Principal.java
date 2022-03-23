package avanzado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.function.Function;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 
		 */
		int opcionMenu = 0, min = 30, max = 120, tope = 0, index = 0;
		Random num = new Random (System.nanoTime());
		Luchador ganador;
		String fighter1, fighter2, nombre = "Luchador";
		Supplier <Double> generadorAleatorios = () -> min + (max - min) * num.nextDouble();
		List <Luchador> lista = new ArrayList <Luchador>();
		Supplier <Luchador> generadorLuchadores = () -> new Luchador("", generadorAleatorios.get(), generadorAleatorios.get(),
				generadorAleatorios.get(), generadorAleatorios.get(), generadorAleatorios.get());
		BiConsumer <String, Integer> consum = (s1, n1) -> lista.get(n1).setNombre(s1);
		Function <String, Luchador> funcionBuscar = s1 -> {
			Luchador aux = null;
			boolean salir = false;
			for (int i = 0; i < lista.size() && !salir; i++) {
				if (lista.get(i).getNombre().equalsIgnoreCase(s1)) {
					aux = lista.get(i);
					salir = true;
				}
			}
				if (!salir) {
					aux = null;
				}
			return aux;
		};
		 
			
		System.out.println("Bienvenido a Mortal Kombat");
		System.out.println("¿Cuántos luchadores quiere?");
		tope = Leer.datoInt();
		while (lista.size() < tope) {
			System.out.println("Indique el nombre del jugador");
			nombre = Leer.dato();
			lista.add(generadorLuchadores.get());
			consum.accept(nombre, index);
			index++;
		}
		do {
			mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					Collections.sort(lista);
					if (lista.size() == 1) {
						System.out.println("El ganador es: " + lista.get(0));
					}else {
						for (Luchador luchador : lista) {
							System.out.println(luchador);
						}
					}
					break;
				case 2:
					Collections.sort(lista, (o1, o2) -> {
						int resultado = 0;
						if (o1.getPuntosHP() < o2.getPuntosHP()) {
							resultado = 1;
						}else if (o1.getPuntosHP() > o2.getPuntosHP()) {
							resultado = -1;
						}
						return resultado;
					});
					if (lista.size() == 1) {
						System.out.println("El ganador es: " + lista.get(0));
					}else {
						for (Luchador luchador : lista) {
							System.out.println(luchador);
						}
					}
					break;
				case 3:
					Collections.sort(lista, (o1, o2) -> {
						int resultado = 0;
						if (o1.getPuntosATK() > o2.getPuntosATK()) {
							resultado = -1;
						}else if (o1.getPuntosATK() < o2.getPuntosATK()) {
							resultado = 1;
						}
						return resultado;
					});
					if (lista.size() == 1) {
						System.out.println("El ganador es: " + lista.get(0));
					}else {
						for (Luchador luchador : lista) {
							System.out.println(luchador);
						}
					}
					break;
				case 4:
					if (lista.size() > 1) {
						System.out.println("Indique el nombre del primer luchador");
						fighter1 = Leer.dato();
						System.out.println("Indique el nombre del segundo luchador");
						fighter2 = Leer.dato();
						ICombate combate = (l1, l2) -> {
							Luchador gana = null, pierde = null;
								do {
								if (l1.getPuntosATK() > l2.getPuntosDEF()) {
									l2.setPuntosHP(l2.getPuntosHP() - l1.getDamage());
									if (l2.getPuntosHP() <= 0) {
										gana = l1;
										pierde = l2;
									}else {
										if (l2.getPuntosATK() > l1.getPuntosDEF()) {
											l1.setPuntosHP(l1.getPuntosHP() - l2.getDamage());
											if (l1.getPuntosHP() <= 0) {
												gana = l2;
												pierde = l1;
											}
										}
									}
								}else {
									l1.setPuntosHP(l1.getPuntosHP() - l2.getDamage());
									if (l1.getPuntosHP() <= 0) {
										gana = l2;
										pierde = l1;
									}
								}
							}while (l1.getPuntosHP() >= 0 && l2.getPuntosHP() >= 0);
							lista.remove(pierde);
							return gana;						
						};
						ganador = combate.luchar(funcionBuscar.apply(fighter1), funcionBuscar.apply(fighter2));
						System.out.printf("El ganador es: %s. Quedándole %.2f puntos de vida\n\n", ganador.getNombre(), ganador.getPuntosHP());
					}else {
						System.out.println("El ganador es: " + lista.get(0));
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor, elija una opción correcta");
					break;
			}
		}while (opcionMenu !=0);

	}
	
	public static void mostrarMenuPrincipal() {
		System.out.println("Pulse 1 para mostrar los luchadores en orden alfabético");
		System.out.println("Pulse 2 para mostrar los luchadores de mayor a menor vida");
		System.out.println("Pulse 3 para mostrar los luchadores de mayor a menor puntos de ataque");
		System.out.println("Pulse 4 para empezar un combate");
		System.out.println("Pulse 0 para salir");
	}
	
	

}
