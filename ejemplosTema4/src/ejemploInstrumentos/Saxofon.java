package ejemploInstrumentos;

public class Saxofon implements IInstrumento {
	
	
	public void tocar () {
		System.out.println("Saxofon goes brrrrrrr");
	}
	
	public String tipo () {
		return "Saxofon";
	}
	
	public void afinar () {
		
	}

}
