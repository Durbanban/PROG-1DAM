package ejercicio01;

public class Ordenador {
	
	private double capDiscoDuro;
	private double frecProcesador;
	private double precioBase;
	
	public Ordenador (double capDiscoDuro, double frecProcesador, double precioBase) {
		this.capDiscoDuro = capDiscoDuro;
		this.frecProcesador = frecProcesador;
		this.precioBase = precioBase;
	}

	public double getCapDiscoDuro() {
		return capDiscoDuro;
	}

	public void setCapDiscoDuro(double capDiscoDuro) {
		this.capDiscoDuro = capDiscoDuro;
	}

	public double getFrecProcesador() {
		return frecProcesador;
	}

	public void setFrecProcesador(double frecProcesador) {
		this.frecProcesador = frecProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Ordenador [capDiscoDuro=" + capDiscoDuro + ", frecProcesador=" + frecProcesador + ", precioBase="
				+ precioBase + "]";
	}
	
	
	public double calcularPrecioVenta () {
		double ganancia = 0.15;
		return precioBase + precioBase * ganancia;
	}
	
	
	
	

}
