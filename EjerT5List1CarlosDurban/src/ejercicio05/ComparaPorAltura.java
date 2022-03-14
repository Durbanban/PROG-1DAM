package ejercicio05;

import java.util.Comparator;

public class ComparaPorAltura implements Comparator <Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		int res = 0;
		if (p1.getAltura() > p2.getAltura()) {
			res = 1;
		}else {
			if (p1.getAltura() < p2.getAltura()) {
				res = -1;
			}	
		}
		return res;
	}
	
	

}
