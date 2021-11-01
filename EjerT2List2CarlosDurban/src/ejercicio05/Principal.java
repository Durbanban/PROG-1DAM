package ejercicio05;
import java.util.Random;
import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 5
		/* Crear un programa que realice lo siguiente:
		 * • Solicitar al usuario que introduzca por teclado el tamaño del array.
		 * • Declarar y definir el array de enteros.
		 * • Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
		 * • Mostrar por pantalla la suma de todos los elementos.
		 * • Mostrar el mayor y el menor guardados en el array.
		 */
		
		int tam = 0, min = 0, max = 0, suma = 0, mayor = 0, menor = 0;
		int [] arrayEnteros;
		Random num = new Random (System.nanoTime());
		
		System.out.println("Bienvenido al creador de arrays aleatorio");
		System.out.println("Indique el tamaño deseado para el array");
		System.out.println("Pulse 0 para salir");
		tam = Leer.datoInt();
		arrayEnteros = new int [tam];
		System.out.println("Indique el número máximo para rellenar el array");
		max = Leer.datoInt();
		while (max <= 0) {
			System.out.println("Tiene que ser un número mayor que 0");
			max = Leer.datoInt();
		}
		System.out.println("Y ahora el número mínimo");
		min = Leer.datoInt();
		while (min > max) {
			System.out.println("Tiene que ser menor o igual al número máximo");
			min = Leer.datoInt();
		}
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros [i] = num.nextInt(max - min + 1) + min;
			suma = suma + arrayEnteros[i];
		}
		System.out.println("La suma de todos los números es " + suma);
		//Muestra el array para comprobar que los datos son correctos.
		for (int i = 0; i < arrayEnteros.length; i++ ) {
			System.out.println(arrayEnteros[i]);
		}
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = mayor;
			if (arrayEnteros[i] > mayor) {
				arrayEnteros[i] = mayor;
			}
		}
		System.out.println("El número mayor es " + mayor);
		
		
		
		

	}

}
