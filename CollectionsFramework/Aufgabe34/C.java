package CollectionsFramework.Aufgabe34;

import java.util.*;

public class C {
	public static void main(String[] args) {
		LinkedList s = new LinkedList();
		String st = new String("eins");
		String st1 = new String("zwei");
		String st2 = new String("drei");
		s.add(st);
		s.add(st1);
		s.add(st2);
		Object o1 = s.get(1);
		System.out.println(o1);
	}
}