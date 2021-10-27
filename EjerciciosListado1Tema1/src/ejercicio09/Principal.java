
package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 9
		/*A mi padre le gusta medir la capacidad de las personas que admite
		 *  un lugar o evento en "el número de Navas (mi pueblo)", en este
		 *   caso, Navas sería una unidad de medida de número de personas 
		 *   que habría en un lugar, por ejemplo, si mi pueblo tiene 1500 
		 *   habitantes, en un campo de futbol de 15000 espectadores, cabrían
		 *    "10 Navas".
		 *    Calcular el número de Navas que entrarían en el Camp Nou, en el
		 *     concierto de U2 del estadio olímpico donde asistieron 65000 personas
		 *      y en el teatro del colegio, que tiene 600 localidades.
		 */
		double navas = 1500, campNou = 99354, conciertoU2 = 65000, teatro = 600,
				navasCampNou = 0, navasU2 = 0, navasTeatro = 0;
		System.out.println("Este programa tratar� de responder a esta pregunta:");
		System.out.println("¿Cuántas Navas caben en mi aforo?");
		navasCampNou = campNou / navas;
		navasU2 = conciertoU2 / navas;
		navasTeatro = teatro / navas;
		System.out.printf("En el Camp Nou entran %.2f Navas, en el concierto de U2 %.2f Navas y"
				+ " en el teatro del colegio %.2f Navas.\n\n", navasCampNou, navasU2, navasTeatro);
		System.out.println("Gracias por usar el programa\n");
		System.out.println("Desconectando...");
		
	}

}
