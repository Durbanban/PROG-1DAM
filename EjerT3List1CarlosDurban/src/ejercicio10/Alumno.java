package ejercicio10;

public class Alumno {
	
	private String nombre;
	private Nota [] notas;
	
	public Alumno (String nombre, Nota [] notas) {
		this.nombre = nombre;
		this.notas = notas;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public Nota [] getNotas () {
		return notas;
	}
	
	public void setNotas (Nota [] notas) {
		this.notas = notas;
	}

}
