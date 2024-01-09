package Exceptions.ThrowsKlausel;

import java.io.FileNotFoundException;

public class ThrowsKlausel {
	public static void main(String[] args) {
		try {
			ThrowsKlausel neueAusnahme = new ThrowsKlausel();
			neueAusnahme.ausnahme();
		} catch (Exception fehler) {
			System.out.println("Ich fange!");
		}
	}

	public void ausnahme() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}
