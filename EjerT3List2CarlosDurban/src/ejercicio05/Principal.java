package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu = 0, tam = 0, numElec = 0, opcionProducto = 0;
		double precioElec = 0.0, pesoElec = 0.0;
		String colorElec;
		char consumoElec;
		Tienda tienda;
		Electrodomestico elec;
				
		System.out.println("Bienvenido a ElectromesticApp");		
		System.out.println("¿Cuántos electrodomésticos tiene en stock?");
		tam = Leer.datoInt();
		Electrodomestico [] listaElectro = new Electrodomestico [tam];
		do {
			System.out.println("Indique el precio del producto " + (numElec + 1));
			precioElec = Leer.datoDouble();
			System.out.println("Indique el color (rojo, azul, negro, gris o blanco) del producto " + (numElec + 1));
			colorElec = Leer.dato();
			System.out.println("Indique el consumo (A, B, C, D, E ó F) del producto " + (numElec + 1));
			consumoElec = Leer.datoChar();
			System.out.println("Indique el peso del producto " + (numElec + 1) + " (en kg)");
			pesoElec = Leer.datoDouble();
			
			elec = new Electrodomestico (precioElec, Electrodomestico.comprobarColor(colorElec), Electrodomestico.comprobarConsumoEnergetico(consumoElec), pesoElec);
			listaElectro [numElec] = elec;
			numElec++;
			
		} while (numElec < listaElectro.length);
		
		tienda = new Tienda (listaElectro);
		
		do {		
		tienda.mostrarMenuPrincipal();		
		opcionMenu = Leer.datoInt();
		
			switch (opcionMenu) {
				case 1:
					tienda.mostrarStock();
					break;
				case 2:
					tienda.mostrarStock();
					System.out.println("Por favor, elija un producto de la lista");
					opcionProducto = Leer.datoInt();
					tienda.mostrarPrecioFinal(opcionProducto);
					break;
				case 3:
					System.out.printf("La suma de los precios finales de todos los productos es: %.2f €\n", tienda.sumarPrecios());
					break;
				case 4:
					System.out.printf("La media de los precios finales de todos los productos es: %.2f €\n", tienda.calcularMediaPrecios());
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción correcta");
					break;
			}
		} while (opcionMenu != 0);

	}

}
