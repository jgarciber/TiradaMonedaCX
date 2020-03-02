package TiradaMoneda;

public class TiradaMonedaCX {

	/**
	 * El método imprime se encarga de imprimir en pantalla los datos que se le pasan como parámetros.
	 * Estos datos son los resultados de los cálculos del método extraer.
	 * @param contadorCaras, acumulador del número total de caras simples obtenidas ya sean consecutivas o no consecutivas.
	 * @param contadorCruces, acumulador del número total de cruces simples obtenidas ya sean consecutivas o no consecutivas.
	 * @param maxCaraDobleConse, acumulador del número total de caras dobles obtenidas consecutivas (racha).
	 * @param maxCruzDobleConse , acumulador del número total de cruces dobles obtenidas consecutivas (racha).
	 */
	public static void imprime(int contadorCaras, int contadorCruces, int maxCaraDobleConse,
			int maxCruzDobleConse) {
		System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
		System.out.println("Maximo de caras dobles consecutivas: " + maxCaraDobleConse);
		System.out.println("Maximo de cruces dobles consecutivas: " + maxCruzDobleConse);
	}
}
