package Exceptions.Aufgabe16;

import java.io.FileNotFoundException;

public class Fehler {

	public static void main(String[ ] args) {
		try{
		Fehler fehler = new Fehler ();
		fehler.ausnahme();
		}catch(FileNotFoundException fehler){
		System.out.println("Ich fange!");
		}
		}
		public void ausnahme(){
			throw new FileNotFoundException();
		}

}
