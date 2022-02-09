package ejercicio04;

public abstract class Producto {
	
	private double precioUnitario;
	private String nombre;
	private String id;
	
	
	public Producto (double precioUnitario, String nombre, String id) {
		this.precioUnitario = precioUnitario;
		this.nombre = nombre;
		this.id = id;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", nombre=" + nombre + ", id=" + id + "]";
	}
	
	public abstract double calcularPrecioFinal (double impuesto, double descuento);

}
