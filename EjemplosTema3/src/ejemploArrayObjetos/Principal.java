package ejemploArrayObjetos;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam = 0, contador = 0, seguir = 0;
		double potencia = 0.0;
		String modelo;
		Vehiculo [] listado;
		
		System.out.println("¿Cuántos vehículo quiere guardar?");
		
		tam = Leer.datoInt();
		
		listado = new Vehiculo [tam];
		
		do {
			System.out.println("Introduzca el nombre del modelo del vehículo: ");
			modelo = Leer.dato();
			System.out.println("Introduzca la potencia del motor: ");
			potencia = Leer.datoDouble();
			listado [contador] = new Vehiculo (modelo, potencia);
			contador ++;
			System.out.println("Si desea terminar pulse 0.");
			System.out.println("Para seguir pulse cualquier número");
			seguir = Leer.datoInt();
			
			
		} while (seguir != 0 && contador < listado.length);
		
		System.out.println(listado [1].toString()); // Imprime todos los atributos del vehículo seleccionado
		System.out.println(listado [1].getPotencia()); // Imprime el atributo potencia del vehículo seleccionado
		
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado [i]); // Imprime todos los atributos de todos los vehículos que conforman la lista
			
		}

	}

}
