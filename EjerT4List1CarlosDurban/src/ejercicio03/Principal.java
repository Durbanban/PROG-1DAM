package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String marca, modelo, numBastidor, tipoCombustible;
		double impuesto = 0.0, precio = 0.0, cargaMax = 0, impuestoFurgo = 0;
		int cilindrada = 0, potencia = 0, numPuertas = 0, stock = 0, opcionMenu = 0, posicionVehiculo = 0;
		boolean carenado, vendido = false;
		char opcionCarenado;
		
		System.out.println("Bienvenido a ConcesionApprio");
		System.out.println("Indique el número de vehículos que puede tener en stock");
		stock = Leer.datoInt();
		Vehiculo [] listaStockage = new Vehiculo [stock];
		Gestion g = new Gestion (listaStockage);
		System.out.println("Indique la cantidad el impuesto en su área");		
		impuesto = Leer.datoDouble();	
		
		mostrarMenu();
		
		switch (opcionMenu) {
			case 1:
				System.out.println("Indique la marca del vehículo");		
				marca = Leer.dato();		
				System.out.println("Indique el modelo del vehículo");		
				modelo = Leer.dato();		
				System.out.println("Indique la cilindrada del vehículo");
				cilindrada = Leer.datoInt();
				System.out.println("Indique la potencia del vehículo");
				potencia = Leer.datoInt();
				System.out.println("Indique el tipo de Combustible (gasolina / diesel)");	
				tipoCombustible = Leer.dato();
				System.out.println("Indique el precio del vehículo");
				precio = Leer.datoDouble();
				System.out.println("Indique número de bastidor");
				numBastidor = Leer.dato();
				System.out.println("Indique número de puertas");
				numPuertas = Leer.datoInt();
				
				Vehiculo c = new Coche (numBastidor, numPuertas, marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
				
				g.addVehiculo(c, posicionVehiculo);
				
				posicionVehiculo ++;				
				break;
			case 2:
				System.out.println("Indique la marca del vehículo");		
				marca = Leer.dato();		
				System.out.println("Indique el modelo del vehículo");		
				modelo = Leer.dato();		
				System.out.println("Indique la cilindrada del vehículo");
				cilindrada = Leer.datoInt();
				System.out.println("Indique la potencia del vehículo");
				potencia = Leer.datoInt();
				System.out.println("Indique el tipo de Combustible (gasolina / diesel)");	
				tipoCombustible = Leer.dato();
				System.out.println("Indique el precio del vehículo");
				precio = Leer.datoDouble();
				System.out.println("Indique número de bastidor");
				numBastidor = Leer.dato();
				System.out.println("Indique si tiene carenado (s/n)");
				opcionCarenado = Leer.datoChar();
				
				while (opcionCarenado != 's' && opcionCarenado != 'n') {
					System.out.println("Indique una opción válida por favor (s/n)");
					opcionCarenado = Leer.datoChar();
				}
				if (opcionCarenado == 's') {
					carenado = true;
				}else {
					carenado = false;
				}
				
				Vehiculo m = new Motocicleta (numBastidor, carenado, marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
				
				g.addVehiculo(m, posicionVehiculo);
				
				posicionVehiculo ++;
				break;
			case 3:
				System.out.println("Indique la marca del vehículo");		
				marca = Leer.dato();		
				System.out.println("Indique el modelo del vehículo");		
				modelo = Leer.dato();		
				System.out.println("Indique la cilindrada del vehículo");
				cilindrada = Leer.datoInt();
				System.out.println("Indique la potencia del vehículo");
				potencia = Leer.datoInt();
				System.out.println("Indique el tipo de Combustible (gasolina / diesel)");	
				tipoCombustible = Leer.dato();
				System.out.println("Indique el precio del vehículo");
				precio = Leer.datoDouble();
				System.out.println("Indique número de bastidor");
				numBastidor = Leer.dato();
				System.out.println("Indique la carga máxima");
				cargaMax = Leer.datoDouble();
				System.out.println("Indique el impuesto sobre las furgonetas en su área");
				impuestoFurgo = Leer.datoDouble();
				
				Vehiculo f = new Furgoneta (numBastidor, cargaMax, impuestoFurgo, marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
				
				g.addVehiculo(f, posicionVehiculo);
				
				posicionVehiculo ++;
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				break;
			default:
				System.out.println("Porfavor, indique una opción válida");
				break;
		}
		
		
	
		System.out.println("Indique la marca del vehículo");		
		marca = Leer.dato();		
		System.out.println("Indique el modelo del vehículo");		
		modelo = Leer.dato();		
		System.out.println("Indique la cilindrada del vehículo");
		cilindrada = Leer.datoInt();
		System.out.println("Indique la potencia del vehículo");
		potencia = Leer.datoInt();
		System.out.println("Indique el tipo de Combustible (gasolina / diesel)");	
		tipoCombustible = Leer.dato();
		System.out.println("Indique el precio del vehículo");
		precio = Leer.datoDouble();
		System.out.println("Indique número de bastidor");
		numBastidor = Leer.dato();
		System.out.println("Indique número de puertas");
		numPuertas = Leer.datoInt();
		System.out.println("Indique si tiene carenado (s/n)");
		opcionCarenado = Leer.datoChar();
		
		while (opcionCarenado != 's' && opcionCarenado != 'n') {
			System.out.println("Indique una opción válida por favor (s/n)");
			opcionCarenado = Leer.datoChar();
		}
		if (opcionCarenado == 's') {
			carenado = true;
		}else {
			carenado = false;
		}
		
		System.out.println("Indique la carga máxima");
		cargaMax = Leer.datoDouble();
		System.out.println("Indique el impuesto sobre las furgonetas en su área");
		impuestoFurgo = Leer.datoDouble();
		
		Vehiculo v = new Vehiculo (marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
		
		
		

		
		
		
		
		
		

	}
	
public static void mostrarMenu () {
	System.out.println("Pulse 1 para añadir un coche al stock");
	System.out.println("Pulse 2 para añadir una motocicleta al stock");
	System.out.println("Pulse 3 para añadir una furgoneta al stock");
	System.out.println("Pulse 4 para vender un vehículo");
	System.out.println("Pulse 5 para mostrar la recaudación total del día");
	System.out.println("Pulse 0 para salir");
}

}
