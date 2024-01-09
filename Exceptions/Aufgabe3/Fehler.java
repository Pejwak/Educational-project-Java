package Exceptions.Aufgabe3;

public class Fehler {

public static void main(String[ ] args) {
		try{
			throw new ArithmeticException();
		}
		catch (ArithmeticException rechenfehler){
			System.out.println("Rechenfehler ");
		}
		finally{
			System.out.println("finally");
		}
		catch (Exception fehler){
			System.out.println("Fehler");
		}
			System.out.println("Ende");
		}
}
