package tablaTomas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Random;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.setOut(new PrintStream(new FileOutputStream("residencia.txt")));

		boolean primerPrint = true;
		boolean usoId = true;
		int dias = 714, maxIdMeds = 300, minIdMeds = 1, maxCantMeds = 5, minCantMeds = 0, numMeds = 0, idMed = 0;
		String dni, momento, aux, aux2;
		
		int duracionNumMeds = 0;
		
		LocalDate fechaInicio = LocalDate.of(2020, 1, 17);
		LocalDate fecha;
		Gestion g = new Gestion ();
		
		
		String [] listaDni = {"30264227J", "24495377Y", "47972091R", "19775410Y", 
				"86930737E", "11219791H", "70410442W", "90751538X", "54865763C", "79492924W", 
				"37598391Q", "77122141T", "13212433D", "18107438W", "40399088K", "20053175U",
				"86111663A", "04748091L", "81180832N", "06275035S", "38768237Z", "85365974Y", 
				"76037515I", "56482490U", "24356685V", "37308803E", "17957461A", "44885359F", 
				"55003510P", "27790087F", "95183533K", "69018134V", "89516067D", "23263239M",
				"05843866Y", "02566473H", "89208464C", "28200659U", "77670389N", "73306246K",
				"03890386Z", "98636192C", "62057010D", "86628976I", "08002201X"};
		
		Dni dnis = new Dni (listaDni);
		aux2 = "tuvieja";
		String [] listaMomentos = {"Desayuno", "Almuerzo", "Merienda", "Cena"};
		
		Momento momentos = new Momento (listaMomentos);
		
		fecha = fechaInicio;
		
		
		
		for (int i = 0; i < dnis.getDnis().length; i++) {
			dni = dnis.getDnis() [i];
			for (int j = 0; j < listaMomentos.length; j++) {
				momento = listaMomentos [j];
				numMeds = g.generarAleatorio(maxCantMeds, minCantMeds);
				System.out.println("INSERT INTO hoja_tratamiento (dni_residente, cantmedicamento, momento) "
						+ "VALUES ('" +listaDni[i]+ "', " +numMeds+ ", '" +listaMomentos[j]+ "');");
				for (int j2 = 0; j2 < dias; j2++) {
					int [] numeroMed = new int [numMeds];
					for (int k = 0; k < numMeds; k++) {
						idMed = g.generarAleatorio(maxIdMeds, minIdMeds);
						aux = listaDni [i] + listaMomentos [j] + fecha.toString() + String.valueOf(idMed);
						if (primerPrint) {
							System.out.println("INSERT INTO tomas (dni_residente, momento, fecha, id_medicamento) "
									+ "VALUES ('" +listaDni[i]+ "', '" +listaMomentos[j]+ "', '" + fecha.toString() + "', " + idMed + ");");
							numeroMed [k] = idMed;
							aux2 = listaDni [i] + listaMomentos [j] + fecha.toString() + String.valueOf(idMed);
							primerPrint = false;
						}else if (!aux.equalsIgnoreCase(aux2)) {
							System.out.println("INSERT INTO tomas (dni_residente, momento, fecha, id_medicamento) "
									+ "VALUES ('" +listaDni[i]+ "', '" +listaMomentos[j]+ "', '" + fecha.toString() + "', " + idMed + ");");
							numeroMed [k] = idMed;
							aux2 = listaDni [i] + listaMomentos [j] + fecha.toString() + String.valueOf(idMed);
							
						}else {
							idMed = g.noReutilizar(numeroMed, idMed);
							System.out.println("INSERT INTO tomas (dni_residente, momento, fecha, id_medicamento) "
									+ "VALUES ('" +listaDni[i]+ "', '" +listaMomentos[j]+ "', '" + fecha.toString() + "', " + idMed + ");");
							numeroMed [k] = idMed;
							aux2 = listaDni [i] + listaMomentos [j] + fecha.toString() + String.valueOf(idMed);
						}

							
						
					}
					fecha = fecha.plusDays(1);
				}
			fecha = fechaInicio;
			}		
		}


/*
		for (int l = 0; l < dias; l++) {
			
			for (int i = 0; i < dnis.getDnis().length; i++) {
				dni = dnis.getDnis() [i];
				for (int j = 0; j < listaMomentos.length; j++) {
					numMeds = g.generarAleatorio(maxCantMeds, minCantMeds);
					//if () {
						System.out.println("INSERT INTO hoja_tratamiento (dni_residente, cantmedicamento, momento) "
							+ "VALUES ('" +listaDni[i]+ "', " +numMeds+ ", '" +listaMomentos[j]+ "');");
						// aux = listaDni[i] + listaMomentos [j];
						// primerPrint = false;
					//}
					for (int k = 0; k < numMeds; k++) {
						idMed = g.generarAleatorio(maxIdMeds, minIdMeds);	
						System.out.println("INSERT INTO tomas (dni_residente, momento, fecha, id_medicamento) "
								+ "VALUES ('" +listaDni[i]+ "', '" +listaMomentos[j]+ "', '" + fecha.toString() + "', " + idMed + ");");
					}
				}
				
			}
			fecha = fecha.plusDays(1);
		}
*/		
		
		

	}

}
