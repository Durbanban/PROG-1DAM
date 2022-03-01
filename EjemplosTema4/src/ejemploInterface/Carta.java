package ejemploInterface;

public class Carta implements Imprimible {
	
	private String cabecera;
	private String cuerpo;
	
	public Carta (String cabecera, String cuerpo) {
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
	}
	
	
	
	public String getCabecera() {
		return cabecera;
	}



	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}



	public String getCuerpo() {
		return cuerpo;
	}



	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	

	@Override
	public String toString() {
		return "Carta [cabecera=" + cabecera + ", cuerpo=" + cuerpo + "]";
	}



	public void imprimirAst () {
		System.out.println("***" + cabecera + "***");
		System.out.println(cuerpo);
	}

}
