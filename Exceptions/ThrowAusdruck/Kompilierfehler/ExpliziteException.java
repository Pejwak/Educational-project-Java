package Exceptions.ThrowAusdruck.Kompilierfehler;

public class ExpliziteException {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
			try{
				throw new Exception();
			}catch{System.out.println("1");};
			
		} catch (ArithmeticException rechenfehler) {
			System.out.println("Ich bin ein expliziter Rechenfehler!");
		}
	}

}
