package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiStatischen;

public class Pflanze {
	// Instanziierung einer statischen inneren Klasse innerhalb einer
	// �u�eren Klasse
	Blatt blatt = new Blatt();

	Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();

	public static class Blatt {
	}
}
