package CollectionsFramework.Aufgabe2;

import java.util.*;

public class Collections {
	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		System.out.println(l instanceof Collection);
		System.out.println(l instanceof Map);
		System.out.println(l instanceof Object);
	}
}