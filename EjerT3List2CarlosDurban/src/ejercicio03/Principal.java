package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadMoviles = 0, contador = 0, opcion = 0, opcionMovilPrecio = 0, descuentoMovil = 0, opcionCaso3 = 0;
		String marca;
		String modelo;
		double precio = 0.0, recaudacion = 0.0;
		Vendedor v;
		Movil [] moviles;
		System.out.println("Bienvenido al vendedor móvil");
		System.out.println("¿Cuántos móviles tiene en stock?");
		cantidadMoviles = Leer.datoInt();
		moviles = new Movil [cantidadMoviles];
		
		do {
			System.out.println("Indique la marca del móvil " + (contador + 1) + " de la lista");
			marca = Leer.dato();
			System.out.println("Indique el modelo del móvil " + (contador + 1) + " de la lista");
			modelo = Leer.dato();
			System.out.println("Indique el precio unitario del móvil " + (contador + 1) + " de la lista");
			precio = Leer.datoDouble();
			moviles [contador] = new Movil (marca, modelo, false, precio);
			contador ++;
		}while (contador < cantidadMoviles);
		
		v = new Vendedor (moviles, recaudacion);
		
		do {
			v.menuPrincipal();
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					v.mostrarMoviles();
					break;
				case 2:
					v.mostrarMovilesVendidos();
					break;
				case 3:
					v.mostrarMoviles();
					System.out.println("Introduzca el número del móvil que quiere");
					opcionMovilPrecio = Leer.datoInt();
					System.out.println("Introduzca el descuento deseado");
					descuentoMovil = Leer.datoInt();
					v.mostrarPrecioFinal(opcionMovilPrecio, descuentoMovil);
					System.out.println("Pulse 1 para vender el móvil");
					System.out.println("Pulse 0 para volver al menú principal");
					opcionCaso3 = Leer.datoInt();
					if (opcionCaso3 == 1) {
						
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Elija una opción correcta");
					break;
			}
			
		} while (opcion != 0);
		
		
		
		
		
		
		

	}

}
