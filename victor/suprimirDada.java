import java.util.Scanner;

public class suprimirDada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", "divendres"};

        // Imprimir el array actual
        System.out.println("Array actual:");
        imprimir(myArray);

        // Demanar al usuari que introdueix el element que vol eliminar
        System.out.println("Introdueix l'element que vols eliminar:");
        String element = sc.nextLine();

        // Buscar la posició del element
        int posicio = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(element)) {
                posicio = i;
                break;
            }
        }

        // Si el element se troba en el array eliminarlo
        if (posicio != -1) {
            for (int i = posicio; i < myArray.length - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            myArray[myArray.length - 1] = null;
            myArray = ajustarArray(myArray);
            System.out.println("Element eliminat.");
        } else {
            System.out.println("L'element no es troba en el array.");
        }

        // Imprimir el array actualizat
        System.out.println("Array actualitzat:");
        imprimir(myArray);
    }

    private static void imprimir(String[] myArray) {
        for (String element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static String[] ajustarArray(String[] myArray) {
        int cognoms = 0;
        for (String element : myArray) {
            if (element == null) {
                cognoms++;
            }
        }
        String[] newArray = new String[myArray.length - cognoms];
        int index = 0;
        for (String element : myArray) {
            if (element != null) {
                newArray[index] = element;
                index++;
            }
        }
        return newArray;
    }
}
