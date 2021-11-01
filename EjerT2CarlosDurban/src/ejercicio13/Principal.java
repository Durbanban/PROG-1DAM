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
		
		double eurHora = 16.0, eurHoraExt = 20.0, horas = 0.0, salario = 0.0, horasExtra = 0.0, horasTope = 40.0, cero = 0.0;
		System.out.println("Bienvenido a tu calculador de horas trabajadas");
		do {
			System.out.println("Indique el número de horas trabajadas en la semana. Pulse 0 para salir");
			horas = Leer.datoDouble();
			if (horas <= horasTope && horas > cero) {
				salario = horas * eurHora;
				System.out.printf("Ha ganado %.2f € esta semana\n", salario);
			}else if (horas > horasTope) {
				horasExtra = horas - horasTope;
				salario = (horasTope * eurHora) + (horasExtra * eurHoraExt);
				System.out.printf("Ha ganado %.2f € esta semana\n", salario);
			}else;
		}while (horas > cero);
		System.out.println("Gracias por usar el programa");
		
		
	}

}
