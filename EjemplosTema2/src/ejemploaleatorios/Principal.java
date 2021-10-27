package ejemploaleatorios;
import java.util.Random;

import ejemploleer.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random (System.nanoTime());
		int aleatorio = 0, min = 0, max = 100;
		System.out.println("Vamos a generar aleatorios enteros");
		System.out.println("Diga el mayor");
		max = Leer.datoInt();
		System.out.println("Diga el menor");
		min = Leer.datoInt();
		aleatorio = num.nextInt(max - min + 1) + min;//Esto es como una fórmula, el 1 se puede escribir.
		System.out.println("Ha salido el: " + aleatorio);
		
		
		

	}

}