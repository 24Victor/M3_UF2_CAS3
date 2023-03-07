package Raul;

import java.util.Scanner;

public class suprimir {

    private static Scanner sc = new Scanner(System.in);
    private static int numElem = 10;    
    private static void suprimir(String[] myArray) {
        /* suprimir: elimina de la llista l'element de la posició p
            Entrada: posició p, llista
            Sortida: llista*/
                
        /* Suprimir dada */
                
        /* Titol del programa */
        System.out.println("Suprimir");
                                
        /* Demanem a l'usuari quina posició vol eliminar */
        System.out.println("Ingresa la posició de l'element que vols eliminar: ");
        int position = sc.nextInt();

        /* Desplacem tots els elements detràs de la posició especificada cap a l'esquerra */
        for (int i = position; i < numElem - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        /* Verifiquem que la posició ingresada sigui valida */
        while(p > position || position > numElem){
            System.out.println("Error, tornar a introduir un numero del 1 al 10.");
            position = sc.nextInt();
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
