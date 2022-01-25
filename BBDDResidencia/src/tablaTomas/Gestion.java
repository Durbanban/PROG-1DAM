package tablaTomas;

import java.util.Random;

public class Gestion {
	
	public int generarAleatorio (int max, int min) {
		Random num = new Random ();
		return num.nextInt(max - min + 1);
	}
	
}
