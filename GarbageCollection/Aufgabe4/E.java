package GarbageCollection.Aufgabe4;

public class E {

	private String s;

	public void hole(String s) {
		System.out.println(s);
	}

	protected void finalize() {
		System.out.println("zerstöre");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			E e1 = new E();
			e1.hole("hole");
			System.gc();
		}
	}

}
