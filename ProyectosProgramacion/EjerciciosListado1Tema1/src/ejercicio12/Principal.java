package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 12
		/*Calcula la intensidad (I) que circulará por un circuito electrónico con una resistencia
		 * eléctrica (R) de 20 kilo ohmios al que se le aplica una tensión (V) de 250 voltios.
		 * La fórmula es I=V/R. Da el resultado con dos decimales. (K=10sup3, busca la forma
		 * de escribir K sin necesidad de escribir 1000).
		 */
		double intensidad = 0.0, resistencia = 20e3, tension = 250.0;
		System.out.println("Bienvenido al programa de cálculo de intensidades");
		intensidad = tension / resistencia;
		System.out.printf("La intensidad es de %.2e amperios", intensidad);
		//Para expresar potencias se escribe una e detrás del porcentaje en el printf.
		//También vale para declarar variables: 20000 = 20e3

	}

}
