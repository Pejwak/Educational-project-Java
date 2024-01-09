package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Ausserhalb.Kompilierfehler;

public class Obstkorb {
	public static void main(String[ ] args) {
//	Instanziierung einer nicht-statischen inneren Klasse
	Kern kern = new Kern(); //Kompilierfehler
	Pfirsich.Kern pfirsichKern = new Pfirsich().new Kern();
//	Instanziierung einer statischen inneren Klasse
	Blatt blatt = new Blatt(); //Kompilierfehler
	Pflanze.Blatt pflanzeBlatt = new Pflanze.Blatt();
	}
	}
