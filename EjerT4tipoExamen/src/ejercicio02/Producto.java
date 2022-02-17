package ejercicio02;

public abstract class Producto {
	
	private double precioBase;
	private int unidades;
	private String nombre;
	
	
	public Producto(double precioBase, int unidades, String nombre) {
		super();
		this.precioBase = precioBase;
		this.unidades = unidades;
		this.nombre = nombre;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", unidades=" + unidades + ", nombre=" + nombre + "]";
	}
	
	
	public abstract double calcularPVP (double porcentaje, double fijo);
	
	

}
