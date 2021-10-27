package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 1 Listado 2
		/* Crear un array de tipo String, inicializarlo en la propia definición con el nombre de 5 personas y mostrarlo
		 * por la pantalla mediante un bucle for.
		 */
		System.out.println("Vamos a calcular un array con nombres");
		String [] nombres = {"Carlos", "María", "David", "Pablo", "Paula"};
		for (int i = 0; i < nombres.length; i++) { //No usar el .length en la salida de los for para lso arrays, quita nota en el examen.
			System.out.println("Su nombre es " + nombres[i]);
		}
		System.out.println("Gracias por usar el programa");
	}

}
