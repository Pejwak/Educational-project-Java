package Kontrollstrukturen.Iterationen.ForSchleife.Aufgabe3;

public class SwitchStruktur {

	public static void main(String[] args) {
		for (long j = 1; j < 2; j++) {
			switch (j) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("Standard");
			}
		}
	}

}
