import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenar {
    public static void main(String[] args) {
        //Creem un string amb una llista
        String[] llista = {"a", "b", "c", "d"};



        //Ordena lexicogràficament els elements de la llista.
        Collections.sort(llista);

        //Imprimim la llista
        System.out.println("Llista ordenada: " + llista);
    }
}
