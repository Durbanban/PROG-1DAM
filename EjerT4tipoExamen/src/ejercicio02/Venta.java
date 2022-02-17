package ejercicio02;

import java.util.Arrays;

public class Venta {
	
	private Producto [] listaProductos;
	private static double recaudacion;
	
	
	public Venta(Producto[] listaProductos) {
		super();
		this.listaProductos = listaProductos;
		Venta.recaudacion = 0;
	}


	public Producto[] getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}


	public static double getRecaudacion() {
		return recaudacion;
	}


	public static void setRecaudacion(double recaudacion) {
		Venta.recaudacion = recaudacion;
	}


	@Override
	public String toString() {
		return "Venta [listaProductos=" + Arrays.toString(listaProductos) + "]";
	}
	
	
	
	
	

}
