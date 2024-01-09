package InnereKlassen.AnonymeKlassen.AufBasisKlassen;

public class Haus {

	Zimmer z = new Zimmer() {
		public void wohne() {
			System.out.println("Ich wohne in einem Haus");
		}
	}; // Achtung! Strichpunkt nicht vergessen!
}
