package Kontrollstrukturen.Selektionen.SwitchStruktur;

public class SwitchStruktur {

	public static void main(String[] args) {
		// x darf aus folgenden Datentypen bestehen: char, byte, short oder int
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("Ich bin Fall 1");
			break;
		case 2:
			System.out.println("Ich	bin Fall 2");
			break;
		default:
			System.out.println("Ich bin der Standardfall");
		}
	}

}
