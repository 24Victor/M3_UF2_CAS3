package Raul;

import java.util.Scanner;

public class suprimir {

    private static Scanner sc = new Scanner(System.in);     //  Declaración del Scanner para llegir l'entrada del usuari
    private static int numElem = 10;                        //  Declaracio de la variable entera estatica "numElem" amb un valor de 10          

    public static void main(String[] args) {                //  Metode principal que s'executa quant s'inicia el programa
        /* Titol del programa */
        System.out.println("Suprimir");                     //  Mostra el titol del programa a la consola

/* Aquestes línies defineixen l'array myArray de longitud numElem i utilitzen un bucle for per omplir l'array amb els valors ingressats per l'usuari. A cada iteració del bucle, se sol·licita a l'usuari que introdueixi un element, es llegeix l'entrada de l'usuari i s'emmagatzema a la posició corresponent de l'array */
        String[] myArray = new String[numElem];      //  Declaraco de un Array de mida "numElem = 10"
        for (int i = 0; i < numElem; i++) {         //  Bucle para recorrer cada element de l'Array i demanar al usuari que lo fique
            System.out.println("Ingresa l'element " + (i + 1) + ": ");   //  Demanar al usuario que ingrese l'element
            myArray[i] = sc.next();     //  Llegeix l'entrada del usuari i l'asigna al elemento corresponent de l'Array
        }

        /* Demanem a l'usuari quina posició vol eliminar */
        System.out.println("Ingresa la posició de l'element que vols eliminar: ");   //  Demanem a l'usuari quina posició vol eliminar
        int position = sc.nextInt();      // Llegeix l'entrada del usuari i l'asigna a la variable "position"

        /* Verifiquem que la posició ingresada sigui valida */
        while (position < 1 || position > numElem) {    // Bucle que s'executa mentres la posicio ingresada no sigue valida (es a dir, menor que 1 o major que numElem)
            System.out.println("Error, torna a introduir un numero del 1 al 10.");
            position = sc.nextInt();    // Llegeix l'entrada del usuari novament i l'asigna a la variable "position"
        }
        
        suprimir(myArray, position);        // Crida al metodo "suprimir" i pasa l'Array i la posicio del element a eliminar com arguments
    }

    public static void suprimir(String[] myArray, int position) {       // Metode para eliminar l'element en la posición especificada
        
        /* Desplacem tots els elements detràs de la posició especificada cap a l'esquerra */
        for (int i = position - 1; i < numElem - 1; i++) {      // Bucle para recorrer cada element detras de la posiciO especificada I desplazarlo a l'esquerra
            myArray[i] = myArray[i + 1];        // Asigna el seguent element al element actual
        }

        /* Restem una posició a l'array */
        numElem--;

        /* Imprimim l'array ja actualitzada, mostran tots els elements restants a l'Array amb el nou ordre */
        System.out.println("Elements restants de la llista: ");
        for (int i = 0; i < numElem; i++) {
            System.out.println(myArray[i]);
        }
    }

}
