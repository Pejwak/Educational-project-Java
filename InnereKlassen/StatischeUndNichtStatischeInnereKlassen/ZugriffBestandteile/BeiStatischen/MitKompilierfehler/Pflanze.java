package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffBestandteile.BeiStatischen.MitKompilierfehler;

public class Pflanze {
	private String farbe = "gr�n";

	public static class Blatt {
		Blatt() {
			System.out.println(farbe);
		}
	}
}