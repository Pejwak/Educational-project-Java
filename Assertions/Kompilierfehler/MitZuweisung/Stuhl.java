package Assertions.Kompilierfehler.MitZuweisung;

public class Stuhl {

	double preis;

	public static void main(String[] args) {
		Stuhl stuhl = new Stuhl();
		stuhl.stehen(-8.0);
	}

	private void stehen(double preis) {
		System.out.println("Ich bin ein Stuhl!");
		assert preis = 0.0;
	}
}
