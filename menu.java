import java.util.Scanner;

public class menu {

    private static Scanner sc = new Scanner(System.in);
    private static int numElem = 10;
    private static String surnames[] = new String[numElem];

    public static void main(String[] args) {
        int opcio;

        do {
            mostrarMenu();
            opcio = leerOpcio();
            ejecutarOpcio(opcio);
        } while (opcio != 9);

        System.out.println("Sortin del programa...");
    }

    private static void mostrarMenu() {
        System.out.println("Benvingut al menu");
        System.out.println("----------------------");
        System.out.println("1. Inserir");
        System.out.println("2. Localitzar");
        System.out.println("3. Recuperar");
        System.out.println("4. Suprimir");
        System.out.println("5. SuprimirDada");
        System.out.println("6. Anul·lar");
        System.out.println("7. PrimerDarrer");
        System.out.println("8. Imprimir");
        System.out.println("9. Ordenar");
        System.out.println("10. localitzarEnOrdenada");
        System.out.println("11. Sortir");
        System.out.print("Eligiu una opció: ");
    }

    private static int leerOpcio() {
        return sc.nextInt();
    }

    private static void ejecutarOpcio(int opcion) {
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
                anul_lar();
                break;
            case 7:
                primerDarrer();
                break;
            case 8:
                imprimir();
                break;
            case 9:
                ordenar();
                break;
            case 10:
                localitzarEnOrdenada();
                break;
            case 11:
                // No fa res, el bucle se trenca i se surt del programa
                break;
            default:
                System.out.println("Opció inválida");
        }
    }

    private static void inserir() {
  
    }

    private static void localitzar() {
  
    }
    private static void recuperar() {
  
    }
    private static void suprimir() {
  
    }
    private static void suprimirDada() {
  
    }
    private static void anul_lar() {
  
    }
    private static void primerDarrer() {
  
    }
    private static void imprimir() {
  
    }
    private static void ordenar() {
  
    }

    private static void localitzarEnOrdenada() {
  
    }
}