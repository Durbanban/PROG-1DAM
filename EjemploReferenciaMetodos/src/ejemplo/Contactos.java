package ejemplo;

import java.util.List;

public class Contactos {

	private List <Persona> misRedes;
	
	

	public Contactos(List<Persona> misRedes) {
		super();
		this.misRedes = misRedes;
	}

	public List<Persona> getMisRedes() {
		return misRedes;
	}

	public void setMisRedes(List<Persona> misRedes) {
		this.misRedes = misRedes;
	}

	@Override
	public String toString() {
		return "Contactos [misRedes=" + misRedes + "]";
	}
	
	
	
}
