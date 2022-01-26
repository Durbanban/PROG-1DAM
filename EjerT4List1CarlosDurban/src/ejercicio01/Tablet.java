package ejercicio01;

public class Tablet extends Ordenador {
	
	private double precioSegPantalla;
	
	
	public Tablet (double capDiscoDuro, double frecProcesador, double precioBase, double precioSegPantalla) {
		super (capDiscoDuro, frecProcesador, precioBase);
		this.precioSegPantalla = precioSegPantalla;
	}


	public double getPrecioSegPantalla() {
		return precioSegPantalla;
	}


	public void setPrecioSegPantalla(double precioSegPantalla) {
		this.precioSegPantalla = precioSegPantalla;
	}


	
	
	
	@Override
	public String toString() {
		return super.toString() + " Tablet [precioSegPantalla=" + precioSegPantalla + "]";
	}


	public double calcularPrecioVenta () {
		return super.calcularPrecioVenta() + precioSegPantalla;
	}
	
	
	

}
