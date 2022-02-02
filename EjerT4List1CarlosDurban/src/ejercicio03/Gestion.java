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
	
	

}
