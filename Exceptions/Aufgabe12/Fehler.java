package Exceptions.Aufgabe12;

import java.io.FileNotFoundException;

public class Fehler {
	
	public static void main(String[] args) throws 
	FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException dokumentfehler) {
			System.out.println("fangen");
		} catch (ClassCastException fehler) {
			System.out.println("nochmals fangen");
		} finally {
			System.out.println("Restarbeit");
		}
		System.out.println("Ende");
	}

}
