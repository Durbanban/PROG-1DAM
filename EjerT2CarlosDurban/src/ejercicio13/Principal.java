package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 13
		/* Un trabajador necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		 * Si trabaja 40 horas o menos se le paga 16 euros por hora, si trabaja más de 40 horas se le paga
		 * 16 euros por cada una de las primeras 40 horas y 20 euros por cada hora extra. El programa
		 * deberá pedir al usuario el número de horas trabajadas por el obrero en total y mostrar el salario
		 * que le corresponde.
		 */
		
		int eurHora = 16, eurHoraExt = 20, horas = 0, salario = 0, horasExtra = 0, horasTot = 0;
		System.out.println("Bienvenido a tu calculador de horas trabajadas");
		System.out.println("Indique el número de horas trabajadas en la semana. Pulse 0 para salir");
		horas = Leer.datoInt();
		if (horas <= 40) {
			salario = horas * eurHora;
			System.out.printf("Ha ganado %d € esta semana");
		}else if (horas > 40) {
			horasExtra = 0;
		}
		
		
	}

}
