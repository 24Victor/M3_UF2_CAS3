package Raul;

import java.util.Scanner;

public class inserir {
    private static Scanner sc = new Scanner(System.in);
    private static int numElem = 10;
    private static String[] myArray = new String[numElem];
    private static int p = 0;

    public static void main(String[] args) {
        // Titol del programa
        System.out.println(" INSERIR ");

        // Demanem a l'usuari que introdueixi un número
        System.out.println(" INGRESA LA POSICIO ON VOLS INSERIR L'ELEMENT: ");
        int m = sc.nextInt();

        m = comprovarLimit(m);

        // Demanem a l'usuari que ingresi un element a l'array
        System.out.println(" INGRESA L'ELEMENT QUE VOLS AFEGIR: ");
        String x = sc.next();

        String[] prova;
        prova = inserirElement(m, x);

        System.out.println(" ELEMENTS RESTANTS DE LA LLISTA: ");
            for (int i = 0; i < p; i++) {
                System.out.println(prova[i]);
            }
    }

    public static int comprovarLimit(int m) {
        // Condicional (Si el número es menor a 0 o mayor a 10 demanarem otro cop el número)
        while (m < 0 || m >= numElem) {
            System.out.println("ERROR, TORNA A INTRODUIR UN NUMERO DEL 0 AL " + (numElem - 1));
            m = sc.nextInt();
        }
        return m;
    }

    public static String[] inserirElement(int m, String x) {
        // Condicional (si el número d'elements es == a la llargada de l'array s'imprimeix un missatge)
        if (p == myArray.length) {
            System.out.println(" L'ARRAY ESTÀ PLENA. NO ES POT INSERIR MÉS ELEMENTS. ");
        } else {
            // Desplaça els elements cap a la dreta per a fer espai per a el nou element
            for (int i = numElem - 1; i >= m; i--) {
                myArray[i] = myArray[i - 1];
            }

            // Inserta el nou element a la posició especificada
            myArray[m] = x;
            p++;


            // Imprimim l'array per a fer la comprovació de que tot funciona correctament
            
        }
        return myArray;
    }
}
