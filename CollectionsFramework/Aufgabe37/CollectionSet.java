package CollectionsFramework.Aufgabe37;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionSet {
	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		String st = new String("eins");
		String st1 = new String("zwei");
		String st2 = new String("drei");
		s.add(st);
		s.add(st1);
		s.add(st2);
		for (Iterator i = s.iterator(); i.hasNext();) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
