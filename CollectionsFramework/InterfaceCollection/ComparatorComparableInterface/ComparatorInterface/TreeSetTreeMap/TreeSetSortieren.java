package CollectionsFramework.InterfaceCollection.ComparatorComparableInterface.ComparatorInterface.TreeSetTreeMap;

import java.util.TreeSet;

public class TreeSetSortieren{
	public static void main(String[ ] args) {
	BuchVergleich b = new BuchVergleich();
	TreeSet s = new TreeSet(b);
	Buch st = new Buch("delta");
	Buch st1 = new Buch("aber");
	Buch st2 = new Buch("beta");
	s.add(st);
	s.add(st1);
	s.add(st2);
	for (Object r:s){
	System.out.println(((Buch)r).getAutor());
	}
	}
	}
