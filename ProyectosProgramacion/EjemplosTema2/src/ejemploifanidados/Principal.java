package ejemploifanidados;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio = 50.0, dinero = 100.0, topeAlto = 100.0;
		
		if (dinero > precio) {
			if (precio < topeAlto) {
				System.out.println("El precio es menor del tope");
			}
			System.out.println("Puedo comprar");
		}

	}	// && = AND  || = OR Conectores para varias condiciones en un mismo if. if (dinero > precio && precio < topeAlto){}

}
