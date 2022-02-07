package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu = 0, contador = 0, tam = 7;
		
		Producto p1 = new Alimentacion (3.99, "Desodorante", "A001", false);
		Producto p2 = new Alimentacion (17.99, "Atún rojo", "A002", false);
		Producto p3 = new Alimentacion (2.99, "Docena Huevos XL", "A003", true);
		Producto p4 = new Ropa (29.99, "Chaqueta Vaquera", "R001", 3);
		Producto p5 = new Ropa (94.99, "Abrigo de Piel", "R002", 4);
		Producto p6 = new Electronica (399.95, "Tablet Surface XL", "E001", true);
		Producto p7 = new Electronica (69.95, "Ratón Gaming Logitech G500", "E002", false);
		
		LineaVenta lv1 = new LineaVenta (p4, 2);
		LineaVenta lv2 = new LineaVenta (p1, 3);
		LineaVenta lv3 = new LineaVenta (p5, 1);
		LineaVenta lv4 = new LineaVenta (p2, 3);
		
		LineaVenta [] conjuntoLv = {lv1, lv2, lv3, lv4};
		
		Venta v = new Venta (conjuntoLv);
		
		
		System.out.println("Bienvenido a TiendApp");
		mostrarMenu ();
		opcionMenu = Leer.datoInt();
		
		switch (opcionMenu) {
			case 1:
				break;
			case 2:
				break;
			case 0:
				break;
			default:
				System.out.println("Por favor elija una opción correcta");
				break;
		}
		

	}
	
	public static void mostrarMenu () {
		System.out.println("Pulse 1 para imprimir el ticket de venta");
		System.out.println("Pulse 2 para listar todos los productos guardados");
		System.out.println("Pulse 1 para");
		System.out.println("Pulse 1 para");
		System.out.println("Pulse 1 para");
	}

}
