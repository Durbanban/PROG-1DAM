package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idTrabajador = 1, opcionMenu = 0;
		List <Trabajador> listaTrabajadores = new ArrayList <Trabajador> ();
		
		BiFunction <Trabajador, Trabajador, Integer> bifuncion = (t1, t2) -> {
			int res = 0;
			if (t1.getHorasTrabajadas() > t2.getHorasTrabajadas()) {
				res = -1;
			}else {
				if (t1.getHorasTrabajadas() < t2.getHorasTrabajadas()) {
					res = 1;
				}
			}
			return res;
		};
		Trabajador t1 = new Trabajador (idTrabajador ++, "Pepito Grillo", "55255469-F", 25, 11.50);
		Trabajador t2 = new Trabajador (idTrabajador ++, "Shrek", "77474105-H", 38, 8.50);
		Trabajador t3 = new Trabajador (idTrabajador ++, "Cenicienta", "44510235-I", 2, 65.0);
		Trabajador t4 = new Trabajador (idTrabajador ++, "Dumbo", "11021548-Y", 52, 12.50);
		Trabajador t5 = new Trabajador (idTrabajador ++, "Simba", "74410236-X", 26, 24.50);
		Trabajador t6 = new Trabajador (idTrabajador ++, "Obi Wan Kenobi", "69887410-Z", 16, 54.50);
		Trabajador t7 = new Trabajador (idTrabajador ++, "Doctor Strange", "45410218-G", 85, 45.0);
		
		ComparaPorHoras cph = new ComparaPorHoras ();
		ComparaPorSueldo cps = new ComparaPorSueldo ();
		CrudTrabajador crudTrabajador = new CrudTrabajador (listaTrabajadores);
		
		crudTrabajador.agregarTrabajador(t5);
		crudTrabajador.agregarTrabajador(t2);
		crudTrabajador.agregarTrabajador(t1);
		crudTrabajador.agregarTrabajador(t7);
		crudTrabajador.agregarTrabajador(t6);
		crudTrabajador.agregarTrabajador(t3);
		crudTrabajador.agregarTrabajador(t4);
		
		System.out.println("Bienvenido a Disney");
		do {
			mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					crudTrabajador.mostrarLista();
					break;
				case 2:
					Collections.sort(crudTrabajador.getListado());
					crudTrabajador.mostrarLista();
					break;
				case 3:
//					Collections.sort(crudTrabajador.getListado(), bifuncion.apply(t1, t2));
					
//					crudTrabajador.getListado().sort((o1, o2) -> {
//						int res = 0;
//						if (t1.getHorasTrabajadas() > t2.getHorasTrabajadas()) {
//							res = -1;
//						}else if (t1.getHorasTrabajadas() < t2.getHorasTrabajadas()) {
//							res = 1;
//						}else {
//							res = 0;
//						}
//						return res;
//					});
					//crudTrabajador.getListado().sort(cph);
					Collections.sort(crudTrabajador.getListado(), new Comparator <Trabajador>() {

						@Override
						public int compare(Trabajador o1, Trabajador o2) {
							int res = 0;
							if (o1.getHorasTrabajadas() > o2.getHorasTrabajadas()) {
								res = -1;
							}else if (o1.getHorasTrabajadas() < o2.getHorasTrabajadas()) {
								res = 1;
							}else {
								res = 0;
							}
							return res;
						}
						
					});
					crudTrabajador.mostrarLista();
					break;
				case 4:
					
//					crudTrabajador.getListado().sort((o1, o2) -> {
//						// TODO Auto-generated method stub
//						int res = 0;
//						if (t1.calcularSueldo() > t2.calcularSueldo()) {
//							res = 1;
//						}else {
//							if (t1.calcularSueldo() < t2.calcularSueldo()) {
//								res = -1;
//							}
//						}
//						return res;
//					});
//					Collections.sort(crudTrabajador.getListado(), new Comparator<Trabajador>() {
//						@Override
//						public int compare(Trabajador t11, Trabajador t21) {
//							// TODO Auto-generated method stub
//							int res = 0;
//							if (t11.calcularSueldo() > t21.calcularSueldo()) {
//								res = 1;
//							}else {
//								if (t11.calcularSueldo() < t21.calcularSueldo()) {
//									res = -1;
//								}
//							}
//							return res;
//						}
//					});
					
					Consumer <Trabajador> cons = o1 -> System.out.printf("%s tiene como dni: %s, trabaja %d horas y gana %.2f ???, ya que la hora la cobra a %.2f ???", o1.getNombre(), o1.getDni(), o1.getHorasTrabajadas()
								, o1.calcularSueldo(), o1.getSueldoPorHora());
					cons.accept(crudTrabajador.buscarPorNombre("doctor strange"));
					
					
					crudTrabajador.mostrarLista();
					break;
				default:
					System.out.println("Por favor, elija una opci??n v??lida");
					break;
			}
		}while (opcionMenu != 0);
		
		System.out.println("Gracias por usar el programa");
		
		
		

	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para mostrar los trabajadores sin orden espec??fico");
		System.out.println("Pulse 2 para mostrar los trabajadores ordenados alfab??ticamente");
		System.out.println("Pulse 3 para mostrar los trabajadores ordenados por las horas trabajadas (descendente)");
		System.out.println("Pulse 4 para mostrar los trabajadores ordenados por el sueldo (ascendente)");
		System.out.println("Pulse 0 para salir");
	}
	

}
