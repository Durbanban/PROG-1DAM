package ejemploStatic;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cohete c1 = new Cohete ();
		Cohete c2 = new Cohete ();
		Cohete c3 = new Cohete ();
		
		imprimirMenu ();
		System.out.println(c1.getNumCohetes());	// Al ser estático el atributo numCohetes, se comparte con todos los objetos de esa clase
		System.out.println(c3.getNumCohetes());
		
		
		
}

	

// Ejemplo de helper
	public static void imprimirMenu () {
	
	System.out.println("Hola:");
	System.out.println("Diga qué cohete quiere");
	
	}



}
