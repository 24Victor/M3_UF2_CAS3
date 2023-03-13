import java.util.Scanner;

public class localitzar2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myArray[] = new String[10];

        final int numElem = 10;
        
       //Demanem al usuari que introdueixi 10 cognoms
       System.out.println("Introdueix 10 cognoms:");
       for(int i = 0; i < 10; i++){
           myArray[i] = sc.nextLine();   
       }
       
        // Demanar al usuari que introueixi el cognom
        String cognomBuscat = llegirCognom("Introdueix el cognom que vols consultar");

        // Buscar el cognom i mostrar la posició si és troba
        int posicio = localitzarCognom(myArray, cognomBuscat, numElem);

        if (posicio == -1) {
        System.out.println("El cognom " + cognomBuscat + " no ha estat trobat.");
        } else {
        System.out.println("El cognom " + cognomBuscat + " està en la posició " + posicio);
        }
    }   
   
    public static String llegirCognom(String missatge) {
        Scanner sc = new Scanner(System.in);
        System.out.println(missatge);
        String cognom = sc.nextLine();
        return cognom;
    }
    
    public static int localitzarCognom(String[] myArray, String cognom, int numElem) {
        int posicio = -1;
        for (int i = 0; i < numElem; i++) {
            if (cognom.equals(myArray[i])) {
                posicio = i;
                break;
            }
        }
        return posicio;
    }
}