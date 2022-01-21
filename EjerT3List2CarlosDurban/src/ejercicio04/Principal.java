package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 0, opcionMenu = 0, edadCliente = 0, contadorClientes = 0;
		String dni, nombre;
		double pesoCliente = 0.0, alturaCliente = 0.0;
		
		System.out.println("Bienvenido a GimnAppsio");
		System.out.println("¿Cuántos clientes puede tener como máximo?");
		tam = Leer.datoInt();
		
		Cliente [] listadoClientes = new Cliente [tam];
		Cliente c;
		Gimnasio gym = new Gimnasio (listadoClientes);
		
		do {
			gym.mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					System.out.println("Indique el dni del cliente");
					dni = Leer.dato();
					System.out.println("Indique el nombre del cliente");
					nombre = Leer.dato();
					System.out.println("Indique el peso del cliente (en kilogramos)");
					pesoCliente = Leer.datoDouble();
					System.out.println("Indique la altura del cliente (en metros)");
					alturaCliente = Leer.datoDouble();
					System.out.println("Indique la edad del cliente");
					edadCliente = Leer.datoInt();				
					c = new Cliente (dni, nombre, true, pesoCliente, alturaCliente, edadCliente);
					gym.addCliente(c, contadorClientes);
					contadorClientes++;				
					break;
				case 2:
					gym.mostrarClientes();
					break;
				case 3:
					System.out.println("Indique el dni del cliente");
					dni = Leer.dato();
					if (gym.buscarPorDni(dni) == null) {
						System.out.println("No se encuentran clientes con ese dni");
					}else {
						System.out.printf("El IMC del cliente es: %.2f\n", gym.buscarPorDni(dni).calcularIMC());
					}				
					break;
				case 4:
					System.out.println("Indique el dni del cliente");
					dni = Leer.dato();
					if (gym.buscarPorDni(dni) == null) {
						System.out.println("No se encuentran clientes con ese dni");
					}else {
						if (gym.buscarPorDni(dni).isActivo()) {
							gym.darDeBaja(gym.buscarPorDni(dni));
						}else {
							System.out.println("El cliente ya está dado de baja");
						}
					}
					break;
				case 5:
					System.out.printf("El IMC medio de todos los clientes activos es: %.2f\n", gym.calcularMediaIMC());
					break;
				case 0:
					break;
				default:
					System.out.println("Elija una opción válida");
					break;
			}
		} while (opcionMenu != 0);
		
		System.out.println("Gracias por usar GimnAppsio");
		
		
	}

}
