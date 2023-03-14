import java.util.Scanner;

public class inserir {
    private static Scanner sc = new Scanner(System.in);
    private static String[] myArray = {"dilluns", "dimarts", "dimecres", "dijous", ""};

    public static void main(String[] args) {
        int posicio = llegirPosicio();
        String element = llegirElement();
        inserirElement(posicio, element, myArray);
        imprimirArray(myArray);
    }

    public static int llegirPosicio() {
        System.out.println("INGRESA LA POSICIO ON VOLS INSERIR L'ELEMENT:");
        return sc.nextInt();
    }

    public static String llegirElement() {
        System.out.println("INGRESA L'ELEMENT QUE VOLS AFEGIR:");
        return sc.next();
    }

    public static void inserirElement(int posicio, String element, String[] array) {
        desplacarDreta(posicio, array);
        inserirElementEnPosicio(posicio, element, array);
    }

    public static void desplacarDreta(int posicio, String[] array) {
        for (int i = array.length - 2; i >= posicio; i--) {
            array[i + 1] = array[i];
        }
    }

    public static void inserirElementEnPosicio(int posicio, String element, String[] array) {
        array[posicio] = element;
    }

    public static void imprimirArray(String[] array) {
        System.out.println("ELEMENTS RESTANTS DE LA LLISTA:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
