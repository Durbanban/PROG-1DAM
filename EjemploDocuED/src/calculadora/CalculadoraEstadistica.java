package calculadora;

import java.util.Arrays;

/**
 * 
 * Calculadora avanzada que inclute la posibilidad de cálculos estadísticos
 * 
 * @author Carlos Jesús Durbán Viloca
 * @version 1.1
 */

public class CalculadoraEstadistica extends CalculadoraBasica {

	public CalculadoraEstadistica() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param args Números que se le pasan al método
	 * @return Devuelve la media de esos números, en el caso de que el array no sea de tamaño 0
	 */
	
	public double mediaAritmetica (double... args) {
		if (args.length != 0) {
			return Arrays.stream(args).average ().getAsDouble();
		}
		return 0.0;
		
	}
	
	/**
	 * Se sustituye la implementación con Ruffini con una implementación recursiva
	 */
	
	@Override
	public int mcd(int a, int b) {
		// TODO Auto-generated method stub
		return super.mcd(a, b);
	}
	
	

}
