package InnereKlassen.LokaleKlassen.Aufgabe11;

public class LokaleAu�en {
	static String s1 = "lila";

	final String s2 = "blau";

	String s = "gelb";

	void neu() {
		class Lokale {
			Lokale() {
				System.out.println(s2);
			}
		}
	}
}