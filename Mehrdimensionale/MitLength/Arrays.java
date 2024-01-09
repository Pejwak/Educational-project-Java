package Arrays.Mehrdimensionale.MitLength;

public class Arrays {

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Dies ist der Wert an der Indexposition ("
						+ i + ", " + j + "): " + a[i][j]);
			}
		}
	}

}
