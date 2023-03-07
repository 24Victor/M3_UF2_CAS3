import java.util.Scanner;

public class menuProvaAleix {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Test prova menu */
        /* Array Ple */
        //String[] myArray = {"dilluns", "dimarts", "dimecres","dijous","divendres"};
        //int numElem = 5;


        /* Array Buit */
        //String[] myArray = {"", "", "","",""};
        //int numElem = 0;


        /* Array a mig omplir */
        String[] myArray = {"dilluns", "dimarts", "","",""};

        /*Scanner sc1 = new Scanner(System.in);
        System.out.print("escollir Llista:");
        String llista = sc.nextLine(); */
        int posicio;
        posicio = llegirEnter ("Introdueix la posició que vols consultar");

        String prova;
        prova = recuperar(posicio, myArray );
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

    /*Demanar enter al usuari i el torna */
    public static int llegirEnter (String msg){
        System.out.println(msg);
        int enter = sc.nextInt();
        return enter;

    }

}
