package ejercicio01;

public class Portatil extends Ordenador {
	
	private double descuento;
	
	public Portatil (double capDiscoDuro, double frecProcesador, double precioBase, double descuento) {
		super (capDiscoDuro, frecProcesador, precioBase);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return super.toString() + " Portatil [descuento=" + descuento + "]";
	}
	
	
	public double calcularPrecioVenta () {
		return super.calcularPrecioVenta() - super.calcularPrecioVenta() * descuento;
	}
	
	
	
	

}
