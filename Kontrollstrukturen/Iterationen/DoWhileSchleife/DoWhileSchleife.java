package Kontrollstrukturen.Iterationen.DoWhileSchleife;

public class DoWhileSchleife {

	public static void main(String[] args) {
		// Einstiegspunkt
		int i = 0;
		do {
			// Ausgabe
			System.out.println("Dies ist der Durchlauf Nr. " + i);
			// Erh�hen von i um 1 bei jedem Durchlauf
			i++;
			// Bedingung f�r den Ausstiegspunkt
		} while (i < 5);
	}

}
