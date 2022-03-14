package ejercicio05;

import java.util.Comparator;

public class ComparaPorNombreInverso implements Comparator <Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return -(p1.getNombre().compareTo(p2.getNombre()));
	}

}
