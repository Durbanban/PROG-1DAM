package ejercicio10;


public class Gestion {
	
	
	public void menuPrincipal () {
		System.out.println("Pulse 1 para registrar a un alumno");
		System.out.println("Pulse 2 para abrir el menú de notas");
		System.out.println("Pulse 0 para salir");
	}
	
	public Alumno registrarAlumno (String nombre) {
		Alumno a1 = new Alumno (nombre, null);
		return a1;
	}
	
	
	

}
