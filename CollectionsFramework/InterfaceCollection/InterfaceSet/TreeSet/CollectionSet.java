package CollectionsFramework.InterfaceCollection.InterfaceSet.TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class CollectionSet {
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
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