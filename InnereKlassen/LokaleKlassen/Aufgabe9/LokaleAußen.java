package InnereKlassen.LokaleKlassen.Aufgabe9;

public class LokaleAußen {
	static void neu() {
		String s1 = "blau";
		final String s2 = "lila";
		String s = "gelb";
		class Lokale {
			Lokale() {
				System.out.println(s2);
			}
		}
	}
}
