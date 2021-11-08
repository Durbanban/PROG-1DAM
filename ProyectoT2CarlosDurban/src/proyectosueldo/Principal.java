package proyectosueldo;

import lectura.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diasMes = 0, opcion = 0, opcionDos = 0, opcionTres=0, max = 16, min = 0, puesto = 0, vacaciones=0,
				cantPuntos = 0, nvIncentivo1 = 100, nvIncentivo2 = 150, menu = 0, opcionIncentivo = 0, maxPuntos = 200,
				minPuntos = 0;

		double desarrollador = 10.0, desarrolladorExtra = 15.50, coordinador = 13.50, coordinadorExtra = 16.00,
				secretario = 9.75, secretarioExtra = 11.00, jornada = 0, jornadaMes = 0, sumaHoras = 0, horasExtra = 0,
				salario = 0, incentivo1=100, incentivo2 =200 , incentivo3 = 300; 

		int[] arrayDias;
		Random num = new Random(System.nanoTime());
		System.out.println("Cargando calculador de sueldos...");
		System.out.println("Bienvenido Microapel (marca registrada)\n");
		System.out.println("¿Cuántos días laborables ha tenido el mes?");
		diasMes = Leer.datoInt();
		while (diasMes <= 0) {
			System.out.println("Por favor, introduzca un número positivo");
			diasMes = Leer.datoInt();
		}

		arrayDias = new int[diasMes];
		do {
			System.out.println("\nPulse 1 para generar el trabajo de un empleado");
			System.out.println("Pulse 2 para consultar el trabajo de un empleado");
			System.out.println("Pulse 3 para consultar el salario de un trabajador");
			System.out.println("Pulse 4 para mostrar el sueldo de un puesto de trabajo");
			System.out.println("Pulse 5 para saber los dias de vacaciones del trabajador");
			System.out.println("Pulse 6 para gestionar los incentivos");
			System.out.println("Pulse 7 para reajustar el sueldo de los trabajadores");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					for (int i = 0; i < diasMes; i++) {
						arrayDias[i] = num.nextInt(max - min + 1) + min;
					}
					break;
				case 2:
					System.out.println("Día\t\t\t\tHoras");
					for (int i = 0; i < arrayDias.length; i++) {
						System.out.print(i+1 + "\t\t\t\t");
						System.out.print(arrayDias[i] + "\n");
					}
					break;
				case 3:
					jornadaMes = 0;
					sumaHoras = 0;
					horasExtra = 0;
					salario = 0;
					System.out.println("Introduzca las jornada del trabajador.");
					System.out.println("Todas las horas que las sobrepasan se considerarán horas extras.");
					jornada = Leer.datoInt();
					while (jornada <= 0) {
						System.out.println("Por favor introduzca una jornada válida.");
						jornada = Leer.datoInt();
					}
					jornadaMes = jornada * diasMes;
					for (int i = 0; i < arrayDias.length; i++) {
						sumaHoras = sumaHoras + arrayDias[i];
					}
					horasExtra = sumaHoras - jornadaMes;
					System.out.println("El total de horas trabajadas en el mes es de " + sumaHoras);
					if (horasExtra > 0) {
						System.out.println("El trabajador ha trabajado un total de " + horasExtra + " horas extra.\n");
					} else {
						System.out.println("El trabajador no ha realizado horas extras");
					}
					System.out.println("Indíque el puesto del trabajador:");
					System.out.println("1. Desarrollador.");
					System.out.println("2. Coordinador.");
					System.out.println("3. Secretario.");
					System.out.println("0. Salir");
					puesto = Leer.datoInt();
	
					switch (puesto) {
						case 1:
							if (horasExtra > 0) {
								salario = (desarrollador * jornadaMes) + (desarrolladorExtra * horasExtra);
							} else {
								salario = desarrollador * sumaHoras;
							}
							System.out.println("El salario del trabajador es de " + salario + " €");
							break;
						case 2:
							if (horasExtra > 0) {
								salario = (coordinador * jornadaMes) + (coordinadorExtra * horasExtra);
							} else {
								salario = coordinador * sumaHoras;
							}
							System.out.println("El salario del trabajador es de " + salario + " €");
							break;
						case 3:
							if (horasExtra > 0) {
								salario = (secretario * jornadaMes) + (secretarioExtra * horasExtra);
							} else {
								salario = secretario * sumaHoras;
							}
							System.out.println("El salario del trabajador es de " + salario + " €");
							break;
						case 0:
							break;
						default:
							System.out.println("Elección inválida, por favor pruebe de nuevo.");
							break;
						}
					break;
				case 4:
					System.out.println("¿Qué salario deseas mostrar?");
					System.out.println("Pulse 1 para mostrar el salario de desarrollador");
					System.out.println("Pulse 2 para mostrar el salario de coordinador");
					System.out.println("Pulse 3 para mostrar el salario de secretario");
					System.out.println("Pulse 0 para volver al menú anterior");
					opcionDos = Leer.datoInt();
					switch (opcionDos) {
	
						case 1:
							System.out.println("El salario del desarrollador es: " + desarrollador + " €");
							System.out.println("El salario de horas extras del desarrollador es: " + 
							desarrolladorExtra+" €");
							break;
						case 2:
							System.out.println("El salario del coordinador es: " + coordinador+" €");
							System.out.println("El salario de horas extras del coordinador es: "
							+coordinadorExtra+" €");
							break;
						case 3:
							System.out.println("El salario del secretario es: " + secretario + " €");
							System.out.println("El salario de horas extras del secretario es: "
							+secretarioExtra+" €");
							break;
						case 0:
							break;
						default:
							System.out.println("Escoge un número de la lista por favor");
							break;
						}
					break;
				case 5:
					vacaciones=0;
					for (int i = 0; i <arrayDias.length; i++) {
						if (arrayDias[i] == 0) {
							vacaciones++;
						}
					}
					System.out.println("El trabajador ha tenido " + vacaciones + " días de vacaciones este mes");
					break;
				case 6:
			 		System.out.println("En este apartado asignaremos recompensas por"
			 				+ " la cantidad de puntos que haya generado el trabajador");
			 		
			 		System.out.println("Indique lo que quiere hacer");
			 		System.out.println("1. Ver los incentivos");
			 		System.out.println("2. Ajustar la cantidad de incentivo");
			 		System.out.println("3. Generar puntos al trabajador");
			 		System.out.println("0. Volver al menú principal");
			 		menu = Leer.datoInt();
			 		switch(menu){
			 		
			 			case 0 :
			 			System.out.println("Ha salido de incentivos");
			 			break;
			 			
			 			case 1 :
			 				if (cantPuntos != 0) {			 		
				 				if (cantPuntos<=nvIncentivo1) {
					 			System.out.println("Este trabajador no ha obtenido incentivos");
					 		
				 				}else if (cantPuntos >= nvIncentivo1 && cantPuntos <= nvIncentivo2 ) {
					 			System.out.printf("Este trabajador obtendrá el segundo nivel de incentivo: %.2f € \n", incentivo2);
					 		
				 				}else {
					 			System.out.printf("Este trabajador obtendrá el tercer nivel de incentivo: %.2f € \n", incentivo3);
				 				}
			 				}else {
			 					System.out.println("Introduzca primero una cantidad de puntos");
			 				}
				 				
				 		break;
				 		
			 			case 2:
			 				System.out.printf("El incentivo 1 vale actualmente %.2f € \n",incentivo1);
			 				System.out.printf("El incentivo 2 vale actualmente %.2f € \n",incentivo2);
			 				System.out.printf("El incentivo 3 vale actualmente %.2f € \n",incentivo3);
			 				System.out.println("Introduzca la cantidad del recompensa del nivel 1");
			 				incentivo1=Leer.datoDouble();
			 				System.out.println("Introduzca la cantidad del recompensa del nivel 2");
			 				incentivo2=Leer.datoDouble();
			 				System.out.println("Introduzca la cantidad del recompensa del nivel 3");
			 				incentivo3=Leer.datoDouble();
				 		break;
			 			case 3:
			 				System.out.println("Pulse 1 para asignar una cantidad de puntos manualmente");
			 				System.out.println("Pulse 2 para generar una cantidad de puntos aleatoria");
			 				System.out.println("Pulse 0 para volver al menú principal");
			 				opcionIncentivo = Leer.datoInt();
			 				switch (opcionIncentivo) {
			 					case 1:
			 						System.out.println("Introduce los puntos de incentivo que ha conseguido el trabajador");
			 						cantPuntos=Leer.datoInt();
			 						break;
			 					case 2:
			 						cantPuntos = num.nextInt(maxPuntos - minPuntos + 1) + minPuntos;
			 						System.out.println("La cantidad de puntos del trabajador es : " + cantPuntos);
			 						break;
			 					case 0:
			 						break;
			 					default:
			 						System.out.println("Por favor, elija una opción válida");
			 						break;
			 				}
			 			break;
			 			
			 			default:
				 		System.out.println("No ha dado un valor válido");
				 		
				 		
				 		}
			 		
			 			break;

				case 7:
					System.out.println("Pulse 1 para reajustar el salario de Desarrollador");
					System.out.println("Pulse 2 para reajustar el salario de Coordinador");
					System.out.println("Pulse 3 para reajustar el salario de Secretario");
					System.out.println("Pulse 4 para reajustar el salario de horas extras de Desarrollador");
					System.out.println("Pulse 5 para reajustar el salario de horas extras de Coordinador");
					System.out.println("Pulse 6 para reajustar el salario de horas extras de Secretario");
					System.out.println("Pulse 0 para volver al menú anterior");
					opcionTres = Leer.datoInt();
					switch (opcionTres) {
					case 1:
						System.out.println("Defina el nuevo salario del desarrollador");
						desarrollador=Leer.datoDouble();
						while (desarrollador <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							desarrollador=Leer.datoDouble();
						}
						break;
					case 2:
						System.out.println("Defina el nuevo salario del coordinador");
						coordinador=Leer.datoDouble();
						while (coordinador <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							coordinador=Leer.datoDouble();
						}
						break;
					case 3:
						System.out.println("Defina el nuevo salario del secretario");
						secretario=Leer.datoDouble();
						while (secretario <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							secretario=Leer.datoDouble();
						}
						break;
					case 4:
						System.out.println("Defina el nuevo salario de las horas extras del desarrollador");
						desarrolladorExtra=Leer.datoDouble();
						while (desarrolladorExtra <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							desarrolladorExtra=Leer.datoDouble();
						}
						break;
					case 5:
						System.out.println("Defina el nuevo salario de las horas extras del coordinador");
						coordinadorExtra=Leer.datoDouble();
						while (coordinadorExtra <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							coordinadorExtra=Leer.datoDouble();
						}
						break;
					case 6:
						System.out.println("Defina el nuevo salario de las horas extras del secretario");
						secretarioExtra=Leer.datoDouble();
						while (secretarioExtra <= 0) {
							System.out.println("Por favor, introduce un número positivo");
							secretarioExtra=Leer.datoDouble();
						}
						break;
					case 0:
						break;
					default:
						System.out.println("Escoge una opción de la lista por favor");
						break;
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Escoge un número de la lista por favor");
					break;
				}
			} while (opcion != 0);
		System.out.println("Gracias por usar el programa");
		System.out.println("Este programa fue creado por:");
		System.out.println("\n- Álvaro Franco Martínez" );
		System.out.println("- Luis Miguel Serón Delgado");
		System.out.println("- Nicolás Fernández de la Fuente Bursón");
		System.out.println("- Carlos Jesús Durbán Viloca");
		System.out.println("\nTodos los derechos reservados ©");
	}
}