package Exceptions.RuntimeExceptions.ClassCastException;

public class Tisch extends Moebel {
	
	public static void main(String[] args) {
		Moebel moebel = new Moebel();
		Tisch tisch = new Tisch();
		Stuhl stuhl = new Stuhl();
		tisch = (Tisch)moebel; 
		stuhl = (Stuhl) moebel; 
	}	
}

