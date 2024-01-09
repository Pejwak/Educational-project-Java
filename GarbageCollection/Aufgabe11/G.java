package GarbageCollection.Aufgabe11;

public class G {

	public static void main(String[ ] args) {
		String s1 = new String("ich");
		String s2 = new String("bin");
		String s3 = new String("ein");
		String s4 = new String("Genie!");
		s2 = s1;
		s3 = s2;
		s4 = s2;
		}

}
