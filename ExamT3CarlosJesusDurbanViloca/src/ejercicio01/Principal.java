package ejercicio01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String direccionPiso = "";
		int m2Piso = 0, precioPiso = 0, reforma = 0, idInmo = 1, opcionMenu = 0, porcentajeInmo = 0, opcionMes = 0;
		boolean reformaPiso = false;
		int [] arrayPrecios = new int[6];
		double conversorLibras = 0.88, precioVentaMes = 0.0;
		Piso piso;
		Inmobiliaria inmo;
		
		System.out.println("Bienvenido a la inmobiliaria DUP (Debajo Un Puente");
		System.out.println("Indique la dirección del inmueble");
		direccionPiso = Leer.dato();
		System.out.println("Indique los metros cuadrados del inmueble");
		m2Piso = Leer.datoInt();
		do {
			System.out.println("Indique si está para reformar el inmueble");
			System.out.println("Pulse 1 si la respuesta es afirmativa");
			System.out.println("Pulse 2 si la respuesta es negativa");
			reforma = Leer.datoInt();
			switch (reforma) {
				case 1:
					reformaPiso = true;
					break;
				case 2:
					break;
				default:
					System.out.println("Elija una opción correcta");
					break;
					
			} 
		}while (reforma > 2 || reforma < 1);
		System.out.println("Indique el precio de venta que percibe el cliente");
		precioPiso = Leer.datoInt();
		piso = new Piso (direccionPiso, m2Piso, reformaPiso, precioPiso);
		inmo = new Inmobiliaria (idInmo, piso, arrayPrecios);
		inmo.menuPrincipal();
		opcionMenu = Leer.datoInt();
		do {
			inmo.menuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					inmo.rellenarArray();
					arrayPrecios = inmo.getPrecio6Meses();
					for (int i = 0; i < arrayPrecios.length; i++) {
						System.out.println(arrayPrecios[i]);
					}
					break;
				case 2:
					System.out.println("Indique el porcentaje para la inmobiliaria");
					porcentajeInmo = Leer.datoInt();
					System.out.println("Indique el mes de venta (de 1 a 6)");
					opcionMes = Leer.datoInt();
					while (opcionMes >=1 && opcionMes <= 6) {
						precioVentaMes = inmo.calcularPrecioVenta(porcentajeInmo, opcionMes);
					}
					System.out.println("El precio para ese mes es: " + precioVentaMes + " €");
					break;
				case 3:
					System.out.println("El precio del metro cuadrado es " + inmo.calcularPrecioM2(piso.getPrecioVenta(), piso.getMetrosCuadrados()) + " €");
					break;
				case 4:
					System.out.println("El precio en libras esterlinas es " + inmo.cambioDivisa(conversorLibras, piso.getPrecioVenta()) + " libras");
					break;
				case 5:
					inmo.mostrarPiso(piso);
					break;
				case 0:
					break;
				default:
					System.out.println("Elija una opción correcta");
			}
			
		}while (opcionMenu != 0);
		
		
		

	}

}
