package CollectionsFramework.InterfaceCollection.InterfaceList.LinkedList.ZugriffEinzelnesElement;

import java.util.LinkedList;

public class CollectionList {

	public static void main(String[] args) {
		LinkedList s = new LinkedList();
		String st = new String("delta");
		String st1 = new String("aber");
		String st2 = new String("beta");
		s.add(st);
		s.add(st1);
		s.add(st2);
		Object o = s.get(1);
		System.out.println(o);
	}
}
