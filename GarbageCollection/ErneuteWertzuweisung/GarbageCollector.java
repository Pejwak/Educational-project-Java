package GarbageCollection.ErneuteWertzuweisung;

public class GarbageCollector {
    public static void main(String[] args){
        String s1 = new String("eins");
        String s2 = new String("zwei");
        //Die Objekte s1 und s2 kommen nicht für die GC in Frage
        s1 = null;
        /*Da das Stringobjekt, das "eins" beinhaltet,
         *nicht mehr erreichbar ist, kommt es für die GC in Frage*/
    }
}

