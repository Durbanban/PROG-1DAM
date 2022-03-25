package referenciarmetodos;


public class ClaseAux {
	
	public static void referenciarMetodoEstatico () {
		System.out.println("Soy un método estático");
	}
	
	public void referenciarMetodoArbitrario () {
		
	}
	
	public void referenciarMetodoInstanciaParticular () {
		
	}
	
	public void referenciarConstructor () {
		
	}
	
	public void hacerAlgo () {
//		InterfazFuncional comportamiento = () -> ClaseAux.referenciarMetodoEstatico();
//		comportamiento.saludar();
		
		InterfazFuncional comportamiento2 = ClaseAux::referenciarMetodoEstatico;	
		comportamiento2.saludar();
	}

}
