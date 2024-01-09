package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe3;

public class AKlasse {
	public class BKlasse{
	}
	public static void main(String args[ ]){
		AKlasse.BKlasse b = new AKlasse().new BKlasse();
	}
}
