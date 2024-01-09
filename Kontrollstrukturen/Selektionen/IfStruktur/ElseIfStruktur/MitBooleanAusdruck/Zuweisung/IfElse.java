package Kontrollstrukturen.Selektionen.IfStruktur.ElseIfStruktur.MitBooleanAusdruck.Zuweisung;

public class IfElse {

	public static void main(String[] args) {
		boolean b;
		
		if (b = true) {
			System.out.println("eins");
		} else if (b = true) {
			System.out.println("zwei");
		} else if (!b) {
			System.out.println("drei");
		}
	}

}
