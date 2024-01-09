package InnereKlassen.AnonymeKlassen.InMethoden.AufBasisInterfaces;

public class AnonymeKlasse1 {
	void arbeite() {
		new Runnable() {
			public void run() {
				System.out.println("Ich laufe!");
			}
		}; // Achtung! Strichpunkt nicht vergessen!
	}

}
