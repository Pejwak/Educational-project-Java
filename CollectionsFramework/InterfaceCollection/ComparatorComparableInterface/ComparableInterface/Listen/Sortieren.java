package CollectionsFramework.InterfaceCollection.ComparatorComparableInterface.ComparableInterface.Listen;

import java.util.ArrayList;
import java.util.Collections;

public class Sortieren {
	public static void main(String[] args) {
		ArrayList s = new ArrayList();
		Buch st = new Buch("delta");
		Buch st1 = new Buch("aber");
		Buch st2 = new Buch("beta");
		s.add(st);
		s.add(st1);
		s.add(st2);
		Collections.sort(s);
		for (Object r : s) {
			System.out.println(((Buch) r).getAutor());
		}
	}
}
