package CollectionsFramework.InterfaceCollection.InterfaceSet.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		String st = new String("Hallo");
		String st1 = new String("Bye");
		String st2 = new String("Auf Wiedersehen");
		String st3 = new String("Goodbye");
		// Elemente werden hinzugegefügt
		s.add(st);
		s.add(st1);
		s.add(st2);
		s.add(st3);
		// Elemente werden wieder ausgegeben
		for (Iterator i = s.iterator(); i.hasNext();) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}