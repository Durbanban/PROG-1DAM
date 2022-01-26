package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Ordenador pc = new Ordenador (512.0, 2.4, 399.95);
		Tablet t = new Tablet (256.0, 1.9, 199.95, 19.99);
		Portatil p = new Portatil (1024.0, 3.2, 499.95, 0.10);
		
		System.out.println(pc);
		System.out.println(t);
		System.out.println(p);
		
		System.out.printf("El precio del pc es: %.2f €\n", pc.calcularPrecioVenta());
		System.out.printf("El precio de la tablet es: %.2f €\n", t.calcularPrecioVenta());
		System.out.printf("El precio del portátil es: %.2f €\n",p.calcularPrecioVenta());

	}

}
