package ejercicio03;

import java.util.Arrays;

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
	
	public void addVehiculo (Vehiculo v, int posicion) {
		listaVehiculos [posicion] = v;
	}
	
	public void mostrarVehiculos () {
		for (int i = 0; i < listaVehiculos.length; i++) {
			if (listaVehiculos [i] == null) {
				System.out.println("En fabricación");
			}else {
				System.out.println((i + 1) + ". " + listaVehiculos [i]);
			}
		}
	}
	
	public void mostrarVehiculoVendido (int posicion, double impuesto) {
		System.out.println(listaVehiculos [posicion - 1] + "Se ha vendido por " + listaVehiculos [posicion - 1].calcularImpuesto(impuesto) + " €");
	}
	
	public void venderVehiculo (int posicion, double impuesto) {
		if (listaVehiculos [posicion - 1] != null) {
			if (listaVehiculos [posicion - 1].isVendido()) {
				System.out.println("Este vehículo ya se ha vendido");
			}else {
				listaVehiculos [posicion - 1].setVendido(true);
				recaudacion += listaVehiculos [posicion - 1].calcularImpuesto(impuesto);
				mostrarVehiculoVendido(posicion, impuesto);
			}
			
		}else {
			System.out.println("Este vehículo no está fabricado aún");
		}
	}
	
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
	
	public void mostrarRecaudacion () {
		System.out.println(recaudacion);
	}
	
	
	

}
