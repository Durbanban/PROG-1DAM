package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 6
		/*Realizar un programa que escriba el precio de un producto en una compra, una vez
		 * descontado el tanto por ciento de descuento, dando nosotros en la declaración
		 * de las variables el precio inicial y el tanto por ciento que se va a descontar.
		 * Ojo, el cálculo del tanto por ciento lo debe hacer el programa no el usuario
		 */
		double precioInicial = 25.0, porcentaje = 20.0, divisor = 100.0, precioFinal = 0.0, descuento = 0.0; 
		System.out.println("Bienvenido a Nike \n\n");
		descuento = (precioInicial * porcentaje)/divisor;
		precioFinal = precioInicial - descuento;
		System.out.printf("El precio del pantalón largo es de %.2f euros, pero si se le aplica un %.0f"
				+ " por ciento de descuento se queda en %.2f euros\n", precioInicial, porcentaje, precioFinal);
		System.out.println("Gracias por su compra\n\n");
		System.out.println("Desconectando...");
		

	}

}
