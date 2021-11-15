package ejercicio05;
import java.util.Random;
public class Sorteo {
	// Constructor vacío
	public Sorteo () {
		
	}
	
	public int calcularNum () {
		int valor = 0;
		int max = 9;
		int min = 0;
		Random num = new Random (System.nanoTime());
		valor = num.nextInt(max - min + 1) + min;
		return valor;
	}
	public char calcularQuiniela () {
		char valor;
		int prob = 0, max = 3, min = 1;
		Random num = new Random (System.nanoTime());
		prob = num.nextInt(max - min + 1) + min;
		if (prob > 2) {
			valor = '1';
			return valor;
		}else if (prob == 2) {
			valor = 'X';
			return valor;
		}else {
			valor = '2';
			return valor;
		}

	}
	public String calcularParidad (int num) {
		
		String resultado = "";
		if (num % 2 == 0) {
			resultado = "par";
		}else {
			resultado = "impar";
		}
		return resultado;
	}
	public int numPrimitiva () {
		int max = 99999;
		int min = 00001;
		int valor = 0;
		Random num = new Random (System.nanoTime());
		valor = num.nextInt(max - min + 1) + min;
		return valor;
	}
}