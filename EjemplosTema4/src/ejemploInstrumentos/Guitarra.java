package ejemploInstrumentos;

public class Guitarra implements IInstrumento {
	
	
	
	public void tocar () {
		System.out.println("Guitarra goes pilililililin");
	}
	
	public void afinar () {
		
	}
	
	public String tipo () {
		return "Guitarra";
	}
}
