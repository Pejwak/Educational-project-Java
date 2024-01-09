package InnereKlassen.LokaleKlassen.ZugriffBestandteileAeussereKlasse.InnerhalbStatischerBlock.Kompilierfehler;

public class LokaleKlasse {
	String groesse = "klein";

	static void arbeite() {
		class InnereLokale {
			InnereLokale() {
				System.out.println(groesse);
			}
		}
		InnereLokale innereLokale = new InnereLokale();
	}

	public static void main(String args[]) {
		// statischer Zugriff auf eine statische Methode
		LokaleKlasse.arbeite();
	}
}

