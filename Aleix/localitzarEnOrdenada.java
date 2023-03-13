import java.util.Scanner;

public class localitzarEnOrdenada {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        /* Array a mig omplir */
        String[] myArray = {"dilluns", "dimarts", "","",""};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el element a buscar: ");
        int element = scanner.nextInt();

        int posicio = -1;

        String prova;
        prova = recuperarElement(posicio, element, myArray );
        System.out.println(prova);

    }

      /*localitza la primera posició p en la que es troba un element x. (Usar l’algorisme de cerca binària)
        Entrada: llista ordenada
        Sortida: posició p*/

    public static String recuperarElement ( int io, String p, String[] llista) {

        for (int i = 0; i < llista.length; i++) {
            if (llista[i] == p) {
                io = i;
                break;
            }
        }

        if (io != -1) {
            System.out.println("El elemento " + p + " se encuentra en la posición " + io);
        } else {
            System.out.println("El elemento " + p + " no se encuentra en el array");
        }
    }
        
}

   /*  public static int llegirElement (String msg){
        System.out.println(msg);
        String enter = sc.nextLine();
        return element;

    }*/


