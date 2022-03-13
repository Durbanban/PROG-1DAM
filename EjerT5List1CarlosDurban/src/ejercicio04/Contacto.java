package ejercicio04;

public class Contacto {
	
	private int id;
	private String nombre;
	private String sexo;
	private int edad;
	private String numTelefono;
	private String entorno;
	
	public Contacto(int id, String nombre, String sexo, int edad, String numTelefono, String entorno) {
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.numTelefono = numTelefono;
		this.entorno = entorno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getEntorno() {
		return entorno;
	}

	public void setEntorno(String entorno) {
		this.entorno = entorno;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", numTelefono="
				+ numTelefono + ", entorno=" + entorno + "]";
	}
	
	
	
	
	

}
