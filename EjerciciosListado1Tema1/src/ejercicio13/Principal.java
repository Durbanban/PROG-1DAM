package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 13
		/*Imprime por pantalla un ticket de una tienda. El empleado se llama "John Snow"
		 * y el cliente ha comprado dos las de Coca Cola a 70 céntimos, una bolsa de
		 * pipas a 0.40 € y una espada llamada "Garra" que cuesta 150 €. No hace falta
		 * calcular la devolución de la compra.
		 */
		String empleado = "John Snow", cola = "CocaCola", pipas = "Pipas girasol", garra = "Espada Garra", desc = "desc";
		double precioCola = 0.7, precioPipas = 0.4, precioGarra = 150.0, precioFCola = 0.0,
				precioFPipas = 0.0, precioFGarra = 0.0, precioTotal = 0.0, porcentajeGarra = 20.0, divisor = 100,
				descGarra =0.0, precioGarraDescontado = 0.0;
		int udCola = 2, udPipas = 1, udGarra = 1, udDesc = 1;
		
		System.out.println("\t\tBienvenido a la tienda más allá del muro.");
		System.out.printf("\t\tAtendido por %s\n\n", empleado);
		System.out.println("************************************************************************");
		System.out.println("Artículo\tPrecio unitario\t\tUnidad\t\tPrecio final");
		
		precioFCola = precioCola * udCola;
		
		System.out.printf("%s\t%.2f\t\t\t%d\t\t%.2f\n", cola, precioCola, udCola, precioFCola);
		
		precioFPipas = precioPipas * udPipas;
		
		System.out.printf("%s\t%.2f\t\t\t%d\t\t%.2f\n", pipas, precioPipas, udPipas, precioFPipas);
		
		precioFGarra = precioGarra * udGarra;
		
		System.out.printf("%s\t%.2f\t\t\t%d\t\t%.2f\n", garra, precioGarra, udGarra, precioFGarra);
		
		descGarra = (precioGarra * porcentajeGarra)/divisor;
		precioGarraDescontado = precioFGarra - descGarra;
		
		System.out.printf("%s\t-%.2f\t\t\t%d\t\t-%.2f\n", desc, descGarra, udDesc, descGarra);
		
		precioTotal = precioFCola + precioFPipas + precioGarraDescontado;
		
		System.out.println("************************************************************************");
		System.out.printf("Total\t\t\t\t\t\t\t%.2f\n", precioTotal);
		System.out.println("\n\t\tGracias por su compra");
		System.out.println("\t\tAbríguese");
		
	}

}
