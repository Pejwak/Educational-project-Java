package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe11;

public class AKlasse {
	AKlasse() {
		System.out.println("A");
	}

	public static class BKlasse {
		BKlasse() {
			System.out.println("B");
		}
	}

	public static void main(String args[]) {
		AKlasse a = new AKlasse();
	}
}
