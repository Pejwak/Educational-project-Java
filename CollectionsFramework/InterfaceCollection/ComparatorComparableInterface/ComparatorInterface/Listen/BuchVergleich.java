package CollectionsFramework.InterfaceCollection.ComparatorComparableInterface.ComparatorInterface.Listen;

import java.util.Comparator;

public class BuchVergleich implements Comparator {
	public int compare(Object o1, Object o2) {
		/*
		 * Das übergebene Objekt wird in ein Objekt der Klasse java.lang.Object
		 * umgewandelt und muss somit wieder in ein Buch gecastet werden
		 */
		return (((Buch) o1).getAutor().compareTo(((Buch) o2).getAutor()));
	}
}