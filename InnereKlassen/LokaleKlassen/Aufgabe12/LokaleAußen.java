package InnereKlassen.LokaleKlassen.Aufgabe12;

public class LokaleAußen {
	static String s1 = "lila";

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
