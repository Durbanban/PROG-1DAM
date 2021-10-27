package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1
		double longitudTibia = 38.5, alturaIni = 0.0, años = 33.0, tasaDec = 0.06, //JAMAS SE PONEN EÑES EN LA DECLARACIÓN DE VARIABLES.
				alturaFin = 0.0, factorAltura = 0.0, edadMuerte = 63.0, convMujer1 = 61.412, convMujer2 = 2.317; //LAS EDADES Y LAS UNIDADES NO SON DOUBLE, SON INT.
		System.out.println("\t\t\t\t\tBienvenido al programa\n\t\t\t\t\tCálculo de altura forense\n");
		System.out.println("************************************************************************"
				+ "**********************************");
		System.out.println("Longitud Tibia\t\t\t\tEdad fallecimiento\t\t\tAltura fallecimiento");
		
		alturaIni = convMujer1 + convMujer2 * longitudTibia;		
		factorAltura = años * tasaDec;
		alturaFin = alturaIni - factorAltura;
		System.out.printf("%.2f cm\t\t\t\t%.0f años\t\t\t\t\t%.2f cm\n\n", longitudTibia, edadMuerte, alturaFin);
		System.out.println("*********************************************************************"
				+ "*************************************\n");
		System.out.println("\t\t\t\t\tGracias por usar el programa");
		//No recuerdo cómo es un ticket de altura de farmacia, así que he realizado un ticket ya practicado en clase.
	}

}
