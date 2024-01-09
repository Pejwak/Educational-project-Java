package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe2;

public class AKlasse {
	
	BKlasse b = new BKlasse();
	AKlasse.BKlasse c = new AKlasse.BKlasse();
	
	public static class BKlasse{
	}
}