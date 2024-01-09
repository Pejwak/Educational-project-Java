package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe8;

public class AKlasse {
	AKlasse() {
		System.out.println("A");
	}

	public class BKlasse {
		BKlasse() {
			System.out.println("B");
		}
	}

	public static void main(String args[]) {
		AKlasse a = new AKlasse();
	}
}
