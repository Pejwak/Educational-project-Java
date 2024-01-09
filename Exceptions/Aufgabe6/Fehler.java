package Exceptions.Aufgabe6;

public class Fehler {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[5] = 2;
		} catch (Exception fehler) {
			System.out.println("Fehler");
		}
	}

}
