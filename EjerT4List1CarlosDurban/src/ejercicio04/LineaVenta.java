package ejercicio04;

public class LineaVenta {
	
	private Producto producto;
	private int cantidad;
	
	public LineaVenta (Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaVenta [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	
	

}
