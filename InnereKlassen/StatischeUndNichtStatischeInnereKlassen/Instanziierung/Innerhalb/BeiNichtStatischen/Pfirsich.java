package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Instanziierung.Innerhalb.BeiNichtStatischen;

public class Pfirsich {
	// Instanziierung einer inneren Klasse innerhalb einer
	// �u�eren Klasse
	Kern kern = new Kern();

	Pfirsich.Kern pfirsichKern = new Pfirsich().new Kern();

	public class Kern {
	}
}