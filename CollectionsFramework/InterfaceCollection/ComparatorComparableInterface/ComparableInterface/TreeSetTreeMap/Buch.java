package CollectionsFramework.InterfaceCollection.ComparatorComparableInterface.ComparableInterface.TreeSetTreeMap;

public class Buch implements Comparable {
	String autor;

	public Buch(String a) {
		setAutor(a);
	}

	// Dieser Methode muss als Parameter ein Objekt übergeben werden
	public int compareTo(Object o) {

		/*
		 * Das übergebene Objekt wird in ein Objekt der Klasse java.lang.Object
		 * umgewandelt und muss somit wieder in ein Buch gecastet werden
		 */
		return autor.compareTo(((Buch) o).getAutor());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}