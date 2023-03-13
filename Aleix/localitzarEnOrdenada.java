import java.util.Scanner;

public class localitzarEnOrdenada {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        /* Array a mig omplir */
        String[] myArray = {"dilluns", "dimarts", "","",""};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el element a buscar: ");
        String element = scanner.next();

        

        int p;
        p = recuperarElement(element, myArray );
        System.out.println("El elemento se encuentra en la posición" + " " + p);

    }

      /*localitza la primera posició p en la que es troba un element x. (Usar l’algorisme de cerca binària)
        Entrada: llista ordenada
        Sortida: posició p*/

    public static int recuperarElement (String ele, String[] llista) {

        int p = -1 ;

        for (int i = 0; i < llista.length; i++) {
            if (llista[i] == ele) {
                p = i;
                break;
            }
        }
        return p;       
    }
}


/*if (p != -1) {
            
} else {
    System.out.println("El elemento " + p + " no se encuentra en el array");
}*/
