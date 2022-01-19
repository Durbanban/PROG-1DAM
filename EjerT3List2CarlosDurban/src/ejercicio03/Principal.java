package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidadMoviles = 0, contador = 0;
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
		
		
		
		
		

	}

}
