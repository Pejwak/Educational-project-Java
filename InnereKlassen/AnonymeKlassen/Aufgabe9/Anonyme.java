package InnereKlassen.AnonymeKlassen.Aufgabe9;

public class Anonyme {

	int i;

	void m() {
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
