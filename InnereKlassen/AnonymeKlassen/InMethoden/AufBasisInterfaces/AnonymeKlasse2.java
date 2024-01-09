package InnereKlassen.AnonymeKlassen.InMethoden.AufBasisInterfaces;

public class AnonymeKlasse2 {

	void arbeite() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Ich laufe!");
			}
		}; // Achtung! Strichpunkt nicht vergessen!
	}

}
