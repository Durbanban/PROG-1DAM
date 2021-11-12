package ejercicio02;

public class Operaciones {
	
	//Constructor
	
	public Operaciones () {
		
	}
	
	public String positivoNegativo (int num) {
		String resultado = "";
		if (num >= 0) {
			resultado = "positivo"; 
		}else if (num < 0) {
			resultado = "negativo";	
		}
		return resultado;
	}
	
	public String parImpar (int num) {
		String resultado = "";
		if (num % 2 == 0) {
			resultado = "par";
		}else {
			resultado = "impar";
		}
		return resultado;
	}

}
