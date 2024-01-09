package CollectionsFramework.InterfaceCollection.ComparatorComparableInterface.ComparableInterface.TreeSetTreeMap;

import java.util.TreeSet;

public class TreeSetSortieren {
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		Buch st = new Buch("delta");
		Buch st1 = new Buch("aber");
		Buch st2 = new Buch("beta");
		s.add(st);
		s.add(st1);
		s.add(st2);
		for (Object r : s) {
			System.out.println(((Buch) r).getAutor());
		}
	}
}
