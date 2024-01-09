package Kontrollstrukturen.Iterationen.ForSchleife.Aufgabe5;

public class SwitchStruktur {

	public static void main(String[] args) {
		int j = 1;
		for (; j < 2; j++) {
			switch (j) {
			case 1:
				System.out.println("1");
				break;
			default:
				System.out.println("Standard");
			case 2:
				System.out.println("2");
				break;
			}
		}
	}

}
