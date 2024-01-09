package InnereKlassen.AnonymeKlassen.Aufgabe10;

public class Anonyme {
	int i;

	static void m() {
		int a;
		final String b = "String";
		Runnable r = new Runnable() {
			String c;

			public void run() {
				System.out.println(c);
			}
		};
	}

}
