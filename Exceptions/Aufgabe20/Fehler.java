package Exceptions.Aufgabe20;

import java.io.FileNotFoundException;

public class Fehler {

	public static void main(String[ ] args) {
		FileNotFoundException fehler = new FileNotFoundException();
		Throwable throwable = new Throwable();
		boolean a = throwable instanceof FileNotFoundException;
		boolean b = fehler instanceof Throwable;
		System.out.println(a);
		System.out.println(b);
		}

}
