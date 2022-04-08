package ejemplo;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator <Persona>{

	@Override
	public int compare(Persona a, Persona b) {
		// TODO Auto-generated method stub
		return a.getFechaCumple().compareTo(b.getFechaCumple());
	}

	
}
