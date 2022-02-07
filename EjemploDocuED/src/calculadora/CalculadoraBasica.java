package calculadora;

/**
 * 
 * @author Carlos Jesús Durbán Viloca
 * @version 1.0
 *
 */

public class CalculadoraBasica {
	
	public double sumar (double a, double b) {
		return a + b;
	}
	
	public double restar (double a, double b) {
		return a- b;
	}
	
	public double multiplicar (double a, double b) {
		return a * b;
	}
	
	/**
	 * Método que sirve para calcular la división con decimales
	 * 
	 * @param dividendo 
	 * @param divisor 
	 * @return
	 * @throws ArithmeticException En caso de tratar de dividir entre 0
	 */
	
	public double dividir (double dividendo, double divisor) throws ArithmeticException {
		return dividendo / divisor;
	}
	
	/**
	 * 
	 * @param resultado
	 */
	
	public void mostrarResultado (double resultado) {
		System.out.println(resultado);
	}

}
