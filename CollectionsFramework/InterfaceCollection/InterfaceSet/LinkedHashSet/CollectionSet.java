package CollectionsFramework.InterfaceCollection.InterfaceSet.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class CollectionSet {
	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		String st = new String("Hallo");
		String st1 = new String("Bye");
		String st2 = new String("Auf Wiedersehen");
		String st3 = new String("Goodbye");
		s.add(st);
		s.add(st1);
		s.add(st2);
		s.add(st3);
		for (Iterator i = s.iterator(); i.hasNext();) {
			Object o = i.next();
			System.out.println(o);
		}
	}
}
