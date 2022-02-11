package ejemploInterface;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carta c = new Carta ("Salesianos Triana", "Estimados Alumnos: \n Bienvenidos al centro");
		Web w = new Web ("Salesianos");

		c.imprimirAst();	
		w.imprimirAst();

	}

}
