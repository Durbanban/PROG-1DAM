package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1
		/*El precio final de venta de un automóvil nuevo para un comprador es la suma total
		 *de: el costede fabricación del vehículo, el porcentaje  de la ganancia del vendedor 
		 *y los impuestos estatales aplicables (sobre el coste de fabricación). Suponer una
		 *ganancia del vendedor del 15 % en cada coche y un impuesto del 12.5% y diseñar un
		 *programa para calcular el precio final de un automóvil e imprimirlo por pantalla.
		 *Para ello, vosotros asignaréis el coste de fabricación del coche y se deben realizar
		 *los cálculos para un solo vehículo.
		 */
		double precioF = 0.0, precioI = 65500, vendedor = 0.0, impuestos = 0.0,
		porcImpuesto = 12.5, porcVendedor = 15.0, divisor = 100.0;
		
		System.out.println("Bienvenido al concesionario");
		System.out.println("En este programa se va a calcular el precio de su coche\n");
		
		System.out.printf("Ha elegido el modelo con valor de %.2f euros\n\n", precioI);
		
		vendedor = (precioI * porcVendedor) / divisor;
		
		System.out.printf("El vendedor se lleva un %.0f %% del valor de fábrica "
				+ "que equivale a %.2f euros\n", porcVendedor, vendedor);
		
		impuestos = (precioI * porcImpuesto) / divisor;
		
		System.out.printf("La tasa de impuestos supone un %.1f %% del valor de fábrica "
				+ "que equivale a %.2f euros\n", porcImpuesto, impuestos);
		
		precioF = precioI + vendedor + impuestos;
		
		System.out.printf("El precio final de su coche es de %.2f euros\n", precioF);
		System.out.println("\nGracias por usar el programa\nDisfrute de su coche\nDesconectando...");
				
		

	}

}
