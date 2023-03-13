import java.util.Scanner;

public class primerDarrer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", "divendres"};

        // Imprimir el array actual
        System.out.println("Array actual:");
        imprimir(myArray);

        // Demanar al usuari que ingrese 1 per a imprimir el primer element o 2 per a imprimir el últim
        System.out.println("Ingresa 1 per a imprimir el primer elemento o 2 para imprimir el últim:");
        int opcio = sc.nextInt();

        // Imprimir el primer o últim element segon la opció ingresada per el usuari
        if (opcio == 1) {
            System.out.println("Primer element: " + myArray[0]);
        } else if (opcio == 2) {
            System.out.println("Últim element: " + myArray[myArray.length - 1]);
        } else {
            System.out.println("Opció inválida.");
        }
    }

    private static void imprimir(String[] myArray) {
        for (String element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
