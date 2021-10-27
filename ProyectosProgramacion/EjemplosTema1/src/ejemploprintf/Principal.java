package ejemploprintf;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldoBruto = 867.342796;
		double sueldoNeto = 743.56823;
		int edad = 30;
		
		String apellido1 = "Durbán";
		String apellido2 = "Viloca";
		
		System.out.printf("El sueldo bruto del profesor es: %.2f euros\n"
				+ "Y su sueldo neto es: %.2f euros\nAdemás"
				+ " tengo %d años\n" , sueldoBruto, sueldoNeto, edad);
		System.out.printf("Mis apellidos son: %s %s y tengo %d años y gano %.2f euros al mes",
				apellido1, apellido2, edad, sueldoNeto);
		
	}

}
