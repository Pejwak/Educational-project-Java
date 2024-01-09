package InnereKlassen.StatischeUndNichtStatischeInnereKlassen.Aufgabe4;



	public class AKlasse {
		public static class BKlasse{
		}
		public static void main(String args[ ]){
			BKlasse b = new BKlasse();
			AKlasse.BKlasse c = new AKlasse.BKlasse(); 
		}
	

}
