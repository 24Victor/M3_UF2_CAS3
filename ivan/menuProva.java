import java.util.Scanner;

public class menuProva {

    public static void main(String[] args) {
        /* Test prova menu */
        String[] prova = {"dilluns (L)", "dimarts (M)", "dimecres (X)"};
        char resultat;
        resultat = menu(prova);
        System.out.println("debug resultat " + resultat);
    }



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


    /** Llegeix una paraula del teclar i retorna el primer caracter de la paraula */
    public static char llegirUnChar(){
        Scanner teclat = new Scanner(System.in);
        String llegida = teclat.nextLine();
        System.out.println("Debug llegida " + llegida);
        char caracter = llegida.charAt(0);

        return caracter;
    }



}