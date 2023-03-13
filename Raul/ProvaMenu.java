package Raul;

import java.util.Scanner;

public class ProvaMenu {
    public static void main(String[] args) {
        /* test prova menu */

        String[] prova = {"dilluns (L)", "dimarts (M)", "dimecres (X)"};
        imprimirArray(prova);
    }

    public static void imprimirArray(String[] a) {
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /*
    public static char menu(String[] opcions) {
        // imprimir un menu
        imprimirArray(opcions);

        // guardar opcio que escull usuari
        Scanner teclat = new Scanner(System.in);
        char op = teclat.next().charAt(0);

        // tornar opció escollida
        return op;
    }
    */

    /*
    // Llegeix una paraula del teclat i retorna el primer caracter de la paraula
    public static char llegirUnChar() {
        Scanner teclat = new Scanner(System.in);
        String llegida = teclat.next();
        System.out.println("Debug, paraula llegida " + llegida);
        char caracter = llegida.charAt(0);
        return caracter;
    }
    */
}
