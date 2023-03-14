import java.util.Scanner;

public class suprimir {

    private static Scanner sc = new Scanner(System.in);
    private static int numElem = 10;

    public static void main(String[] args) {
        /* Titol del programa */
        System.out.println("Suprimir");

        /* Demanem a l'usuari que introdueixi la llista */
        String[] myArray = new String[numElem];
        for (int i = 0; i < numElem; i++) {
            System.out.println("Ingresa l'element " + (i + 1) + ": ");
            myArray[i] = sc.next();
        }

        /* Demanem a l'usuari quina posició vol eliminar */
        System.out.println("Ingresa la posició de l'element que vols eliminar: ");
        int position = sc.nextInt();

        /* Verifiquem que la posició ingresada sigui valida */
        while (position < 1 || position > numElem) {
            System.out.println("Error, torna a introduir un numero del 1 al 10.");
            position = sc.nextInt();
        }

        /* Suprimir dada */
        suprimir(myArray, position);
    }

    public static void suprimir(String[] myArray, int position) {
        /* Suprimir dada */

        /* Desplacem tots els elements detràs de la posició especificada cap a l'esquerra */
        for (int i = position - 1; i < numElem - 1; i++) {
            myArray[i] = myArray[i + 1];
        }

        /* Restem una posició a l'array */
        numElem--;

        /* Imprimim l'array ja actualitzada */
        System.out.println("Elements restants de la llista: ");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
    }

}
