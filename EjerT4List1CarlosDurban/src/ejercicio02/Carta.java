package ejercicio02;

public class Carta extends Documento{
	
	private String destinatario;

	public Carta(int num, String palabra, String destinatario) {
		super(num, palabra);
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return super.toString() + "Carta [destinatario=" + destinatario + "]";
	}
	
	
	public void imprimirDoc () {
		System.out.println("*****************************************");
		System.out.println("*\t\t\t\t\t*");
		System.out.println("*\t\t" + destinatario + "\t\t\t*");
		System.out.println("*\t\t\t\t\t*");
		super.imprimirDoc();		
	}

	
	
	
	
	
	
	

}
