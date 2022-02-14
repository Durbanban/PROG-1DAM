package ejemploInstrumentos;

public class Piano implements IInstrumento {
	
	
	public void tocar () {
		System.out.println("Piano goes tan ta ta tan tin tin tin");
	}
	
	public String tipo () {
		return "Piano";
	}
	
	public void afinar () {
		
	}
}
