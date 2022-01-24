package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu = 0, numDepo = 0, litrosDepo = 0, posicionDepo = 0, indiceDepo = 0, porc = 0;
		double precioLitros = 0.7, alturaDepo = 0.0, radioDepo = 0.0, precioDepo = 0.0, precioFinalDepo = 0.0;
		
		System.out.println("Bienvenido a PlApptaforma");
		
		System.out.println("Indique el número de depósitos disponible en la plataforma");
		numDepo = Leer.datoInt();
		Deposito deposito;
		Deposito [] depos = new Deposito [numDepo];
		
		Plataforma plat = new Plataforma (depos);
						
		do {
			plat.mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					System.out.println("Indique la altura del depósito:");
					alturaDepo = Leer.datoDouble();
					System.out.println("Indique el radio del depósito: ");
					radioDepo = Leer.datoDouble();
					System.out.println("Indique los litros que contiene el depósito: ");
					litrosDepo = Leer.datoInt();
					System.out.println("Indique el precio base del depósito: ");
					precioDepo = Leer.datoDouble();
					deposito = new Deposito (alturaDepo, radioDepo, litrosDepo, precioDepo);
					plat.addDeposito(deposito, posicionDepo);
					posicionDepo ++;
					System.out.println("Su nuevo depósito es: " + deposito);
					break;
				case 2:
					plat.mostrarDepos();
					System.out.println("Indique el número de depósito: ");
					indiceDepo = Leer.datoInt();
					System.out.println("Indique el porcentaje de beneficio: ");
					porc = Leer.datoInt();
					System.out.printf("El precio de venta a Repsol es: %.2f €", plat.calcularPrecioFinal(indiceDepo, porc));
					break;
				case 3:
					System.out.println("Actualmente la plataforma tiene " + plat.calcularLitrosTotales() + 
							" litros de " + Plataforma.getCapacidadTotal() + " litros que puede tener.");
					break;
				case 4:
					plat.mostrarDepos();
					System.out.println("Indique el número de depósito: ");
					indiceDepo = Leer.datoInt();
					System.out.printf("Repsol se llevaría %.2f € por ese depósito", plat.calcularBeneficio(indiceDepo, precioLitros));
					break;
				case 5:
					System.out.printf("Repsol se llevaría %.2f € por todos los depósitos actualmente", plat.calcularBeneficioTotal(precioLitros));
					break;
				case 6:
					System.out.printf("Repsol se llevaría %.2f € por todos los depósitos si estuvieran llenos completamente", plat.calcularBeneficioTeorico(precioLitros));
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija la opción correcta");
					break;
			}
		}while (opcionMenu != 0);
		System.out.println("Gracias por usar el programa");

	}

}
