package avanzado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Se quiere generar un torneo de Luchadores con diferentes atributos, y ordenarlos en base a estos. También se quiere
		 * crear varios tipos de combate y que se vayan eliminando a los perdedores hasta que sólo quede un luchador.
		 */
		
		int opcionMenu = 0, min = 30, max = 120, tope = 0;
		Random num = new Random (System.nanoTime());
		Luchador ganador;
		String fighter1, fighter2, nombre = "Luchador";
		ComparaPorPuntosHP cpphp = new ComparaPorPuntosHP();
		List <Luchador> lista = new ArrayList <Luchador>();
		CrudLuchador crudL = new CrudLuchador(lista);
		/*
		 * ¿Qué es una interfaz funcional?
		 * No es más que una interfaz con un único método abstracto, y será la expresión lambda la que implementará dicho método en el programa,
		 * siempre cumpliendo que use la misma firma (parámetros de entrada y de salida) del método de la interfaz (como ya hemos visto con las 
		 * interfaces convencionales en clase. Eclipse se apoya en la anotación @FunctionalInterface, para avisarte de que estás cumpliendo los 
		 * requisitos para que una interfaz sea funcional. Adicionalmente puede tener más métodos default o estáticos, siempre que sólo tenga
		 * un método abstracto.
		 */
		
		/*
		 * La interfaz funcional Supplier es un tipo de interfaz que no recibe ningún tipo de argumentos, y produce un resultado del tipo que se le indique
		 * entre '<>'. Esto es ideal para generar datos de forma diferente cada vez, o por ejemplo crear instancias de objetos, ya que el concepto de constructor
		 * por defecto es similar. Adicionalmente tenemos BooleanSupplier (devuelve un booleano), DoubleSupplier (devuelve un double), IntSupplier (devuelve 
		 * un Integer), y LongSupplier (devuelve un long).
		 * 
		 * El único método que tiene esta interfaz funcional es el método get().
		 * 
		 * Supplier <Tipo> nombre = () -> resultado del tipo; La expresión lambda debe ir sin parámetros de carga con los paréntesis.
		 * 
		 */
		
		Supplier <Double> crearRandom = () -> min + (max - min) * num.nextDouble();
		Supplier <Luchador> generadorLuchadores = () -> new Luchador("", crearRandom.get(), crearRandom.get()
				, crearRandom.get(), crearRandom.get(), crearRandom.get());
		
		/*
		 * La interfaz funcional Consumer es un tipo de interfaz que recibe un parámetro, y no devuelve resultado alguno. Parecido a un método void.
		 * La expresión lambda es la encargada de implementar dicho método en el programa. Este tipo de interfaz podría ser útil para pintar elementos
		 * en el programa, ya que no tiene que devolver nada. Adicionalmente también existen las interfaces BiConsumer (recibe dos elementos que pueden
		 * ser de distinto tipo), DoubleConsumer (recibe un elemento de tipo Double), IntConsumer (recibe un elemento de tipo Integer), LongConsumer
		 * (recibe un elemento de tipo long), además de las ObjDoubleConsumer, ObjIntConsumer y ObjLongConsumer, que son como las BiConsumer, pero
		 * como su propio nombre indica, la primera recibe objeto y Double, la segunda recibe objeto e Integer, y la última recibe objeto y long.
		 * 
		 * El único método que tiene esta interfaz funcional es accept().
		 * 
		 * Consumer <Tipo> nombre = t1 -> operaciones sin retorno; Si la expresión lambda recibe un único argumento, no hacen falta paréntesis.
		 * 
		 * BiConsumer <Tipo1, Tipo2> nombre = (t1, t2) -> operaciones sin retorno; Si la expresión lambda tiene más de un argumento, se ponen entre
		 * paréntesis.
		 */
		
		Consumer <Luchador> mostrarLuchador = l1 -> {if (l1 != null) {System.out.print("                                          /@@*((                                \r\n"
				+ "                                      (@*/@@(/#/                                \r\n"
				+ "                                   /@*@@@@@@///%                                \r\n"
				+ "                                 ,@*@@@@@(/@///@&*                              \r\n"
				+ "                                .&%@@@(/////(////.@*                            \r\n"
				+ ".,.                             *@@@#@((////////* *@@*                          \r\n"
				+ "  *@#%@%(.                      .@@@@(((((&&&%(@/((//&/                         \r\n"
				+ "    /@@&//*#@(.                  *@&@(((((((((((((((.@,                         \r\n"
				+ "      *@@@@(///,&%,               #%@@((@@@@@@(&(@@@/@*                         \r\n"
				+ "        .%@@@@&////,@#,          *@%@@@@(((@@#(@/(//,%                          \r\n"
				+ "           *@@@@@@(//,/*@/      *@&@@@@@@((((/((((///(                          \r\n"
				+ "              *@@@@@@&////,@#//*%@@@@@@@@@@((/&&@@//#@%(*,                      \r\n"
				+ "                 *&@@@@@@////*%@%%%%%&@@@@@@(/@@@@(/@@&%%&#@.(@@@&%(*,.         \r\n"
				+ "               (@&%%%&@@@@@@%///*(@/(%%%%%@@((@@@@@@@&&&&&@&&%%@@&%( @,         \r\n"
				+ "            *@&%%%///////%@@@@@@////,@///#%%%@@@@@@@@@@@@@&&&&@@&&&%@&*         \r\n"
				+ "          *@&&&(//////#&%%%%%@@@@@@%///*&&//%%%&@@@@@@@@@@@@@@&&&@@@//.%%       \r\n"
				+ "         %@&@#(////%%%%%%%&/.&.*&@@@@@@////.@(%%%@@@@@@@@@@@@@@&&@%///// @/     \r\n"
				+ "        &&&&(((//&%%%%#   (  &  #   %@@@@@#////,@&@@@@@@@@@@@@@@@(///////&@(    \r\n"
				+ "       %@&&(((((%%%%%%%%%%%  &  %%%%%%%&@@@@@@//////&/,@@@@@@@@@@@((///////@*   \r\n"
				+ "      *@&&#((((&&%%%%%%%%%%  &  %%%%%%%%%%&@@@@@@/@((///@@@@@@@@@@@@@@@@@(//@%. \r\n"
				+ "      /@&&((((#&&&%%%%%%%%%  &  %%%%%%%%%%%%&(@@@@@@&(@%((////* &/////////////&/\r\n"
				+ "      /@&&((((#&&&&. &%%%%%  &  %%%%%%/ *%%%&/&@@@@@@@&(%((&(///////////((((&@@@\r\n"
				+ "      ,@&&%((((&&&&/.*%%%%%  &  %%%%%&  &%%%(////&%&@@@@(%((&((@@@@@@@@@@@@@@@( \r\n"
				+ "       (@&&(((((&&&&&..(&%%  &  %%%%  *%%%%#////%%%@@@@#&@@#(@@@@@@/@@@@@@@@/   \r\n"
				+ "        #@&&(((((#&&&&&#.....&     .&%%%%%/////%&&@@@@@@@@&..@@@@@@@@***.       \r\n"
				+ "         /@&&&((((((&&&&&&&&&&&&&&&&&&&&((((((&&&@@@@@@@@*     *((/.            \r\n"
				+ "          .%@&&&(((((((#&&&&&&&&&&&%(((((((#&&&@@@@@@@@/                        \r\n"
				+ "             #@&&&&(((((((((((((((((((((#&&&@@@@@@@@@*                          \r\n"
				+ "               .#@&&&&&&#(((((((((#%&&&&&@@/@@@@@@&,                            \r\n"
				+ "                   ./&@@&&&&&&&&&&&@@@#*     /@@/                               \r\n");
			System.out.printf("*********************************************************************************\r\n"
			+ "*\t\t\t\t*GANADOR*\t\t\t\t\t*\n*\t\t\t\t%s\t\t\t\t\t\t*\n*\t\t\tPuntos de vida -> %.2f\t\t\t\t\t*\n*\t\t\tPuntos de Ataque -> %.2f"
			+ "\t\t\t\t*\n*\t\t\tPuntos de Defensa -> %.2f\t\t\t\t*\n*\t\t\tPuntos de Velocidad -> %.2f\t\t\t\t*\n*"
			+ "\t\t\tPuntos de daño -> %.2f\t\t\t\t*\n"
			+ "*********************************************************************************\n", l1.getNombre(), l1.getPuntosHP()
			, l1.getPuntosATK(), l1.getPuntosDEF(), l1.getPuntosVelocidad(), l1.getDamage());
			}else {
				System.out.println("Lo sentimos, no existe ese luchador");
			}
		};
		
		/*
		 * La interfaz funcional Function es un tipo de interfaz que recibe un parámetro de un tipo determinado, y devuelve otro parámetro de otro tipo
		 * o del mismo. La expresión lambda es la que se encarga de implementar la interfaz en el programa. Es la interfaz que más variantes tiene
		 * y la que más utilidades puede tener. Sirve para hacer muchas cosas, por ejemplo para realizar una búsqueda. Entre sus variantes tenemos las
		 * interfaces BiFunction, que recibe 2 argumentos, y devuelve 1, toda la variedad de tipos de Function, como IntFunction, DoubleFunction, etc.
		 * Y además las interfaces ToIntFunction (va a devolver un Integer), ToDoubleFunction (devuelve un Double), etc.
		 * Por último, tenemos las interfaces funcionales derivadas de Function, como UnaryOperator, que recibe un argumento de un tipo, y devuelve otro
		 * del mismo, y BinaryOperator, que recibe dos argumentos y devuelve uno, siendo todos del mismo tipo.
		 * 
		 * El único método que tiene esta interfaz funcional es apply().
		 *
		 * Function <Tipo 1, Tipo2> nombre = t1 -> resultado del t2;
		 * BiFunction <Tipo1, Tipo2, Tipo3> = (t1, t2) -> resultado del t3;
		 */
		
		Function <String, Luchador> funcionBuscar = s1 -> {
			Luchador aux = null;
			boolean salir = false;
			for (int i = 0; i < lista.size() && !salir; i++) {
				if (lista.get(i).getNombre().equalsIgnoreCase(s1)) {
					aux = lista.get(i);
					salir = true;
				}
			}
				if (!salir) {
					aux = null;
				}
			return aux;
		};
		
		/*
		 * Esta interfaz funcional llamada combate, es una creada por mi. Aquí le damos dos argumentos de tipo Luchador (l1 y l2), y mediante la
		 * expresión lambda va a devolver un luchador (el ganador), y el luchador perdedor lo elimina de la lista de luchadores. Realmente sería
		 * como una BiFunction, ya que recibe dos luchadores y devuelve el luchador ganador (incluso una BinaryOperator).
		 */
		ICombate combate = (l1, l2) -> {
			Luchador gana = null, pierde = null;
			do {
				if (l1.getPuntosVelocidad() > l2.getPuntosVelocidad()) {
					if (l1.getPuntosATK() > l2.getPuntosDEF()) {
						l2.setPuntosHP(l2.getPuntosHP() - l1.getDamage());
						if (l2.getPuntosHP() <= 0) {
							gana = l1;
							pierde = l2;
						}
					}else {
						l1.setPuntosHP(l1.getPuntosHP() - l2.getDamage());
						if (l1.getPuntosHP() <= 0) {
							gana = l2;
							pierde = l1;
						}
					}
				}else {
					if (l2.getPuntosATK() > l1.getPuntosDEF()) {
						l1.setPuntosHP(l1.getPuntosHP() - l2.getDamage());
						if (l1.getPuntosHP() <= 0) {
							gana = l2;
							pierde = l1;
						}
					}else {
						l2.setPuntosHP(l2.getPuntosHP() - l1.getDamage());
						if (l2.getPuntosHP() <= 0) {
							gana = l1;
							pierde = l2;
						}
					}
				}
			}while (l1.getPuntosHP() >= 0 && l2.getPuntosHP() >= 0);
			crudL.getListado().remove(pierde);
			return gana;
		};
		 
			
		System.out.println("Bienvenido a Mortal KombApp");
		System.out.println("¿Cuántos luchadores quiere?");
		tope = Leer.datoInt();
		/*
		 * Primero generamos la lista de luchadores, con los atributos aleatorios generados gracias a una función Supplier, excepto el nombre
		 * que se lo pedimos al usuario. El bucle se hace hasta que llega al límite indicado por el usuario.
		 */
		while (crudL.getListado().size() < tope) {
			System.out.println("Indique el nombre del jugador");
			nombre = Leer.dato();
			crudL.crearLuchador(generadorLuchadores, new Luchador(), nombre);
		}
		
		do {
			mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					/*
					 * Lista ordenada de forma natural, usando el método de la interfaz Comparable de la clase POJO. 
					 */
					Collections.sort(crudL.getListado());
					if (crudL.getListado().size() == 1) {
						ganador = crudL.getListado().get(0);
						mostrarLuchador.accept(ganador);
					}else {
						for (Luchador luchador : crudL.getListado()) {
							System.out.println(luchador);
						}
					}
					break;
				case 2:
					/*
					 * Lista ordenada por puntos de vida. Para ello se ha instanciado la clase ComparaPorPuntosHP, la cual implementa
					 * la interfaz Comparator (sí, es una interfaz funcional). En las siguientes maneras de ordenar veremos cómo nos
					 * podemos ahorrar eso.
					 */
					Collections.sort(crudL.getListado(), cpphp);
					if (crudL.getListado().size() == 1) {
						ganador = crudL.getListado().get(0);
						mostrarLuchador.accept(ganador);
					}else {
						for (Luchador luchador : crudL.getListado()) {
							System.out.println(luchador);
						}
					}
					break;
				case 3:
					/*
					 * Lista ordenada por puntos de ataque. Para ello se ha creado una clase anónima Comparator que implementa su método
					 *  compare(). Esto nos ahorra el crear una nueva clase para ordenar de otra manera.
					 */
					Collections.sort(crudL.getListado(), new Comparator<Luchador>() {
						@Override
						public int compare(Luchador o1, Luchador o2) {
							int resultado = 0;
							if (o1.getPuntosATK() > o2.getPuntosATK()) {
								resultado = -1;
							}else if (o1.getPuntosATK() < o2.getPuntosATK()) {
								resultado = 1;
							}
							return resultado;
						}
					});
					if (crudL.getListado().size() == 1) {
						ganador = crudL.getListado().get(0);
						mostrarLuchador.accept(ganador);
					}else {
						for (Luchador luchador : crudL.getListado()) {
							System.out.println(luchador);
						}
					}
					break;
				case 4:
					/*
					 * Lista ordenada por puntos de defensa. Aquí empleamos el uso de expresiones lambda, que van a implementar a la clase
					 * anónima Comparator un criterio de ordenación. Se ahorra más código aún y es más legible.
					 */
					Collections.sort(crudL.getListado(), (o1, o2) -> {
						int resultado = 0;
						if (o1.getPuntosDEF() > o2.getPuntosDEF()) {
							resultado = -1;
						}else if (o1.getPuntosDEF() < o2.getPuntosDEF()) {
							resultado = 1;
						}
						return resultado;
					});
					if (crudL.getListado().size() == 1) {
						ganador = crudL.getListado().get(0);
						mostrarLuchador.accept(ganador);
					}else {
						for (Luchador luchador : crudL.getListado()) {
							System.out.println(luchador);
						}
					}
					break;
				case 5:
					/*
					 * Lista ordenada por puntos de velocidad. LLegamos al máximo exponente de compactación y ahorro de cógido. Las referencias
					 * a métodos. En una línea de código hemos creado la clase anónima Comparator, y con un método default que tiene (comparing)
					 * hemos rescatado el parámetro por el cuál queremos que nos ordene la lista (Luchador::getPuntosVelocidad). Para que lo haga
					 * de mayor a menos simplemente añadimos el método .reversed() para que le de la vuelta a la ordenación.
					 */
					Collections.sort(crudL.getListado(), Comparator.comparing(Luchador::getPuntosVelocidad).reversed());
					if (crudL.getListado().size() == 1) {
						ganador = crudL.getListado().get(0);
						mostrarLuchador.accept(ganador);
					}else {
						for (Luchador luchador : crudL.getListado()) {
							System.out.println(luchador);
						}
					}
					break;
				case 6:
					if (crudL.getListado().size() > 1) {
						System.out.println("Indique el nombre del primer luchador");
						fighter1 = Leer.dato();
						System.out.println("Indique el nombre del segundo luchador");
						fighter2 = Leer.dato();
						/*
						 * Con esta línea de código se le está pasando varias interfaces funcionales (combate y funcionBuscar), además de los nombres
						 * de los luchadores que desee el usuario para que se produzca el combate.
						 */
						ganador = crudL.combatir(combate, funcionBuscar, fighter1, fighter2);
						mostrarLuchador.accept(ganador);
					}else {
						ganador = crudL.getListado().get(0);
						mostrarLuchador.accept(ganador);
					}
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor, elija una opción correcta");
					break;
			}
		}while (opcionMenu !=0);

	}
	
	public static void mostrarMenuPrincipal() {
		System.out.println("Pulse 1 para mostrar los luchadores en orden alfabético");
		System.out.println("Pulse 2 para mostrar los luchadores de mayor a menor vida");
		System.out.println("Pulse 3 para mostrar los luchadores de mayor a menor puntos de ataque");
		System.out.println("Pulse 4 para mostrar los luchadores de mayor a menor puntos de defensa");
		System.out.println("Pulse 5 para mostrar los luchadores de mayor a menor puntos de velocidad");
		System.out.println("Pulse 6 para empezar un combate");
		System.out.println("Pulse 0 para salir");
	}
	
	

}
