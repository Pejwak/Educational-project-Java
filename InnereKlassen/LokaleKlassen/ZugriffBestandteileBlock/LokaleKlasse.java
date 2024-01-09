package InnereKlassen.LokaleKlassen.ZugriffBestandteileBlock;

public class LokaleKlasse {
	
	void arbeite() {
		
		String groesse = "klein";
		final String farbe = "rot";
		
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