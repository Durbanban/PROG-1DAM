package avanzado;

import java.util.Comparator;

public class ComparaPorPuntosHP implements Comparator <Luchador> {

	@Override
	public int compare(Luchador o1, Luchador o2) {
		int resultado = 0;
		if (o1.getPuntosHP() > o2.getPuntosHP()) {
			resultado = -1;
		}else if (o1.getPuntosHP() < o2.getPuntosHP()){
			resultado = 1;
		}
		return resultado;
	}
	
	
}
