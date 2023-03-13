import java.util.Scanner;

public class localitzar2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myArray[] = new String[10];

        final int numElem = 10;
        
        //Demanem al usuari que introdueixi un nom
        System.out.println("Introdueix 10 cognoms:");
        for(int i = 0; i < 10; i++){
            myArray[i] = sc.nextLine();   
        }
        
        //Demanem quin cognom volem buscar
        System.out.println("Introdueix un cognom a buscar ");
        String buscat = sc.next();
        
        int posicio = localitzarCognom(myArray, buscat, numElem);
        
        if(posicio == -1){
            System.out.println("El cognom " + buscat + " no ha estat trobat.");
        }else{
            System.out.println("El cognom " + buscat + " està en la posició " + posicio);
        }
    }
    
    public static int localitzarCognom(String[] myArray, String cognom, int numElem){
        int posicio = -1;
        for (int i = 0; i < numElem; i++){
            if(cognom.equals(myArray[i])){
                posicio = i;
                break;
            }
        }
        return posicio;
    }
}
