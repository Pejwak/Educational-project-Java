package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiNichtStatischen.InDerMain.OhneKompilierfehler;

public class Pfirsich {
	Pfirsich() {
		System.out.println("Pfirsich");
	}

	public class Kern {
		Kern() {
			System.out.println("Kern");
		}
	}

	public static void main(String args[]) {
		Pfirsich.Kern pfirsichKern = new Pfirsich().new Kern();
	}
}