package ejercicio;

/**
 * 
 * Esta clase se va a encargar de gestionar las operaciones de la app respecto a los depósitos.
 * Se caracteriza por tener un array de objetos Deposito, y una variable estática para contabilizar los litros teóricos totales
 *
 * @author Carlos Jesús Durbán Viloca
 * @version 1.0
 */

public class Plataforma {
	
	
	private Deposito [] listaDepo;
	public static int capacidadTotal;
	
	public Plataforma (Deposito [] listaDepo) {
		this.listaDepo = listaDepo;
		Plataforma.capacidadTotal = 0;
	}
	
	public Plataforma () {
		
	}

	public Deposito[] getListaDepo() {
		return listaDepo;
	}

	public void setListaDepo(Deposito[] listaDepo) {
		this.listaDepo = listaDepo;
	}

	public static int getCapacidadTotal() {
		return capacidadTotal;
	}

	public static void setCapacidadTotal(int capacidadTotal) {
		Plataforma.capacidadTotal = capacidadTotal;
	}
	
	
	public void mostrarMenuPrincipal () {
		System.out.println("\nPulse 1 para añadir un nuevo deposito a la plataforma");
		System.out.println("Pulse 2 para calcular el precio de venta al público");
		System.out.println("Pulse 3 para calcular la capacidad total de la plataforma");
		System.out.println("Pulse 4 para calcular el beneficio de Repsol con un depósito");
		System.out.println("Pulse 5 para calcular el beneficio de Repsol con todos los depósitos");
		System.out.println("Pulse 6 para calcular el beneficio teórico (todos los depósitos llenos) de Repsol con la plataforma");
		System.out.println("Pulse 0 para salir");
	}
	
	/**
	 * Este método se encarga de añadir un depósito al array.
	 * 
	 * @param depo Se le pasa un objeto de la clase Deposito.
	 * @param posicion La posición en principal es un contador, de manera que un depósito no va a ser reemplazado en la misma posición.
	 */
	
	public void addDeposito (Deposito depo, int posicion) { // Me sobra el bucle for.
		for (int i = 0; i < listaDepo.length; i++) {
			if (i == posicion) {
				listaDepo [i] = depo;
				capacidadTotal += listaDepo [i].calcularLitros(); // Importante aumentar al variable estática para saber la capacidad máxima de la plataforma.
			}
		}	
	}
	
	/**
	 * Método necesario para la elección del depósito que se quiere vender. Se muestran por pantalla todos los depósitos disponibles.
	 * 
	 */
	public void mostrarDepos () {
		for (int i = 0; i < listaDepo.length; i++) {
			if (listaDepo [i] == null) {
				System.out.println("En construcción");
			}else {
				System.out.println((i+1) + ". " + listaDepo [i]);
			}
			
		}
	}
	
	/**
	 * Este método calcula el precio final del depósito, ya que se le tiene que ganar un porcentaje de ganancia a cada depósito.
	 * 
	 * @param posicion Elección del usuario
	 * @param porcentaje Esta variable entera se divide entre el divisor para conseguir el porcentaje real sobre 1.
	 * @return Se devuelve el precio final, es decir, el precio base junto con la ganancia.
	 */
	
	public double calcularPrecioFinal (int posicion, int porcentaje) {
		double divisor = 100.0;
		return listaDepo [posicion - 1].getPrecioCoste() + listaDepo [posicion - 1].getPrecioCoste() * (porcentaje / divisor); /* Importante poner posicion - 1, ya que los índices
																																  del array empiezan en 0, y la elección del usuario
																																  empieza en 1. Así concuerda la elección con el
																																  índice del array.
																																*/
	}
	
	/**
	 * Este método, mediante un bucle que recorre el array de depósitos, va a calcular los litros reales que tienen todos los depósitos disponibles.
	 * 
	 * @return Devuelve la suma de los litros de todos los depósitos.
	 */
	
	public int calcularLitrosTotales () {
		int suma = 0;
		for (int i = 0; i < listaDepo.length; i++) {
			if (listaDepo[i] != null) {
				suma += listaDepo [i].getLitros();	
			}			
		}
		return suma;
	}
	
	/**
	 * 
	 * Este método va a calcular directamente el beneficio por litro de un depósito a elección del usuario.
	 * 
	 * @param posicion Elección del usuario.
	 * @param precioLitro Se le pasa como parámetro el precio por litro del depósito.
	 * @return Devuelve la cantidad de dinero que generaria vender el depósito elegido con la capacidad real del mismo.
	 */
	
	public double calcularBeneficio (int posicion, double precioLitro) {
		return listaDepo [posicion - 1].getLitros()* precioLitro;
	}
	
	/**
	 * 
	 * Este método va a calcular el beneficio de todos los depósitos que se encuentran en el array.
	 * 
	 * @param precioLitro Se le pasa como parámetro porque puede variar en el tiempo.
	 * @return Devuelve la suma gracias al bucle for, del beneficio total con la capacidad real de todos los depósitos que se encuentran actualmente en la plataforma.
	 */
	
	public double calcularBeneficioTotal (double precioLitro) {
		int suma = 0;
		for (int i = 0; i < listaDepo.length; i++) {
			if (listaDepo [i] != null) {
				suma += listaDepo [i].getLitros();
			}			
		}
		return suma * precioLitro;
	}
	
	/**
	 * 
	 * Este método va a calcular el beneficio por litro de todos los depósitos que se encuentran en la plataforma si estuvieran al máximo de su capacidad.
	 * 
	 * @param precioLitro Parámetro desde fuera en función de su valor de mercado
	 * @return Devuelve el total teórico de beneficio.
	 */
	
	public double calcularBeneficioTeorico (double precioLitro) {
		return capacidadTotal * precioLitro;
	}

}
