package InnereKlassen.AnonymeKlassen.Aufgabe12;

public class Anonyme {
	int i;

	void m() {
		int a;
		String b = "String";
		String c;
		Runnable r = new Runnable() {
			public void run() {
				System.out.println(i);
			}
		};
	}
}
