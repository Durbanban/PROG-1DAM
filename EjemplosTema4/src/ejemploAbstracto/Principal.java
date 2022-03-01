package ejemploAbstracto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Figura f1 = new Figura (5, 5); NO SE PUEDE INSTANCIAR PORQUE ES UNA CLASE ABSTRACTA
		
		Cuadrado cuadrado = new Cuadrado (1, 2, 2);
		
		Rectangulo rectangulo = new Rectangulo (2,4,3,6);
		
		Figura cuadrado2 = new Cuadrado (2, 2, 4);
		
		Figura rectangulo2 = new Rectangulo (4, 8, 6 ,12);
		
		
		if (cuadrado2 instanceof Cuadrado) { //HAY QUE CASTEAR SIEMPRE QUE VAYAMOS A UTILIZAR MÉTODOS DE LA CLASE HIJA
			((Cuadrado) cuadrado2).getLado();
		}
		
		
		
		
		System.out.println(cuadrado.calcularArea());

	}

}
