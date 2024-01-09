package InnereKlassen.LokaleKlassen.ZugriffBestandteileAeussereKlasse.InnerhalbNichtStatischerBlock;

public class LokaleKlasse {
	static String groesse = "klein";

	String farbe = "rot";

	void arbeite() {
		class InnereLokale {
			InnereLokale() {
				System.out.println(groesse);
				System.out.println(farbe);
			}
		}
		InnereLokale innereLokale = new InnereLokale();
	}

	public static void main(String args[]) {
		LokaleKlasse lokaleKlasse = new LokaleKlasse();
		lokaleKlasse.arbeite();
	}
}