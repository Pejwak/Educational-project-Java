package InnereKlassen.LokaleKlassen.Aufgabe8;

public class LokaleAuﬂen {
	void neu() {
		String s1 = "blau";
		final String s2 = "rot";
		String s = "gelb";
		class Lokale {
			Lokale() {
				System.out.println(s2);
			}
		}
	}
}
