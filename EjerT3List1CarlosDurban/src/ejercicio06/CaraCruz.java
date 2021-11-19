package ejercicio06;

import java.util.Random;

public class CaraCruz {
	
	public CaraCruz () {
		
	}
	
	public int lanzarMoneda () {
		Random num = new Random (System.nanoTime());
		int resultado = 0;
		int max = 2;
		int min = 1;
		resultado = num.nextInt(max - min + 1) + min;
		return resultado;
	}
	
	public boolean comprobarGanador (int eleccion, int resultado) {
		boolean comprobacion = true;
		if (eleccion == resultado) {
			comprobacion = true;
			
		}else if (eleccion != resultado){
			comprobacion = false;
			
		}
		return comprobacion;
		
		
	}
	
	public void mostrarGanador (boolean comprobacion) {
		if (comprobacion == true) {
			System.out.println("No te flipes que tenías un 50 % de probabilidad de ganar");
		}else {
			System.out.println("¡Vaya paquete! Tenías un 50 % de probabilidad de ganar");
		}
	}


}
