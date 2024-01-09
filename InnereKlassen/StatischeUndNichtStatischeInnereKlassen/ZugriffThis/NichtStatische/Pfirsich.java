package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffThis.NichtStatische;

public class Pfirsich {
	private String farbe = "rosa";

	public class Kern {
		private String farbe = "grau";

		Kern() {
			System.out.println("Farbe des Pfirsichs: " + Pfirsich.this.farbe);
			System.out.println("Farbe des Kerns: " + this.farbe);
			System.out.println("Farbe des Kerns: " + farbe);
		}
	}

	public static void main(String args[]) {
		Pfirsich.Kern pfirsichKern = new Pfirsich().new Kern();
	}
}
