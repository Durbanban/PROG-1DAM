package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 0, numH = 0, aux = 0;
		double costeExtra = 100.0;
		Habitacion listado [] = {new Habitacion (1, 50, true, "Miguel", 2, true, true), new Habitacion (2, 100, true, "Rafa", 3, true, true)};
		Hotel h;		
		h = new Hotel ("Magic", listado);
		
		System.out.printf("Bienvenido al hotel %s\n", h.getNombre());
		
		// listado = new Habitacion [tam];
		
		h.imprimirListado();
		
		System.out.println("¿Qué habitación quiere consultar?");
		numH = Leer.datoInt();
		h.imprimirLimpia(numH);
		
		System.out.println("¿De qué habitación quiere consultar el precio?");
		aux = Leer.datoInt();
		
		
		System.out.println(h.calcularPrecioExtras(aux, costeExtra));
		
		
		
		
		

	}

}
