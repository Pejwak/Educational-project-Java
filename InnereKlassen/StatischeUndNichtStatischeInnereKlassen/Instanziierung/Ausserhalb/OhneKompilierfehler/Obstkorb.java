package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Ausserhalb.OhneKompilierfehler;

public class Obstkorb {
	public static void main(String[ ] args) {

	Pfirsich.Kern pfirsichKern = new Pfirsich().new Kern();

	Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();
	}
}
