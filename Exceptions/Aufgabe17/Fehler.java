package Exceptions.Aufgabe17;

import java.io.FileNotFoundException;

public class Fehler {

	public static void main(String[] args) {
		try {
			Fehler fehler = new Fehler();
			fehler.ausnahme();
		} catch (ClassCastException fehler) {
			System.out.println("Ich fange!");
		}
	}

	public void ausnahme() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

}
