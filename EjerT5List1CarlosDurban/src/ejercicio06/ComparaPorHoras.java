package ejercicio06;

import java.util.Comparator;

public class ComparaPorHoras implements Comparator <Trabajador> {

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		int res = 0;
		if (t1.getHorasTrabajadas() > t2.getHorasTrabajadas()) {
			res = -1;
		}else {
			if (t1.getHorasTrabajadas() < t2.getHorasTrabajadas()) {
				res = 1;
			}
		}
		return res;
	}

}
