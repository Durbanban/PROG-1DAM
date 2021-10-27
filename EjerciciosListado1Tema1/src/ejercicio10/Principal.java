package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 10
		/*Escribir un programa que sea capaz de calcular el precio final de un producto.
		 * El cliente se lleva 4 unidades del producto por lo que se le aplica un descuento
		 * del 20% al precio total
		 */
		double precioUd = 19.99, porcentaje = 20.0, precioFinal = 0.0, descuento = 0, ud = 4.0, totalCompra = 0.0, divisor = 100.0;
		System.out.println("Bienvenido a la tienda de sellos caros:");
		System.out.println("Se va a calcular el precio final de la compra\n\n");
		totalCompra = precioUd * ud;
		System.out.printf("El total de compra es %.2f euros\n", totalCompra);
		descuento = (totalCompra * porcentaje)/divisor;
		precioFinal = totalCompra - descuento;
		System.out.printf("Por llevarse %.0f unidades, al cliente se le aplica un %.0f %% de descuento\n"
				+ "y la compra se queda en %.2f euros\n\n", ud, porcentaje, precioFinal);
		System.out.println("Gracias por usar el programa");
		System.out.println("Desconectando...");
		

	}

}
