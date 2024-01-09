package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe21;

public class AKlasse {
	private static String a;

	private final int b = 1;

	public class BKlasse {
		BKlasse() {
			System.out.println(b);
		}
	}
}