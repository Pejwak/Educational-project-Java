package Exceptions.Aufgabe19;

import java.io.FileNotFoundException;

public class Fehler {

	
	public static void main(String[] args) {
		FileNotFoundException fehler = new FileNotFoundException();
		boolean a = fehler instanceof Throwable;
		boolean b = fehler instanceof Error;
		System.out.println(a);
		System.out.println(b);}

}
