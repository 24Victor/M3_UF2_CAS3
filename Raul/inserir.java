package Raul;

import java.util.Scanner;

public class inserir {
    private static Scanner sc = new Scanner(System.in);
    private static String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", ""};
    private static int p = 0;

    public static void main(String[] args) {

        // Demanem a l'usuari que introdueixi un número
        System.out.println(" INGRESA LA POSICIO ON VOLS INSERIR L'ELEMENT: ");
        int m = sc.nextInt();

        // Demanem a l'usuari que ingresi un element a l'array
        System.out.println(" INGRESA L'ELEMENT QUE VOLS AFEGIR: ");
        String x = sc.next();

        inserirElement(m, x, myArray);

        System.out.println(" ELEMENTS RESTANTS DE LA LLISTA: ");
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
    }

    /**
     * @param m
     * @param x
     * @param myArray2
     * @return
     */
    public static String[] inserirElement(int m, String x, String[] myArray) {
        
            // Desplaça els elements cap a la dreta per a fer espai per a el nou element
            for (int i = m ; i > m-1 ;i--) {
                myArray[i] = myArray[i - 1];
            }

            // Inserta el nou element a la posició especificada
            myArray[m] = x;
            p++;

            return myArray;
        }
        
    }
