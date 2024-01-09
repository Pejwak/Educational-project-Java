package Assertions.Aufgabe17;

public class A {

	int x;

	public static void main(String[] args) {
		A a = new A();
		a.mc(0);
	}

	public void mb() {
		System.out.println("Ich bin ein Fehler");
	}

	private void mc(int x) {
		System.out.println("Ich bin Methode mc");
		assert x = 0;
	}

}
