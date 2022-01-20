package ejercicio03;

public class Vendedor {
	
	private Movil [] listaMoviles;
	private double recaudacion;
	
	
	public Vendedor(Movil[] listaMoviles, double recaudacion) {
		this.listaMoviles = listaMoviles;
		this.recaudacion = recaudacion;
	}

	public Vendedor() {
		
	}

	public Movil[] getListaMoviles() {
		return listaMoviles;
	}

	public void setListaMoviles(Movil[] listaMoviles) {
		this.listaMoviles = listaMoviles;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	
	
	public void menuPrincipal () {
		System.out.println("\nPulse 1 para mostrar todos los móviles de la lista");
		System.out.println("Pulse 2 para mostrar el número de móviles que se han vendido");
		System.out.println("Pulse 3 para mostrar el precio de un móvil");
		System.out.println("Pulse 0 para salir");
	}
	
	public void mostrarMoviles () {
		for (int i = 0; i < listaMoviles.length; i++) {
			System.out.println(listaMoviles [i]);
		}
	}
	
	public void mostrarMovilesVendidos () {
		int contador = 0;
		for (int i = 0; i < listaMoviles.length; i++) {
			if (listaMoviles [i].isVendido()) {
				contador++;
			}
		}
		System.out.println("Ha vendido: " + contador + " móviles");
	}
	
	public double calcularDescuento (int porc) { 
		int cien = 100;
		return porc / cien;
	}
	
	public void mostrarPrecioFinal (int posicion, int porc) {
		double precioFinal = 0.0;
		precioFinal = listaMoviles [posicion - 1].getPrecioU() - (listaMoviles [posicion - 1].getPrecioU() * calcularDescuento (porc));
		System.out.println("El precio del móvil es: " + precioFinal + " €");		
	}
	
	public boolean comprobarVendido (int posicion) {
		if (listaMoviles [posicion - 1].isVendido()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void venderMovil (int posicion, int porc, boolean vendido) {
		
	}
	
	
	
	
	
	
	

}
