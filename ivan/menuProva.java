import java.util.Scanner;

public class menuProva {

    /**
     * Fem una prova del menu
     * @param args
     */
    public static void main(String[] args) {
        /* Test prova menu */
        String[] prova = {"dilluns (L)", "dimarts (M)", "dimecres (X)"};
        char resultat;
        resultat = menu(prova);
        System.out.println("debug resultat " + resultat);
    }


    /**
     * Fem el menu on cridem funcions
     * @param opcions: array
     * @return: retorna resultat de llegirUnChar en la variable op
     */
    public static char menu(String[] opcions) {
        /* Imprimir un menu */
        imprimirArray(opcions);

        /* Guardar opcion que escull el usuari */
        char op = llegirUnChar();

        /* Tornar opció escoillida */
        return op;
    }

    /**
     * Imprimir un array
     * @param a: array a imprimir
     */
    public static void imprimirArray(String[] a){
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        } 
    }


    /**
     *Llegeix una paraula del teclar i retorna el primer caracter de la paraula
     * @return: retornem el primer caracter de llegirUnChar
     */
    public static char llegirUnChar(){
        Scanner teclat = new Scanner(System.in);
        String llegida = teclat.nextLine();
        System.out.println("Debug llegida " + llegida);
        char caracter = llegida.charAt(0);

        return caracter;
    }
}
