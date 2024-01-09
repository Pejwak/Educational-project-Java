package GarbageCollection.Aufgabe13;

public class E {

	E e;

	public static void main(String[] args) {
		E e1 = new E();
		E e2 = new E();
		E e3 = new E();
		E e4 = new E();
		e1.e = e2;
		e2.e = e1;
		e3 = null;
		e4 = null;
	}

}
