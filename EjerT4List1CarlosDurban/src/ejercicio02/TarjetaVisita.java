package ejercicio02;

public class TarjetaVisita extends Documento {
	
	private String telefono;
	

	public TarjetaVisita(int num, String palabra, String telefono) {
		super(num, palabra);
		this.telefono = telefono;
	}


	
	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	
	@Override
	public String toString() {
		return super.toString() + "TarjetaVisita [telefono=" + telefono + "]";
	}
	
	
	public void imprimirDoc () {
		super.imprimirDoc();
		System.out.println("*\t\t\t\t\t*");
		System.out.println("*\t\t" + telefono + "\t\t*");
		System.out.println("*\t\t\t\t\t*");
		System.out.println("*****************************************");
		
	}
	
	
	
	
	

}
