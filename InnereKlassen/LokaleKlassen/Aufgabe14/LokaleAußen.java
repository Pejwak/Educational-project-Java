package InnereKlassen.LokaleKlassen.Aufgabe14;

public class LokaleAu�en {
	static String a = "eins";

	static final String b = "zwei";

	String c = "drei";

	void neu() {
		class Lokale {
			Lokale() {
				System.out.println(c);
			}
		}
	}
}