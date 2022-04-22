package ejercicio04;

import java.util.List;
import java.util.Objects;

public class CrudEcuacion2G {
	
	private List <Ecuacion2G> listado;

	public CrudEcuacion2G(List<Ecuacion2G> listado) {
		this.listado = listado;
	}

	public List<Ecuacion2G> getListado() {
		return listado;
	}

	public void setListado(List<Ecuacion2G> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudEcuacion2G [listado=" + listado + "]";
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
		CrudEcuacion2G other = (CrudEcuacion2G) obj;
		return Objects.equals(listado, other.listado);
	}
	
	public void agregarEcuacion(Ecuacion2G e) {
		listado.add(e);
	}
	
	public int resolverEcuacion(Ecuacion2G e) throws ArithmeticException, EcuacionDegeneradaExc {
		int resultado = 0;
		double dos = 2;
		double discriminante = Math.pow(e.getB(), dos);
		
		
	}
	
	
}
