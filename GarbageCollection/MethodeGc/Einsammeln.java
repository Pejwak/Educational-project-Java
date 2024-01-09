package GarbageCollection.MethodeGc;

public class Einsammeln {

	private String s;

	public void arbeite(String s) {
		System.out.println(s);
	}

	protected void finalize() {
		System.out.println("finalize");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Einsammeln e1 = new Einsammeln();
			e1.arbeite("ja");
			System.gc();
		}
	}

}
