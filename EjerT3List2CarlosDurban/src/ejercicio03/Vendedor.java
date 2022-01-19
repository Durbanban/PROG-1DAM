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
		System.out.println("Pulse 1 para mostrar todos los móviles de la lista");
		System.out.println("Pulse 2 para mostrar los móviles que se han vendido");
		System.out.println("Pulse 3 para mostrar el precio de un móvil");
		System.out.println("Pulse 0 para salir");
	}
	
	
	
	
	
	
	

}
