package ejemplo1;

public class Alumno {
	
	// Atributos
	
	private int edad;
	private String nombre;
	private String apellidos;
	private double notaMedia;
	
	//Constructor
	
	public Alumno (int edad, String nombre, String apellidos, double notaMedia) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}
	
	//Constructor sin edad
	
	public Alumno (String nombre, String apellidos, double notaMedia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
	}
	
		
	//getters and setters
	
	public int getEdad () {
		return edad;
	}
	public void setEdad (int edad) {
		this.edad = edad;
	}
	public String getNombre () {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos () {
		return apellidos;
	}
	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}
	public double getNotaMedia () {
		return notaMedia;
	}
	public void setNotaMedia (double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	//Método nuestro
	
	public double sumarPuntos (double puntos) {
		notaMedia = notaMedia + puntos;
		return notaMedia;
	}


}
