package TiradaMoneda;

public class TiradaMonedaCX {

	/**
	 * El m�todo imprime se encarga de imprimir en pantalla los datos que se le pasan como par�metros.
	 * Estos datos son los resultados de los c�lculos del m�todo extraer.
	 * @param contadorCaras, acumulador del n�mero total de caras simples obtenidas ya sean consecutivas o no consecutivas.
	 * @param contadorCruces, acumulador del n�mero total de cruces simples obtenidas ya sean consecutivas o no consecutivas.
	 * @param maxCaraDobleConse, acumulador del n�mero total de caras dobles obtenidas consecutivas (racha).
	 * @param maxCruzDobleConse , acumulador del n�mero total de cruces dobles obtenidas consecutivas (racha).
	 */
	public static void imprime(int contadorCaras, int contadorCruces, int maxCaraDobleConse,
			int maxCruzDobleConse) {
		System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
		System.out.println("Maximo de caras dobles consecutivas: " + maxCaraDobleConse);
		System.out.println("Maximo de cruces dobles consecutivas: " + maxCruzDobleConse);
	}
}
