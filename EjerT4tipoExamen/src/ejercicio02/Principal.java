package ejercicio02;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0, max = 200, min = 199;
		double a = 0.0;
		
		Random r = new Random (System.nanoTime());
		
		b = r.nextInt(max - min + 1) + min;
		System.out.println(b);
		a = min + (max - min) * r.nextDouble();
		System.out.printf("%.2f", a);

	}

}
