package TiradaMoneda;

public class TiradaMonedaCX {
	/**
	 * @param contadorCaras
	 * @param contadorCruces
	 * @param maxCaraDobleConse
	 * @param maxCruzDobleConse
	 */
	public static void imprime(int contadorCaras, int contadorCruces, int maxCaraDobleConse,
			int maxCruzDobleConse) {
		System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
		System.out.println("Maximo de caras dobles consecutivas: " + maxCaraDobleConse);
		System.out.println("Maximo de cruces dobles consecutivas: " + maxCruzDobleConse);
	}
}
