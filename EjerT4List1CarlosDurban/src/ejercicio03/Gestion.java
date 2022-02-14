package ejercicio03;

import java.util.Arrays;

/**
 * 
 * Esta clase se utiliza para hacer operaciones en la app del concesionario
 * 
 * @author DURBAN
 * @version 1.0
 * 
 */

public class Gestion {
	
	private Vehiculo [] listaVehiculos;
	public static double recaudacion;
	
	public Gestion (Vehiculo [] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public Vehiculo[] getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Vehiculo[] listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	

	@Override
	public String toString() {
		return "Gestion [listaVehiculos=" + Arrays.toString(listaVehiculos) + "]";
	}
	
	/**
	 * 
	 * Este método se encarga de añadir un nuevo vehículo a la lista de vehículos
	 * 
	 * @param v Vehículo añadido por el usuario
	 * @param posicion Lugar en el array donde se guarda
	 */
	public void addVehiculo (Vehiculo v, int posicion) {
		// Tanto el vehículo como la posición las proporciona el usuario
		listaVehiculos [posicion] = v;
	}
	
	/**
	 * 
	 * Este método va a mostrar por pantalla la lista existente de vehículos actual
	 * 
	 */
	
	public void mostrarVehiculos () {
		for (int i = 0; i < listaVehiculos.length; i++) {
			if (listaVehiculos [i] == null) {
				System.out.println("En fabricación");
			}else {
				System.out.println((i + 1) + ". " + listaVehiculos [i]);
			}
		}
	}
	
	/**
	 * 
	 * @param posicion Donde se guarda el vehículo seleccionado
	 * @param impuesto Se le pregunta al usuario 
	 */
	
	public void mostrarVehiculoVendido (int posicion, double impuesto) {
		// Importante poner - 1 a la posición elegida, para que concuerde la lista con el array
		System.out.println(listaVehiculos [posicion - 1] + "Se ha vendido por " + listaVehiculos [posicion - 1].calcularImpuesto(impuesto) + " €");
	}
	
	/**
	 * 
	 * Este método se encarga de seleccionar un vehículo y venderlo
	 * 
	 * @param posicion Selección del vehículo
	 * @param impuesto Proporcionado por el usuario
	 */
	
	public void venderVehiculo (int posicion, double impuesto) {
		if (listaVehiculos [posicion - 1] != null) {
			if (listaVehiculos [posicion - 1].isVendido()) {
				// Comprobación de que el vehículo esté o no vendido
				System.out.println("Este vehículo ya se ha vendido");
			}else {
				listaVehiculos [posicion - 1].setVendido(true);
				// Aumenta la recaudación para calcularla
				recaudacion += listaVehiculos [posicion - 1].calcularImpuesto(impuesto);
				mostrarVehiculoVendido(posicion, impuesto);
			}
			
		}else {
			System.out.println("Este vehículo no está fabricado aún");
		}
	}
	
	
	/**
	 * 
	 * Este método nos dice de qué tipo (instancia) es el vehículo
	 * 
	 */
	public void mostrarTipo () {
		for (int i = 0; i < listaVehiculos.length; i++) {
			if (listaVehiculos[i] instanceof Motocicleta) {
				System.out.println("El vehículo es una moto");
			}else if (listaVehiculos [i] instanceof Coche) {
				System.out.println("El vehículo es un coche");
			}else if (listaVehiculos [i] instanceof Furgoneta ){
				System.out.println("El vehículo es una furgoneta");
			}else {
				System.out.println("En fabricación");
			}
		}
	}
	
	
	/**
	 * 
	 * Este método muestra la recaudación
	 * 
	 */
	public void mostrarRecaudacion () {
		System.out.println(recaudacion);
	}
	
	
	

}
