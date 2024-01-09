package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe24;

public class AKlasse {
	private String a = "a";

	public class BKlasse {
		private String a = "b";

		BKlasse() {
			System.out.println(this.a);
		}
	}

	public static void main(String args[]) {
		AKlasse.BKlasse ab = new AKlasse().new BKlasse();
	}
}