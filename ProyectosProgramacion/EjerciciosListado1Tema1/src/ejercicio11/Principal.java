package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 11
		/*¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido
		*que abrir pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo
		*y la capacidad del dep�sito para guardar el agua en metros cúbicos. Sería capaz de crear
		*un programa que calcule cuantos metros cúbicos se sacan de uno de los pozos que tiene
		*un caudal de 8 litros por segundo si está conectado 24 horas.
		*/
		double capPozoSec = 8.0, capDepo = 0.0, conversorM3 = 1000.0, capPozoMin = 0.0, capPozoHor = 0.0,
				capPozoDia = 0.0, conversorL = 60.0, horas = 24.0;
		
		System.out.println("Bienvenido al programa de cálculo de sequías");
		capPozoMin = capPozoSec * conversorL;
		capPozoHor = capPozoMin * conversorL;
		capPozoDia = capPozoHor * horas;
		System.out.printf("Se puede sacar %.2f litros en %.0f horas del pozo.\n", capPozoDia, horas);
		capDepo = capPozoDia / conversorM3;
		System.out.printf("La capacidad por tanto del depósito será de %.2f metros cúbicos si"
				+ " el pozo está conectado %.0f horas.\n", capDepo, horas);
		System.out.println("Gracias por usar el programa");
		System.out.println("Desconectando...");
		
			
		

	}

}
