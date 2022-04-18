package ejemploexcepcion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	
	
	public static void main(String[] args) {
		String aux;
		int numerador = 0, denominador = 0, resultado = 0;
		Scanner scanner = new Scanner( System.in ); // scanner for input
		boolean continueLoop = true; // determines if more input is needed
		do {
			try /* read two numbers and calculate quotient*/ {
				System.out.print( "Please enter an integer numerator: " );
				//int numerator = scanner.nextInt();
				aux = scanner.nextLine();
				numerador = Integer.parseInt(aux);
				System.out.print( "Please enter an integer denominator: " );
				//int denominator = scanner.nextInt();
				aux = scanner.nextLine();
				denominador = Integer.parseInt(aux);
				//int result = dividir( numerator, denominator );
				//System.out.printf( "\nResult: %d / %d = %d\n", numerator, denominator, result);
				resultado = dividir(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continueLoop = false; // input successful; end looping
			} // end try
			
			catch ( InputMismatchException inputMismatchException ) {
				System.err.printf( "\nException: %s\n",
				inputMismatchException );
				scanner.nextLine(); // discard input so user can try again
				System.out.println("You must enter integers. Please try again.\n" );
			} // end catch
			catch ( ArithmeticException arithmeticException ) {
				System.err.printf( "\nException: %s\n", arithmeticException );
				System.out.println("Zero is an invalid denominator. Please try again.\n" );
			} // end catch
			catch (NumberFormatException numberFormatException) {
				System.err.printf("\nException: %s\n", numberFormatException);
				System.out.println("Por favor, introduce números enteros");
			}
		} while ( continueLoop ); // end do...while
		}// end main
	
	//El método dividir no trata la excepción con lo que debe lanzarla (throws)
		public static int dividir( int numerator, int denominator )throws ArithmeticException {
		return numerator / denominator; // possible division by zero
		} // end method quotient


	};


