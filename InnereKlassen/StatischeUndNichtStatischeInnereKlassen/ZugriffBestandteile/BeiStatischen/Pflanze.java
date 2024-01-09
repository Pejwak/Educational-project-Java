package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffBestandteile.BeiStatischen;

public class Pflanze {
	static private String farbe = "grün";

	public static class Blatt {
		Blatt() {
			System.out.println(farbe);
		}
	}
}
