package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe9;

public class AKlasse {
	AKlasse(){
	System.out.println("A");
	}
	public class BKlasse{
	BKlasse(){
	System.out.println("B");
	}
	}
	public static void main(String args[ ]){
	BKlasse b = new BKlasse();
	}
	}
