package ejemplo1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 0;
		String nombre, apellidos;
		double notaMedia = 0.0, puntos = 0.0;
		Alumno a1 = new Alumno (30, "Carlos Jesús", "Durbán Viloca", 9.3);
		Alumno a2 = new Alumno (25, "Álvaro", "Franco Martínez", 9.2);
		Alumno aEditado;
		
		System.out.println("Introduzca la edad");
		edad = Leer.datoInt();
		System.out.println("Introduzca el nombre");
		nombre = Leer.dato();
		System.out.println("Introduzca los apellidos");
		apellidos = Leer.dato();
		System.out.println("Introduzca la nota media");
		notaMedia = Leer.datoDouble();
		aEditado = new Alumno (edad, nombre, apellidos, notaMedia);
		System.out.println("Mi edad es " + a1.getEdad ());
		System.out.println("Mi nombre es " + a1.getNombre ());
		System.out.println("Mis apellidos son " + a1.getApellidos ());
		System.out.println("Mi nota media es " + a1.getNotaMedia ());
		System.out.println("Mi edad es " + a2.getEdad ());
		System.out.println("Mi nombre es " + a2.getNombre ());
		System.out.println("Mis apellidos son " + a2.getApellidos ());
		System.out.println("Mi nota media es " + a2.getNotaMedia ());
		System.out.println("Mi edad es " + aEditado.getEdad ());
		System.out.println("Mi nombre es " + aEditado.getNombre ());
		System.out.println("Mis apellidos son " + aEditado.getApellidos() );
		System.out.println("Mi nota media es " + aEditado.getNotaMedia ());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(aEditado);
		
		System.out.println("Introduzca una nueva nota media: ");
		notaMedia = Leer.datoDouble();
		aEditado.setNotaMedia(notaMedia);
		System.out.println("Su nueva nota media es " + aEditado.getNotaMedia ());
		
		System.out.println("Introduzca una nueva nota media de Carlos Jesús: ");
		notaMedia = Leer.datoDouble();
		a1.setNotaMedia (notaMedia);
		System.out.println("La nueva nota media de Carlos Jesús es: " + a1.getNotaMedia ());
		System.out.println("Mi edad es " + a1.getEdad ());
		System.out.println("Mi nombre es " + a1.getNombre ());
		System.out.println("Mis apellidos son " + a1.getApellidos ());
		System.out.println("Mi nota media es " + a1.getNotaMedia ());
		
		System.out.println("¿Cuántos puntos quiere sumar a la nota media?");
		puntos = Leer.datoDouble();
		aEditado.sumarPuntos(puntos);
		System.out.println("Su nueva nota media es: " + aEditado.getNotaMedia ());
		
	}

}
