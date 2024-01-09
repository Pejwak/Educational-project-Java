package Exceptions.FinallyBlock;

public class Rechenfehler {

	public static void main(String[] args) {
		try {
			int i = 0;
			System.out.println(5 / i);
		} catch (ArithmeticException rechenFehler) {
			System.out.println("Dies ist eine ArithmeticException");
		} finally {
			System.out.println("Ich werde auf jeden Fall ausgeführt");
		}
	}

}
