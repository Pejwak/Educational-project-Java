package Exceptions.ThrowAusdruck.ZusaetzlicherCode;

public class ExpliziteException {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException rechenfehler) {
			System.out.println("A ");
                        //throw new RuntimeException();
		} catch (RuntimeException fehler) {
			System.out.println("B ");
		} finally {
			System.out.println("C ");
		}
		System.out.println("D ");
	}
}
