package InnereKlassen.LokaleKlassen.Aufgabe15;

public class LokaleAußen {
	static String a = "eins";

	static final String b = "zwei";

	String c = "drei";

	static void neu() {
		class Lokale {
			Lokale() {
				System.out.println(c);
			}
		}
	}
}