package ejercicio02;

public class Movil extends Producto {
	
	private String marca;

	public Movil(double precioBase, int unidades, String nombre, String marca) {
		super(precioBase, unidades, nombre);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return super.toString() + "Movil [marca=" + marca + "]";
	}
	
	public double calcularPVP (double porcentaje, double fijo) {
		double divisor = 100.0;
		return super.getPrecioBase() + super.getPrecioBase() * (porcentaje / divisor);
	}
	
	

}
