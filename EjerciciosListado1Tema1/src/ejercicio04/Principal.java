package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 4
		/*En cada apartado, responde si compilará o no el siguiente código sin usar Eclipse
		 *  para ello. En caso afirmativo, explica qu� se mostrará por pantalla. En caso negativo,
		 *   explica por qué no funciona.
		 */
		//int a = 'a';
		//int pi = 3.14; No compilará ya que int es una variable que sólo contempla números enteros. Da error y no imprime nada.
		double pi = 3.14; //Sí compilará, ya que usa la variable double, que contempla los decimales. El print mostrará 3.14.
		boolean adivina = (1 == 4); //Compilará y saldrá false en el print.
		//boolean adivina2 = (97 == 'a' == true); //Compilará y saldrá true en el print. Aunque es redundante ya que compara afirmaciones idénticas.
		System.out.println('a');
		System.out.println(pi);
		System.out.println(adivina);
		//System.out.println(adivina2);

	}

}
