package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 7
		/*Realizar un programa que nos ayude a calcular el dinero gastado en gasolina en un viaje.
		Para ello, daremos los kil�metros recorridos, el consumo del coche a los 100 Km y el precio
		por litro de gasolina.
		*/
		double dinero = 0, km = 341, consumo = 6.3, precioL = 1.363, factorConsumo = 100, litrosGasolina;
		System.out.println("Bienvenido a Repsol");
		System.out.println("Este programa va a calcular el precio del combustible en su viaje:\n");
		litrosGasolina = (km * consumo)/factorConsumo;
		dinero = litrosGasolina * precioL;
		System.out.printf("El coche recorre %.2f kilómetros, con un consumo de %.1f litros a los 100 km"
				+ "y esto supone un gasto de %.2f euros\n\n", km, consumo, dinero);
		System.out.println("Gracias por usar el programa");
		System.out.println("Buen viaje");
		System.out.println("Desconectando...");
		
		


	}

}
