package Exceptions.Aufgabe10;

public class Fehler {

	public static void main(String[] args) {
		try {
			throw new ClassCastException();
			System.out.println("werfen");
		} catch (ArithmeticException rechenfehler) {
			System.out.println("fangen");
		} catch (ClassCastException fehler) {
			System.out.println("nochmals fangen");
		} finally {
			System.out.println("Restarbeit");
		}
		System.out.println("Ende");
	}

}
