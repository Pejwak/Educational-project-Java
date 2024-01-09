package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe1;

public class AKlasse {
	
	BKlasse b = new BKlasse();
	AKlasse.BKlasse c = new AKlasse().new BKlasse();
	
	public class BKlasse{
	}
	}
