package ejercicio01;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator <Mensaje>{

	@Override
	public int compare(Mensaje o1, Mensaje o2) {
		return (o1.getEmisor().compareTo(o2.getEmisor()));
	}
	
	

}
