package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 0, opcionMenu = 0, edadCliente = 0;
		String dni, nombre;
		boolean activo;
		double pesoCliente = 0.0, alturaCliente = 0.0;
		
		System.out.println("Bienvenido al Gimnasio ");
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
					
					gym.addCliente(c);
					gym.mostrarClientes();
					
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					break;
			}
		} while (opcionMenu != 0);
		
		
	}

}
