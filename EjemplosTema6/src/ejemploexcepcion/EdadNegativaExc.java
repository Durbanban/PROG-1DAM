package ejemploexcepcion;

public class EdadNegativaExc extends Exception {
	
	/**
	 * Esto tiene que ver con serializar datos, para trabajar con bases de datos en internet, no tiene que ver con las excepciones.
	 */
	private static final long serialVersionUID = 1L;

	public EdadNegativaExc (String mensaje) {
		super(mensaje);
	}
}
