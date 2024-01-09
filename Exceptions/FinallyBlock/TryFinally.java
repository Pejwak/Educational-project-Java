package Exceptions.FinallyBlock;

public class TryFinally {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			throw new RuntimeException();
		} finally {
			System.out.println("finally");
		}
	}
}
