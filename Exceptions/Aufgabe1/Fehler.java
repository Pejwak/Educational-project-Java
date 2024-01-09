package Exceptions.Aufgabe1;

public class Fehler {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException rechenfehler) {
			System.out.println("Rechenfehler");
		} catch (Exception fehler) {
			System.out.println("Fehler");
		} finally {
			System.out.println("finally");
		}
		System.out.println("Ende");
	}

}
