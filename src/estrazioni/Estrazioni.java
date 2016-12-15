/*
 * Estrazioni con controllo versione.
 */
package estrazioni;

/**
 *
 * @author Toffenetti Tiziano
 */
public class Estrazioni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] insiemeNumeri = new int[100];
        Vettore v = new Vettore(insiemeNumeri);
        
        v.carica();
        System.out.println(v);
        System.out.println("Il min e': " + v.getMin());
        System.out.println("Il max e': " + v.getMax());
        System.out.println("Il med e': " + v.getAverage());
        System.out.println("La percentuale di PARI e': " + v.getCountPari());
        System.out.println("La percentuale di DISPARI e': " + v.getCountDispari());
        v.ordinaInsieme();
        System.out.println(v);
    }
}
