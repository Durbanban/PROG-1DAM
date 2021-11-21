package ejercicio08;
import java.util.Random;
public class Sorteo {
	
	private int decimo;
	
	public Sorteo (int decimo) {
		this.decimo = decimo;
	}
	
	public Sorteo () {
		
	}
	
	public int getDecimo () {
		return decimo;
	}
	
	public void setDecimo (int decimo) {
		this.decimo = decimo;
	}
	
	public int numPrimitiva () {
		int max = 99999, min = 1, valor = 0;
		Random num = new Random (System.nanoTime());
		valor = num.nextInt(max - min + 1) + min;
		return valor;
		
	}
	
	public void comprobarGanador (int decimo, int premiado) {
		if (this.decimo == premiado) {
			System.out.println("¡¡ENHORABUENA!!\t¡Es usted ganador de la lotería!\n¡A por el champán y a salir en la tele!");
		}else {
			System.out.println("No ha sido premiado\nVa a tener que seguir trabajando");
		}
	}

}
