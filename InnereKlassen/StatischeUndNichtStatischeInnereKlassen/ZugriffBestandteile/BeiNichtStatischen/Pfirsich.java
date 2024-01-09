package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.ZugriffBestandteile.BeiNichtStatischen;

public class Pfirsich {
	static private String farbe = "rosa";

	private String groesse = "klein";

	public class Kern {
		Kern() {
			System.out.println(groesse);
			System.out.println(farbe);
		}
	}
}
