package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffBestandteile.BeiStatischen;

public class Pflanze {
	static private String farbe = "gr�n";

	public static class Blatt {
		Blatt() {
			System.out.println(farbe);
		}
	}
}
