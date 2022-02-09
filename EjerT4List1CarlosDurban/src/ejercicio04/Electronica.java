package ejercicio04;

public class Electronica extends Producto {
	
	private boolean inalambrico;
	
	
	public Electronica (double precioUnitario, String nombre, String id, boolean inalambrico) {
		super (precioUnitario, nombre, id);
		this.inalambrico = inalambrico;
	}


	public boolean isInalambrico() {
		return inalambrico;
	}


	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}


	@Override
	public String toString() {
		return super.toString() + "Electronica [inalambrico=" + inalambrico + "]";
	}
	
	
	public double calcularPrecioFinal (double impuesto, double descuento) {
		return getPrecioUnitario() + impuesto;
	}
	
	
	
}
