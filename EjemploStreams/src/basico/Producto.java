package basico;

import java.util.Objects;

public class Producto implements Comparable <Producto> {
	
	private String idProducto;
	private String nombre;
	private String categoria;
	private double precio;
	private double peso;
	private boolean vendido;
	
	
	public Producto(String idProducto, String nombre, String categoria, double precio, double peso, boolean vendido) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.peso = peso;
		this.vendido = vendido;
	}


	public String getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public boolean isVendido() {
		return vendido;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", categoria=" + categoria + ", precio="
				+ precio + ", peso=" + peso + ", vendido=" + vendido + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(categoria, idProducto, nombre, peso, precio, vendido);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(idProducto, other.idProducto)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && vendido == other.vendido;
	}


	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.getNombre());
	}
	
	
	
	

}
