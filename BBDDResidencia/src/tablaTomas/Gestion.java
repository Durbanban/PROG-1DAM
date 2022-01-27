package tablaTomas;

import java.util.Arrays;
import java.util.Random;

public class Gestion {
	
	public int generarAleatorio (int max, int min) {
		int res = 0;
		Random num = new Random ();
		res = num.nextInt(max - min + 1) + min;
		return res;
	}
	
	public static boolean contains(final int[] arr, final int key) {
	    return Arrays.stream(arr).anyMatch(i -> i == key);
	}
	
	public int noReutilizar (int [] array, int num) {
		int max = 300, min = 1, res = 0;
		if (Gestion.contains(array, num)) {
			num = generarAleatorio(max, min);
			res = noReutilizar (array, num);
		}else {
			return num;
		}
		return res;
		
	}
	
}
