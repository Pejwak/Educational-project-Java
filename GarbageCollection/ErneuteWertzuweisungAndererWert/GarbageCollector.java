package GarbageCollection.ErneuteWertzuweisungAndererWert;

public class GarbageCollector {
    public static void main(String[] args){
        String s1 = new String("eins");
        String s2 = new String("zwei");
        s1 = new String("drei");
        /*Da das Stringobjekt, das "zwei" beinhaltet,
         *nicht mehr erreichbar ist, kommt es f�r die GC in Frage*/
    }
}

