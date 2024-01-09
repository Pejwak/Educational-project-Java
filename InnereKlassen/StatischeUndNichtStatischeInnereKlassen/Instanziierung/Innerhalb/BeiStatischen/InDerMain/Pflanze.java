package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiStatischen.InDerMain;

public class Pflanze {
	public static class Blatt {
	}

	public static void main(String[] args) {
		Blatt blatt = new Blatt();
		Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();
	}
}
