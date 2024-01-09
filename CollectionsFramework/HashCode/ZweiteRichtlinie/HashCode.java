package CollectionsFramework.HashCode.ZweiteRichtlinie;

public class HashCode {
	public static void main(String[] args) {
		String s = new String("eins");
		String s1 = new String("eins");
		boolean b1 = s.equals(s1);
		boolean b2 = s.hashCode() == s1.hashCode();
		System.out.println(b1);
		System.out.println(b2);
	}
}
