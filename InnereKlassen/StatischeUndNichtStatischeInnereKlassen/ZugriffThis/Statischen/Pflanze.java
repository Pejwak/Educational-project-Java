package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffThis.Statischen;

public class Pflanze {
	static private String farbe = "grün";

	public static class Blatt {
		static private String farbe = "dunkelgrün";

		Blatt() {
			System.out.println("Farbe der Pflanze: " + Pflanze.farbe);
			System.out.println("Farbe des Blatts: " + this.farbe);
			System.out.println("Farbe des Blatts: " + farbe);
		}
	}
	public static void main(String[ ] args) {
		Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();
		}
}