import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static int numElem = 10;
    private static String surnames[] = new String[numElem];

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 9);

        System.out.println("Saliendo del programa...");
    }

    private static void mostrarMenu() {
        System.out.println("Bienvenido al programa");
        System.out.println("----------------------");
        System.out.println("1. Inserir");
        System.out.println("2. Localitzar");
        System.out.println("3. Recuperar");
        System.out.println("4. Suprimir");
        System.out.println("5. SuprimirDada");
        System.out.println("6. Anul·lar");
        System.out.println("7. PrimerDarrer");
        System.out.println("8. Imprimir");
        System.out.println("9. Sortir");
        System.out.print("Escoge una opción: ");
    }

    private static int leerOpcion() {
        return sc.nextInt();
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                inserir();
                break;
            case 2:
                localitzar();
                break;
            case 3:
                recuperar();
                break;
            case 4:
                suprimir();
                break;
            case 5:
                suprimirDada();
                break;
            case 6:
                anullar();
                break;
            case 7:
                primerDarrer();
                break;
            case 8:
                imprimir();
                break;
            case 9:
                // No hace nada, el bucle se rompe y se sale del programa
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
