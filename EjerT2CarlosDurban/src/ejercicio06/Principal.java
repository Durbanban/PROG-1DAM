package ejercicio06;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 6
		/* Realizar un programa dirigido por menús que solicite el peso de una persona, 
		 * y escriba por pantalla su peso en cualquier planeta del Sistema Solar.
		 * Las equivalencias son las siguientes (basta con multiplicar el peso de la persona
		 * en la tierra por la constante de equivalencia).
		 */
		double eqMercurio = 0.38, eqVenus = 0.91, eqTierra = 1.0, eqMarte = 0.38, eqJupiter = 2.53, eqSaturno = 1.06,
				eqUrano = 0.92, eqNeptuno = 1.2, pesoI = 0.0, pesoF = 0.0;
		int convPlanetas = 0;
		System.out.println("Bienvenido a ¿Cuánto pesarías en cada planeta?");
		System.out.println("Este programa va a calcular tu peso en los diferentes planetas del sistema solar");
		System.out.println("Indique su peso: ");
		pesoI = Leer.datoDouble();
		if (pesoI <=0) {
			System.out.println("Lo siento pero no puedes tenee un peso negativo");
		}else {
		System.out.println("Pulse 1 para averiguar cuánto pesaría en Mercurio");
		System.out.println("Pulse 2 para averiguar cuánto pesaría en Venus");
		System.out.println("Pulse 3 para averiguar cuánto pesaría en la Tierra (spoiler: es el mismo");
		System.out.println("Pulse 4 para averiguar cuánto pesaría en Marte");
		System.out.println("Pulse 5 para averiguar cuánto pesaría en Júpiter");
		System.out.println("Pulse 6 para averiguar cuánto pesaría en Saturno");
		System.out.println("Pulse 7 para averiguar cuánto pesaría en Urano");
		System.out.println("Pulse 8 para averiguar cuánto pesaría en Neptuno");
		convPlanetas = Leer.datoInt();
			switch (convPlanetas) {
				case 1:
					pesoF = pesoI * eqMercurio;
					System.out.printf("Su peso en Mercurío sería %.2f kg", pesoF);
					break;
				case 2:
					pesoF = pesoI * eqVenus;
					System.out.printf("Su peso en Venus sería %.2f kg", pesoF);
					break;
				case 3:
					pesoF = pesoI * eqTierra;
					System.out.printf("Su peso en la Tierra es el mismo): %.2f", pesoF);
					break;
				case 4:
					pesoF = pesoI * eqMarte;
					System.out.printf("Su peso en Marte sería %.2f kg", pesoF);
					break;
				case 5:
					pesoF = pesoI * eqJupiter;
					System.out.printf("Su peso en Júpiter sería %.2f kg", pesoF);
					break;
				case 6:
					pesoF = pesoI * eqSaturno;
					System.out.printf("Su peso en Saturno sería %.2f kg", pesoF);
					break;
				case 7:
					pesoF = pesoI * eqUrano;
					System.out.printf("Su peso en Urano sería %.2f kg", pesoF);
					break;
				case 8:
					pesoF = pesoI * eqNeptuno;
					System.out.printf("Su peso en Neptuno sería %.2f kg", pesoF);
					break;
				default:
					System.out.println("Por favor, elija una opción entre 1 y 8");
					
					
					
				
			}
		
			
		
		}
	}

}
