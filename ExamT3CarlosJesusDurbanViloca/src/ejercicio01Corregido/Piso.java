package ejercicio01Corregido;

public class Piso {
	
	private String direccion;
	private int metrosCuadrados;
	private boolean reforma;
	private int precioVenta;
	
	
	public Piso(String direccion, int metrosCuadrados, boolean reforma, int precioVenta) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.reforma = reforma;
		this.precioVenta = precioVenta;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}


	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}


	public boolean isReforma() {
		return reforma;
	}


	public void setReforma(boolean reforma) {
		this.reforma = reforma;
	}


	public int getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metrosCuadrados=" + metrosCuadrados + ", reforma=" + reforma
				+ ", precioVenta=" + precioVenta + "]";
	}
	
	
	
	
	
	
	
}
