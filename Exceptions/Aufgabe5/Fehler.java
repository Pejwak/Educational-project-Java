package Exceptions.Aufgabe5;

public class Fehler {

	public static void main(String[] args) {
		try {
			throw new ClassCastException();
		} catch (ClassCastException fehler) {
			System.out.println("Fehler");
			throw new ArithmeticException();
		} catch (ArithmeticException rechenfehler) {
			System.out.println("Rechenfehler");
		} finally {
			System.out.println("finally");
		}
		System.out.println("Ende");
	}

}
