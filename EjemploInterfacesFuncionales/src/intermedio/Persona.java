package intermedio;

public class Persona {
	
	private int idPersona;
	private String nombre;
	private int edad;
	private int altura;
	private double peso;
	private String domicilio;
	
	
	public Persona(int idPersona, String nombre, int edad, int altura, double peso, String domicilio) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.domicilio = domicilio;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + ", domicilio=" + domicilio + "]";
	}
	
	

}
