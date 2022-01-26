package ejemploConstructorMadre;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador trab = new Trabajador ("Durbán", "Técnico en frustración");
		
		Empleado emp = new Empleado ("Durbi", "Jefe de sección", 24000.0, 20.0);
		
		Consultor cons = new Consultor ("Durbinklein", "Responsable de marketing", 25, 17.50);
		
		System.out.println(trab);
		System.out.println(emp);
		System.out.println(cons);
		
		
		System.out.println(trab.calcularPaga());
		System.out.println(emp.calcularPaga());
		System.out.println(cons.calcularPaga());

	}

}
