package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiStatischen;

public class Pflanze {
	// Instanziierung einer statischen inneren Klasse innerhalb einer
	// ‰uﬂeren Klasse
	Blatt blatt = new Blatt();

	Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();

	public static class Blatt {
	}
}
