package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio2
		/*Calcula y muestra en pantalla el área de una piscina olímpica (50 m de largo por 21
		 *  de ancho). ¿Cuántos litros de agua hacen falta para llenarla si tiene 2,50 m de
		 *   profundidad? ¿Cuánto costará llenarla si el metro cúbico cuesta 1,80 €?
		 */
		
		double precioLitro = 1.80,  litrosMetroCubico = 1000, piscinaLargo = 50;
		double piscinaAncho = 21, piscinaProfundidad = 2.5, piscinaArea = 0, piscinaVolumen = 0;
		double piscinaLitros = 0, piscinaPrecio = 0; 
		System.out.println("Este programa va a calcular el área de una piscina olímpica\n"
				+ "los litros que se necesitan para llenarse y el precio que costaría\n\n");
		piscinaArea = piscinaAncho * piscinaLargo;
		System.out.printf("El área de la piscina olímpica es: %.2f metros cuadrados\n", piscinaArea );
		piscinaVolumen = piscinaAncho * piscinaLargo * piscinaProfundidad;
		piscinaLitros = piscinaVolumen * litrosMetroCubico;
		System.out.printf("La piscina necesita %.2f litros para llenarse\n", piscinaLitros);
		piscinaPrecio = piscinaVolumen * precioLitro;
		System.out.printf("El precio de llenar la piscina es: %.2f euros\n\n\n", piscinaPrecio);
		System.out.println("Gracias por usar el programa\nDesconectando...");
		

	}

}
