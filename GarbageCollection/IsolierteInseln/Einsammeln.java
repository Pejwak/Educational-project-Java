package GarbageCollection.IsolierteInseln;

public class Einsammeln {

	Einsammeln e;

	public static void main(String[] args) {
		Einsammeln e1 = new Einsammeln();
		Einsammeln e2 = new Einsammeln();
		e1.e = e2;
		e2.e = e1;
		e1 = null;
		e2 = null;
	}
}
