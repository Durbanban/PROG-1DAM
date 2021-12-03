package ejercicio05;
import java.util.Random;
public class Sorteo {
	// Constructor vacío
	public Sorteo () {
		
	}
	
	public int calcularAleatorio (int max, int min) {
		int valor = 0;
		Random num = new Random (System.nanoTime());
		valor = num.nextInt(max - min + 1) + min;
		return valor;
	}
	
	public char calcularGanador (int prob) {
		char valor;
		if (prob == 1) {
			valor = '1';
			return valor;
		}else if (prob == 3) {
			valor = 'X';
			return valor;
		}else {
			valor = '2';
			return valor;
		}

	}
	
	public void mostrarGanadorQuin (char a) {
		int i = 1;
		if (a == '1') {
			System.out.printf("resultado %d:\t%c\n", i, a);
			i++;
		}else if (a == 'X') {
			System.out.printf("resultado %d:\t\t%c\n", i, a);
			i++;
		}else {
			System.out.printf("resultado %d:\t\t\t%c\n", i, a);
			i++;
		}
		i++;
		
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
	
	public boolean comprobarGanadorPrim (int numJ, int numG) {
		boolean resultado = true;
		if (numJ == numG) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public void mostrarGanador (boolean decimo) {
		if (decimo) {
			System.out.println("Enhorabuena has ganado!!");
		}else {
			System.out.println("Suerte la próxima vez");
		}
	}
}