package basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CrudProducto {
	
	private List <Producto> listado;

	public CrudProducto(List<Producto> listado) {
		this.listado = listado;
	}

	public List<Producto> getListado() {
		return listado;
	}

	public void setListado(List<Producto> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudProducto [listado=" + listado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(listado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrudProducto other = (CrudProducto) obj;
		return Objects.equals(listado, other.listado);
	}
	
	public void agregarProducto (Producto p) {
		listado.add(p);
	}
	
	public Producto buscarUnProducto (String nombre) {
		return listado.stream()
				.filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre))
				.findAny()
				.orElse(null);
	}
	
	
	public List <Producto> aplicarDescuentoProductosMayoresQuePrecio (double precio, double descuento) {
		List <Producto> listaObjetivo = listado;
		double div = 100;
		return listaObjetivo.stream()
				.filter(producto -> producto.getPrecio() > precio)
				.map(producto -> producto.getPrecio())
				.map(precio -> precio * (descuento / div))
				.collect(Collectors.toList());
	}
	
	

}
