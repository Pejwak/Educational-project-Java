package InnereKlassen.AnonymeKlassen.Aufgabe11;

public class Anonyme {
	int i;

	static void m() {
		int a;
		final String b = "String";
		String c;
		Runnable r = new Runnable() {
			public void run() {
				System.out.println(i);
			}
		};
	}
}
