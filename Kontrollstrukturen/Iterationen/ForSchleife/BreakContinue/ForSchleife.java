package Kontrollstrukturen.Iterationen.ForSchleife.BreakContinue;

public class ForSchleife {
	public static void main(String[] args) {
		oben: for (int i = 0; i < 5; i++) {
			switch (i) {
			case 1:
				System.out.println("Ich bin Fall 1");
				continue oben;
			case 2:
				System.out.println("Ich bin Fall 2");
				break oben;
			default:
				System.out.println("Standard");
			}
		}
	}
}
