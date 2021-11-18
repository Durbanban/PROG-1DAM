package ejercicio04;

public class Copiado {
	
	// Atributos
	
	private int num;
	private String frase;
	
	// Constructor
	public Copiado (int num, String frase) {
		this.num = num;
		this.frase = frase;
		
	}
	
	// Constructor vacío
	
	public Copiado () {
		
	}
	
	// getters y setters 
	
	public int getNum () {
		return num;
	}
	
	public void setNum (int num) {
		this.num = num;
	}
	
	public String getFrase () {
		return frase;
	}
	
	public void setFrase (String frase) {
		this.frase = frase;
	}
	// Métodos
	
	public String repetirFrase (int num, String frase) {
		String resultado = "";
		for (int i = 0; i < num; i++) {
			resultado = resultado + "\n" + frase;
		}
		return resultado;
		
	}
	
	
}
