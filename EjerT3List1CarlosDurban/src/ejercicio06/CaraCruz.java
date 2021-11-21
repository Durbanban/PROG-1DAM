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
			System.out.println("E\tN\tH\tO\tR\tA\tB\tU\tE\tN\tA");
			System.out.println("No se emocione que tenía un 50 % de probabilidad de ganar");
		}else {
			System.out.println("L\tO\t\tS\tE\tN\tT\tI\tM\tO\tS");
			System.out.println("Es usted malísimo. Tenía un 50 % de probabilidad de ganar");
		}
	}


}
