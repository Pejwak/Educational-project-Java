package InnereKlassen.LokaleKlassen.Aufgabe13;

public class LokaleAuﬂen {
	String s1 = "lila";

	final String s2 = "blau";

	String s = "gelb";

	static void neu() {
		class Lokale {
			Lokale() {
				System.out.println(s2);
			}
		}
	}
}
