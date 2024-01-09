package Exceptions.TryCatchBlock;

public class Rechenfehler {

	public static void main(String[] args) {
		// Versuch eine Berechnung durchzuführen
		try {
			int i = 0;
			System.out.println(5 / i);
			// Auffangen des Fehlers durch Ausgabe einer Fehlermeldung
		} catch (ArithmeticException rechenFehler) {
			System.out.println("Dies ist eine ArithmeticException");
		}
	}

}
