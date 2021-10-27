package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 8
		/*Haz un programa que calcule la longitud de una circunferencia de radio 3 metros y el área
		*de un círculo de radio 5.2 metros.
		*/
		double r1 = 3.0, r2 = 5.2, longitud = 0.0, area = 0.0, dos = 2.0, exp = 2.0;
		System.out.println("Bienvenido al programa de las circunferencias locas");
		System.out.println("Aquí se calcularán longitudes y areas");
		longitud = dos * Math.PI * r1;
		System.out.printf("La longitud de la primera circunferencia es %.2f metros\n", longitud);
		//area = Math.PI * (r2 * r2); //Para elevar a una potencia (cuadrado, cubo u otra) Math.pow(base, exponente)
		//Y se declara una variable que haga de exponente
		area = Math.PI * Math.pow(r2 , exp);
		System.out.printf("El área de la segunda circunferencia es %.2f metros\n\n", area);
		System.out.println("Gracias por usar el programa");
		System.out.println("Desconectando");
		 

	}

}
