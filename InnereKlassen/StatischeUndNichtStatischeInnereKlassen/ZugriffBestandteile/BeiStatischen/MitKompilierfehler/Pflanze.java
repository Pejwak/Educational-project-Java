package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffBestandteile.BeiStatischen.MitKompilierfehler;

public class Pflanze {
	private String farbe = "grün";

	public static class Blatt {
		Blatt() {
			System.out.println(farbe);
		}
	}
}