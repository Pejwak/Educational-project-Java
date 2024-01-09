package Kontrollstrukturen.Selektionen.SwitchStruktur;

public class SwitchStruktur1 {

	public static void main(String[] args) {
		// x darf aus folgenden Datentypen bestehen: char, byte, short oder int
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("Ich bin Fall 1");
			
		case 2:
			System.out.println("Ich	bin Fall 2");
		
		default:
			System.out.println("Ich bin der Standardfall");
		}
	}

}
