package Kontrollstrukturen.Iterationen.ForSchleife.ForSchleifeMitMehrerenSchleifenvariablen;

public class ForSchleife {

	public static void main(String[] args) {
		for (int i = 0, j = 5; i < j; i++, j--) {
			System.out.println("Dies ist der Durchlauf von i: " + i);
			System.out.println("Dies ist der Durchlauf von j: " + j);
		}
	}

}
