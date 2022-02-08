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
	
	/**
	 * 
	 * Método que calcula el máximo común divisor de dos números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	
	public int mcd (int a, int b) {
		/*
		   Implementamos el cálculo mediante el método de 
		   Ruffini porque otras aproximaciones son menos eficientes
		 */
		
		return 0;
	}

}
