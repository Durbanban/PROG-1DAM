package ejercicio06;

import java.util.Random;

public class CaraCruz {
	
	public CaraCruz () {
		
	}
	
	public String lanzarMoneda (int moneda) {
		String resultado = "";
		Random num = new Random (System.nanoTime());		
		int max = 10;
		int min = 1;
		moneda = num.nextInt(max - min + 1) + min;
		if (moneda > 5) {
			resultado = "Cara";
			
		}else if (moneda <= 5) {
			resultado = "Cruz";
			
		}
		return resultado;
	}

}
