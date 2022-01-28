package ejercicio02;

public class Documento {
	
	private int num;
	private String palabra;
	
	public Documento(int num, String palabra) {
		super();
		this.num = num;
		this.palabra = palabra;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	

	@Override
	public String toString() {
		return "Documento [num=" + num + ", palabra=" + palabra + "]";
	}
	
	public void imprimirDoc () {
		System.out.println("*****************************************");
		for (int i = 0; i < num; i++) {
			System.out.println("*\t\t" + palabra + "\t\t\t*");			
		}
		System.out.println("*****************************************");
	}
	
	
	
	
	
	
	
	
	

}
