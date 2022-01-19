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
	
	
	
	
	
	
	

}
