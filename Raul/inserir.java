package Raul;

import java.util.Scanner;

public class inserir {
    private static Scanner sc = new Scanner(System.in);     // declara una variable estàtica de tipus Scanner, que es farà servir per llegir l'entrada de l'usuari
    private static String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", ""};     //declara una variable estàtica de tipus String[] (array de cadenes) anomenada "myArray"

    public static void main(String[] args) {        // declara un mètode principal (main), que s'executa quan s'executa el programa
        int posicio = llegirPosicio();      // crida al mètode "llegirPosicio()" per llegir la posició on es vol inserir l'element i emmagatzema el resultat en una variable anomenada "posicio"
        String element = llegirElement();       // crida al mètode "llegirElement()" per llegir l'element que es vol inserir i emmagatzema el resultat en una variable anomenada "element"
        inserirElement(posicio, element, myArray);      // crida al mètode "inserirElement()" per inserir l'element a la posició especificada
        imprimirArray(myArray);     // crida al mètode "imprimirArray()" per imprimir els elements de l'array després de la inserció
    }

    public static int llegirPosicio() {     // declara un mètode anomenat "llegirPosicio()", que s'utilitza per llegir la posició on es vol inserir l'element
        System.out.println("INGRESA LA POSICIO ON VOLS INSERIR L'ELEMENT:");
        return sc.nextInt();        // utilitza la variable Scanner prèviament definida per llegir l'entrada de l'usuari com un enter i torna aquest sencer
    }

    public static String llegirElement() {      // declara un mètode anomenat "llegirElement()", que s'utilitza per llegir l'element que voleu inserir
        System.out.println("INGRESA L'ELEMENT QUE VOLS AFEGIR:");
        return sc.next();       //
    }

    public static void inserirElement(int posicio, String element, String[] array) { // declara un mètode anomenat "inserirElement()", que s'utilitza per inserir l'element a la posició especificada
        desplacarDreta(posicio, array);     // crida al mètode "desplacarDreta()" per desplaçar els elements de l'array a la dreta, per fer espai per al nou element
        inserirElementEnPosicio(posicio, element, array);       //  crida al mètode "inserirElementEnPosicio()" per inserir el nou element a la posició especificada
    }

    public static void desplacarDreta(int posicio, String[] array) {        // declara un mètode anomenat "desplacarDreta()", que s'utilitza per desplaçar els elements de l'array a la dreta, per fer espai per al nou element
        for (int i = array.length - 2; i >= posicio; i--) {     //utilitza un bucle for per desplaçar els elements de l'array a la dreta, començant des del final de l'array i movent-se cap a la posició especificada. A cada iteració del bucle, l'element actual es mou a la dreta una posició
            array[i + 1] = array[i];        //  ''
        }
    }

    public static void inserirElementEnPosicio(int posicio, String element, String[] array) {       //  declara un mètode anomenat "inserirElementEnPosicio()", que s'utilitza per inserir el nou element a la posició especificada
        array[posicio] = element;       // establece el valor del elemento en la posición especificada en el nuevo elemento
    }

    public static void imprimirArray(String[] array) {      // declara un mètode anomenat "imprimirArray()", que s'utilitza per imprimir els elements de l'array després de la inserció
        System.out.println("ELEMENTS RESTANTS DE LA LLISTA:");
        for (int i = 0; i < array.length; i++) {        // utilitza un bucle for per imprimir cada element de l'array en una línia separada
            System.out.println(array[i]);
        }
    }
}
