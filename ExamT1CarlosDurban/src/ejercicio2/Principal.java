package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 2
		//JAMAS SE PONEN LAS VARIABLES QUE REPRESENTAN UNIDADES COMO DOUBLE. SON INT.
		double precioUNoche = 120.0, precioUCopaJD = 8.0, precioUCantFB = 32.50, porcentaje = 5.0, divisor = 100.0,
				udNoche = 5.0, udCopaJD = 3.0, udCantFB = 2.0, desc = 0.0, precioTNoche = 0.0, precioTCopaJD = 0.0,
				precioTCantFB = 0.0, precioTotal = 0.0, precioFinal = 0.0, saldoBanco = 500.0;
		String noche = "Suite Google", copaJD = "Copa Jack Daniels", cantFB = "Cena Cantina Facebook", total = "Total",
				totalDescuento = "Total con descuento", descuento = "Descuento";
		
		System.out.println("\t\t\t\t\t\tBienvenido a Silicon Hotel\n");
		System.out.println("*************************************************************"
				+ "******************************************************************");
		System.out.println("Artículo\t\t\t\tPrecio Unitario\t\t\t\tCantidad\t\t\t\tTotal\n");
		
		precioTNoche = precioUNoche * udNoche;
		
		System.out.printf("%s\t\t\t\t%.2f$\t\t\t\t\t%.0f\t\t\t\t\t%.2f$\n", noche, precioUNoche, udNoche, precioTNoche);
		
		precioTCopaJD = precioUCopaJD * udCopaJD;
		
		System.out.printf("%s\t\t\t%.2f$\t\t\t\t\t%.0f\t\t\t\t\t%.2f$\n", copaJD, precioUCopaJD, udCopaJD, precioTCopaJD);
		
		precioTCantFB = precioUCantFB * udCantFB;
		
		System.out.printf("%s\t\t\t%.2f$\t\t\t\t\t%.0f\t\t\t\t\t%.2f$\n", cantFB, precioUCantFB, udCantFB, precioTCantFB);
		
		precioTotal = precioTNoche + precioTCopaJD + precioTCantFB;
		
		System.out.printf("%s\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f$\n", total, precioTotal);
		
		desc = -(precioTotal * porcentaje) / divisor; //LOS DESCUENTOS SE GUARDAN COMO NÚMEROS POSITIVOS. PARA HACERLOS NEGATIVOS SE PONE UN "-" EN EL SYSO.
		System.out.printf("%s\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f$\n", descuento, desc);
		
		precioFinal = precioTotal + desc;
		
		System.out.printf("%s\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f$\n\n", totalDescuento, precioFinal);
		System.out.println("******************************************************************"
				+ "*************************************************************");
		System.out.println("\t\t\t\t\t\tGracias por su estancia");
		System.out.println("\t\t\t\t\t\t¡Vuelva pronto!\n\n");
		
		
		System.out.println("Bienvenido a Banca Tiesa");
		System.out.printf("Su saldo actualmente es: %.2f$\n", saldoBanco);
		System.out.printf("Notificación de gasto: %.2f$\n", precioFinal);
		
		saldoBanco = saldoBanco - precioFinal;
		
		System.out.printf("Su saldo actualmente es: %.2f$\n", saldoBanco);
		System.out.println("Gracias por consultar sus operaciones");
		System.out.println("Ahorre un poco");
		
	}

}
