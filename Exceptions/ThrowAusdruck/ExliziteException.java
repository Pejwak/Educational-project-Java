package Exceptions.ThrowAusdruck;

public class ExliziteException {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException rechenfehler) {
			System.out.println("Ich bin ein expliziter Rechenfehler!");
		}
	}
}
