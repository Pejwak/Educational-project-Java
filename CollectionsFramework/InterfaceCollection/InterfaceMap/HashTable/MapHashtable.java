package CollectionsFramework.InterfaceCollection.InterfaceMap.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapHashtable {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "2";
		String w1 = "hallo";
		String w2 = "bye";
		Hashtable h = new Hashtable();
		h.put(s1, w1);
		h.put(s2, w2);
		for (Enumeration en = h.keys(); en.hasMoreElements();) {
			Object o = en.nextElement();
			System.out.println("Schlüssel: " + o);
			System.out.println("Wert: " + h.get(o));
		}
	}
}
