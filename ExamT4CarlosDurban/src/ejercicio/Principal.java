package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitante [] listadoVisitantes;
		int contadorVisitantes = 0, tam = 6, yearExpo = 0, opcionMenu = 0, opcionVisitante = 0;
		double descuentoGenerico = 50.0, descuentoEmpresario = 10.0, descuentoFamiliar = 1.0;
		
		listadoVisitantes = new Visitante [tam];
		
		listadoVisitantes [contadorVisitantes++] = new Visitante ("1", 15.0, 25);
		listadoVisitantes [contadorVisitantes++] = new Familiar ("2", 15.0, 40, 3);
		listadoVisitantes [contadorVisitantes++] = new Visitante ("3", 15.0, 16);
		listadoVisitantes [contadorVisitantes++] = new Empresario ("4", 15.0, 63, "Ayesa", 180.0);
		listadoVisitantes [contadorVisitantes++] = new Empresario ("5", 15.0, 69, "Polvillo", 10.50);
		listadoVisitantes [contadorVisitantes++] = new Familiar ("6", 15.0, 51, 5);
		
		System.out.println("Bienvenido a FormAppción Profesional");
		System.out.println("Por favor, indique el año donde se da lugar la Expo");
		
		yearExpo = Leer.datoInt();
		
		Feria f = new Feria (yearExpo, listadoVisitantes);
		
		
		do {
			
			mostrarMenu();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					f.mostrarListado();
					break;
				case 2:
					f.mostrarListado();
					System.out.println("Indique e qué visitante quiere calcularla");
					opcionVisitante = Leer.datoInt();
					if (opcionVisitante >= 1 && opcionVisitante <= 6) {
						System.out.printf("El precio de su entrada es: %.2f €\n", f.calcularPrecioVisitanteElegido(opcionVisitante, descuentoGenerico, descuentoEmpresario, descuentoFamiliar));
					}else {
						System.out.println("Por favor, elija una opción correcta");
					}
					break;
				case 3:
					System.out.printf("El total recaudado es: %.2f €\n", f.calcularTotalRecaudado(descuentoGenerico, descuentoEmpresario, descuentoFamiliar));
					break;
				case 4:
					System.out.printf("El total recaudado por familiares es: %.2f €\n", f.calcularRecaudadoFamiliares(descuentoGenerico, descuentoEmpresario, descuentoFamiliar));
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor, elija una opción correcta");
					break;
			}
		} while (opcionMenu != 0);

	}
	
	public static void mostrarMenu () {
		System.out.println("Pulse 1 para mostrar todos los visitantes");
		System.out.println("Pulse 2 para calcular el precio de una entrada");
		System.out.println("Pulse 3 para mostrar el total recaudado");
		System.out.println("Pulse 4 para mostrar el total recaudado de familiares");
		System.out.println("Pulse 0 para salir");
	}

}
