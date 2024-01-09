package CollectionsFramework.Aufgabe1;

import java.util.*;

public class Collections {
	public static void main(String[] args) {
		LinkedHashMap l = new LinkedHashMap();
		Auto auto = new Auto();
		System.out.println(l instanceof Auto);
		System.out.println(l instanceof Map);
		System.out.println(l instanceof Object);
	}
}
