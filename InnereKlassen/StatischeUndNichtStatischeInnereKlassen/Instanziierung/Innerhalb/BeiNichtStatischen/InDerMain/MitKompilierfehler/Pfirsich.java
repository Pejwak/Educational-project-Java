package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiNichtStatischen.InDerMain.MitKompilierfehler;

public class Pfirsich {
	public class Kern {
	}

	public static void main(String args[]) {
		Kern kern = new Kern(); // Kompilierfehler
		Pfirsich.Kern pfirsichKern = new Pfirsich().new Kern();
	}
}
