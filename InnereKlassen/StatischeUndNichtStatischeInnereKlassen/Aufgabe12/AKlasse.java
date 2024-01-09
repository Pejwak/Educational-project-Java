package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe12;

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
		BKlasse b = new BKlasse();
	}
}
