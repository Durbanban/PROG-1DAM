package ejemplo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate f1=LocalDate.of(1976, 7, 8);
		LocalDate f2=LocalDate.of(1966, 9, 15);
		LocalDate f3=LocalDate.of(2001, 10, 23);
		
		Persona p1=new Persona (45,f1, "Ángel");
		Persona p2=new Persona (65,f2, "Luisa");
		Persona p3=new Persona (21,f3, "María");
		List <Persona> agenda=new ArrayList<Persona>();
		
		agenda.add(p1);
		agenda.add(p2);
		agenda.add(p3);
		
		Contactos redes=new Contactos (agenda);

		//Antes de ordenar
		
		System.out.println(redes.getMisRedes());
		
		//Ordenamos como antes, sin usar Lambdas
		
		Collections.sort(redes.getMisRedes(), new ComparadorPorEdad());
		
		System.out.println("*********");
		System.out.println(redes.getMisRedes());
		
		//ComparadorPorEdad es una interfaz funcional, por lo que podemos usar una expresión Lambda en lugar de definir y crear una nueva
		//clase que implemente Comparator
		//Ordenando con expresión Lambda:
		
		Collections.sort(redes.getMisRedes(),
				(Persona a,Persona b)->{return a.getFechaCumple().compareTo(b.getFechaCumple());
				}
		);
		
		/*Esto  compara los cumpleaños de dos instancias de persona que ya existen y usan el comparador en el sort
		 comparadorPorEda. Ya hay un método que compara por edad como natural en la clase Persona
		 Puedes invocar este método en lugar del comparador usando la siguiente expresión lambda
		 */
		
		Collections.sort(redes.getMisRedes(), (a,b)->Persona.compararPorEdad(a, b)
				
		);
		
		/*Debido a que la expresión lambda invoca a un método existente, puedes usar una "referencia a métodos"
		 * en lugar de una expresión lambda, es decir, escribir lo siguiente:*/
		
		Collections.sort(redes.getMisRedes(),Persona::compararPorEdad);//El método debe ser estático para usar Persona antes de los dos puntos
		
		/*Persona::compararPorEdad es semánticamente lo mismo que la expresión lambda
		 * (a,b)->Persona.compararPorEdad (a, b)
		 * Ambas tienen las siguientes características:
		 * 1. Su lista de parámetros es copiada del método compare de la interfaz funcional 
		 * Comparator<Persona>.compare los cuales son (Persona, Persona)
		 * 2. Su cuerpo llama al método Persona.compararPorEdad*/
		
		//Tipos de referencias a métodos
		
		//Hay 4 tipos de referencias a métodos (pueden verse ejemplos y explicación en el paquete ejemplo2):
		
		/*
			Kind										Syntax									Examples
		Referencia a un 
		método estático						ContainingClass::staticMethodName			Person::compareByAge
																						MethodReferencesExamples::appendStrings
				
																					
		Reference to an instance 
		method of a particular 
		object 								containingObject::instanceMethodName		myComparisonProvider::compareByName
																						myApp::appendStrings2
					
																				
		Reference to an instance method 
		of an arbitrary object of a 
		particular type						ContainingType::methodName					String::compareToIgnoreCase
																						String::concat
																						
																						
		Reference to a constructor			ClassName::new								HashSet::new
		
		*/
		
	}

}
