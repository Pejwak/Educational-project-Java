package Exceptions.Aufgabe4;

public class Fehler {

	public static void main(String[ ] args) {
		try{
			throw new ClassCastException();
		}
		catch (ArithmeticException rechenfehler){
			System.out.println("Rechenfehler ");
		}
		catch (InterruptedException fehler){
			System.out.println("Fehler");
		}
		finally{
			System.out.println("finally");
		}
			System.out.println("Ende");
		}

}
