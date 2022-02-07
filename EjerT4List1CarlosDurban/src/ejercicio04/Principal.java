package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu = 0, contador = 0, tam = 7;
		double impuesto = 50.0;
		double descuento = 33.0;
		
		Producto p1 = new Alimentacion (3.99, "Desodorante", "A001", 1);
		Producto p2 = new Alimentacion (17.99, "Atún rojo", "A002", 3);
		Producto p3 = new Alimentacion (0.25, "Huevos XL", "A003", 2);
		Producto p4 = new Ropa (29.99, "Jersey lana", "R001", 3);
		Producto p5 = new Ropa (94.99, "Abrigo de Piel", "R002", 4);
		Producto p6 = new Electronica (399.95, "Tablet Surface", "E001", true);
		Producto p7 = new Electronica (69.95, "Ratón Gaming Logitech G500", "E002", false);
		
		LineaVenta lv1 = new LineaVenta (p4, 2);
		LineaVenta lv2 = new LineaVenta (p1, 3);
		LineaVenta lv3 = new LineaVenta (p5, 1);
		LineaVenta lv4 = new LineaVenta (p2, 3);
		LineaVenta lv5 = new LineaVenta (p3, 12);
		LineaVenta lv6 = new LineaVenta (p6, 1);
		
		LineaVenta [] conjuntoLv = {lv1, lv2, lv3, lv4, lv5, lv6};
		
		Venta v = new Venta (conjuntoLv);
		
		
		System.out.println("Bienvenido a TiendApp");
		
		do {
			mostrarMenu ();
			opcionMenu = Leer.datoInt();
			
			switch (opcionMenu) {
				case 1:
					v.mostrarTicket(impuesto, descuento);
					break;
				case 2:
					v.listarProductos();
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción correcta");
					break;
			}
		}while (opcionMenu != 0);
		
		System.out.println("Gracias por usar el programa");
		

	}
	
	public static void mostrarMenu () {
		System.out.println("\n\nPulse 1 para imprimir el ticket de venta");
		System.out.println("Pulse 2 para listar todos los productos guardados");
	}

}
