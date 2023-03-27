import java.util.Arrays;

public class ordenar {
    public static void main(String[] args) {

        String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", "divendres"};
        ordenar(myArray);
        
        }
    }
        

    
    public static void ordenar(String[] myArray) {
        /*ordenar: Ordena lexicogràficament els elements de la llista.
         Entrada: llista
        Sortida: llista ordenada*/
        Arrays.sort(myArray);
        for (String s : myArray) {
            System.out.println(s);
        }
        
    }
}
