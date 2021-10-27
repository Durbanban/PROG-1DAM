package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 3
		/*Hacer un programa que “imite” un cutre ticket de un McDonals. Para ello, se debe mostrar:
			* Quién lo atendió: Vuestro nombre
			* Fecha: (usando un String, no el tipo fecha de java)
			* Patatas medianas: Precio
			* Bebida mediana: precio
			* Hamburguesa Mc Royal: Precio
			* Total a pagar: Suma de los 3 precios.
			* Entregado: Cantidad entregada
			* Cambio: Cambio a devolver
			*/
		System.out.println("\t\t\t\t\tBienvenido a McDonald's\n");
		System.out.println("\t\t\t\t\tAtendido por: Durbán\n\t\t\t\t\t"
				+ "Fecha: 06/10/2021\n");
		System.out.println("********************************************************"
				+ "*****************************************************");
		double precPatM = 2.50, precBebM = 1.50, precHamMcRoyal = 5.95, total = 0.0, udPatM = 1.0,
				udBebM = 1, udHamMcRoyal= 0.0, precFPatM = 0.0, precFBebM = 0.0, precFHamMcRoyal = 0.0,
				entregado = 10.0, cambio = 0.0;
		String patM = "Patatas medianas", bebM = "Bebida mediana", hamMcRoyal = "Hamburguesa Mc Royal";
		System.out.println("Artículo\t\t\tPrecio unitario\t\t\tCantidad\t\t\tPrecio final");
		precFPatM = precPatM * udPatM;
		precFBebM = precBebM * udBebM;
		precFHamMcRoyal = precHamMcRoyal * udHamMcRoyal;
		System.out.printf("%s\t\t%.2f\t\t\t\t%.0f\t\t\t\t%.2f\n", patM, precPatM, udPatM, precFPatM );
		System.out.printf("%s\t\t\t%.2f\t\t\t\t%.0f\t\t\t\t%.2f\n", bebM, precBebM, udBebM, precFBebM);
		System.out.printf("%s\t\t%.2f\t\t\t\t%.0f\t\t\t\t%.2f\n", hamMcRoyal, precHamMcRoyal, udHamMcRoyal, precFHamMcRoyal);
		total = precFPatM + precFBebM + precFHamMcRoyal;
		System.out.printf("Total\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", total);
		cambio = entregado - total;
		System.out.printf("Entregado\t\t\t\t\t\t\t\t\t\t\t%.2f\n", entregado);
		System.out.printf("A devolver\t\t\t\t\t\t\t\t\t\t\t%.2f\n", cambio);
		
		System.out.println("**********************************************************"
				+ "***************************************************\n");
		System.out.println("\t\t\t\t\tGracias por su compra\n");
		System.out.println("\t\t\t\t\tVuelva pronto");
	}

}
