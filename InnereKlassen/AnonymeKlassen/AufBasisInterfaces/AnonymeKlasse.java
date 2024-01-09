package InnereKlassen.AnonymeKlassen.AufBasisInterfaces;

class AnonymeKlasse {
	Runnable ru = new Runnable() {
		public void run() {
			System.out.println("Ich laufe!");
		}
	}; // Achtung! Strichpunkt nicht vergessen!
}
