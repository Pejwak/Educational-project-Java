package InnereKlassen.LokaleKlassen.Aufgabe10;

public class LokaleAußen {
	void neu() {
		String s1 = "blau";
		String s2 = "rot";
		String s = "gelb";
		class Lokale {
			Lokale() {
				System.out.println(s2);
			}
		}
	}
}
