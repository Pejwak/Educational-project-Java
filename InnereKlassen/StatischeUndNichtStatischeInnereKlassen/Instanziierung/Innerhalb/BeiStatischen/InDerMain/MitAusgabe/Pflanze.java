package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiStatischen.InDerMain.MitAusgabe;

public class Pflanze {
	Pflanze() {
		System.out.println("Pflanze");
	}

	public static class Blatt {
		Blatt() {
			System.out.println("Blatt");
		}
	}

	public static void main(String[] args) {
		Pflanze pflanze = new Pflanze();
		Blatt blatt = new Blatt();
		Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();
	}
}
