package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 5
		/*5. Crear un programa donde se declare una variable que será una cantidad de euros,
		 * y mostrar por pantalla su cambio a dólares americanos. Se debe tener otra variable
		 * cuyo valor será el valor de 1 dolar en euros y otra para guardar el resultado
		 * (podeís inventar el valor del cambio o buscarlo en internet) 
		 */
		double euros = 150, conversionEurUsd = 1.17, dolares =0;
		System.out.println("Bienvenido al programa de conversión de divisas\n\n");
		System.out.printf("La cantidad a convertir es de %.2f euros.\n", euros);
		dolares = euros * conversionEurUsd; 
		System.out.printf("Esta cantidad equivale a %.2f dólares americanos.", dolares);
		System.out.println("\n\n\nGracias por usar el programa\nDesconectando...");
		

	}

}
