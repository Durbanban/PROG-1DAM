package avanzado;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class CrudLuchador {
	
	private List <Luchador> listado;

	public CrudLuchador(List<Luchador> listado) {
		super();
		this.listado = listado;
	}

	public List<Luchador> getListado() {
		return listado;
	}

	public void setListado(List<Luchador> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudLuchador [listado=" + listado + "]";
	}
	/*
	 * Este método va a aprovechar la función Supplier, la cual recibe, para generar un nuevo luchador, con el nombre que el usuario determine.
	 * Además lo va a guardar en la lista de luchadores. El método get() es el único método de la interfaz Supplier.
	 */
	public void crearLuchador (Supplier <Luchador> generador, Luchador luchador, String nombre) { 
		luchador = generador.get();
		luchador.setNombre(nombre);
		listado.add(luchador);
	}
	/*
	 * Este método combatir, aprovecha la interfaz creada de ICombate recibiéndola, la cual hemos visto en principal su función. También recibe
	 * una Function con los tipos String (recibe) y Luchador (devuelve) que es usada para buscar a ese luchador en la lista. luchar() es el único 
	 * método de la interfaz ICombate, y apply() es el único método de la interfaz Function.
	 */
	public Luchador combatir (ICombate combate, Function <String, Luchador> buscar, String luchador1, String luchador2) {
		return combate.luchar(buscar.apply(luchador1), buscar.apply(luchador2));
	}
	

}
