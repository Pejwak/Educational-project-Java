package Assertions.Aufgabe24;

public class SwitchStruktur {

	public static void main(String[] args) {
		for (int j = 1; j < 5; j++) {
			switch (j) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			default:
				assert false;
			}
		}
	}

}
