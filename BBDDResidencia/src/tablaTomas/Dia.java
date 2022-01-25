package tablaTomas;

import java.time.LocalDate;

public class Dia {
	
	private LocalDate fecha;
	
	
	public Dia (LocalDate fecha) {
		this.fecha = fecha;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	

}
