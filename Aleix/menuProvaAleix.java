import java.util.Scanner;

public class menuProvaAleix {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /* Array a mig omplir */
        String[] myArray = {"dilluns", "dimarts", "","",""};

        int p = 2;

        String prova;
        prova = recuperar(p, myArray );
        System.out.println(prova);


    }

    /**
     * troba l'element x que està a la posició p
    Entrada: posició p, llista
    Sortida: element x

     */
    public static String recuperar ( int p, String[] llista) {
        
        return llista[p];
    }

}
