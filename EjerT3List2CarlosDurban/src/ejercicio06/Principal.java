package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu = 0, aforoMax = 0, idEntradas = 1, numFila = 1, numButaca = 1, indiceEntradas = 0, idCompra = 0;
		double precioEntrada = 0.0, precioNuevo = 0.0;
		Entrada entrada;
		
		System.out.println("Bienvenido a Cines Casco");
		System.out.println("Introduzca el número de aforo máximo de la sala");
		aforoMax = Leer.datoInt();
		System.out.println("Introduzca el precio");
		precioEntrada = Leer.datoDouble();
		Entrada [] entradas = new Entrada [aforoMax];
		
		Sala sala = new Sala (1, aforoMax, entradas, 0.0);
		
		do {
			
			entrada = new Entrada (idEntradas, precioEntrada, true, numFila, numButaca);
			sala.getLocalidades() [indiceEntradas] = entrada;
			indiceEntradas ++;
			idEntradas ++;
			numButaca ++;
			if (numButaca == 11) {
				numFila ++;
				numButaca = 1;
			}
			
		}while (idEntradas <= aforoMax);
		
		do {
			Sala.mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					sala.mostrarCartelera();
					break;
				case 2:
					sala.mostrarEntradas();
					System.out.println("Indique el id de la entrada que desea comprar");	
					idCompra = Leer.datoInt();
					sala.comprarEntrada(idCompra);
					break;
				case 3:
					sala.mostrarGanancias();
					break;
				case 4:
					System.out.println("Indique el id de la entrada que desea modificar su precio");
					idCompra = Leer.datoInt();
					System.out.println("Indique el precio que desea fijar");
					precioNuevo = Leer.datoDouble();
					sala.modificarPrecio(idCompra, precioNuevo);
					break;
				case 5:
					System.out.println("Actualmente hay " + sala.calcularLocalidadesDisponibles() + " asientos disponibles");
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor, elija una opción correcta");
					break;
			}
		} while (opcionMenu != 0);
		System.out.println("Gracias por usar el programa");

	}

}
