package ejercicio06;

import java.util.Comparator;

public class ComparaPorSueldo implements Comparator <Trabajador> {

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		// TODO Auto-generated method stub
		int res = 0;
		if (t1.calcularSueldo() > t2.calcularSueldo()) {
			res = 1;
		}else {
			if (t1.calcularSueldo() < t2.calcularSueldo()) {
				res = -1;
			}
		}
		return res;
	}
	

}
