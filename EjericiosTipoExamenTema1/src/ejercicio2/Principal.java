package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 2
		/*Realizar un programa que calcule el espacio recorrido por un objeto que 
		 * se mueve a velocidad  constante. El objeto, por ejemplo, zapatilla de 
		 * una madre hacia el hijo, ha recorrido un espacio inicial  de 5.5 m y
		 * se mueve a una velocidad constante de 3.2 m/s. Vosotros debéis dar un
		 * valor al tiempo  que el objeto está en movimiento.  
		 * La ecuación usada es:  espacio= espacioInicial + velocidad*tiempo
		 */
		double espIni = 5.5, velocidad = 3.2, espacio = 0.0, tiempo = 1.5;
		System.out.println("Bienvenido a las zapatillas voladoras");
		System.out.println("En este programa se va a calcular el espacio que"
				+ " recorre una zapatilla:\n");
		
		System.out.printf("La zapatilla permanece en el aire %.2f segundos"
				+ " y avanza a %.2f metros por segundo\n", tiempo, velocidad);
		
		espacio = (espIni + velocidad) * tiempo;
		
		System.out.printf("Esto nos permite saber que ha recorrido % .2f metros\n\n", espacio);
		System.out.println("Gracias por usar el programa\nDesconectando...");		
		
		


	}

}
