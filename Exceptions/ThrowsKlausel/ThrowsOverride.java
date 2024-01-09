package Exceptions.ThrowsKlausel;

public class ThrowsOverride extends ThrowsKlausel {

	public static void main(String[] args) {
		try {
			ThrowsOverride neueAusnahme = new ThrowsOverride();
			neueAusnahme.ausnahme();
		} catch (Exception rechenfehler) {
			System.out.println("Ich fange!");
		}
	}

	public void ausnahme() throws ArithmeticException {
		throw new ArithmeticException();
	}

}
