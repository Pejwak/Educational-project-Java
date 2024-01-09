package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe22;

public class AKlasse {
	private static String a;

	private final int b = 1;

	public static class BKlasse {
		BKlasse() {
			System.out.println(b);
		}
	}
}
