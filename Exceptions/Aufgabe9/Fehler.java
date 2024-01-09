package Exceptions.Aufgabe9;

public class Fehler {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			throw new RuntimeException();
		} finally {
			System.out.println("finally");
		}
	}
}
