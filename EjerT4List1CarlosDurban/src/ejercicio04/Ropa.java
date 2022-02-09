package ejercicio04;

public class Ropa extends Producto {
	
	private int talla;
	
	public Ropa (double precioUnitario, String nombre, String id, int talla) {
		super (precioUnitario, nombre, id);
		this.talla = talla;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return super.toString() + "Ropa [talla=" + talla + "]";
	}
	
	public double calcularPrecioFinal (double impuesto, double descuento) {
		return getPrecioUnitario();
	}
	
	
	

}
