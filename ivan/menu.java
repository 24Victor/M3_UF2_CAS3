package ivan;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        /* Test prova menu */
        String[] prova = {"dilluns (L)", "dimarts (M)", "dimecres (X)"};
        char resultat;
        resultat = menu(prova);
        System.out.println("debug resultat" + resultat);
    }



    public static char menu(String[] opcions) {
    /* Imprimir un menu */
    imprimirArray(opcions);

    /* Guardar opcion que escull el usuari */
    // char op = llegirUnChar();

    /* Tornar opció escoillida */
    return 'x';

    }



    public static void imprimirArray(String[] a){
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }



}

// Scanner sc = new Scanner(System.in);