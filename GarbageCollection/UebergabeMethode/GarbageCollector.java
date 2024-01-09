package GarbageCollection.UebergabeMethode;

public class GarbageCollector {

	public static void main(String[] args) {
		String s1 = new String("eins");
		String s2 = new String("zwei");
		arbeite(s2);
		s2 = new String("drei");
	}

	private static void arbeite(String s2) {
		// Hier steht viel Code!
	}

}
