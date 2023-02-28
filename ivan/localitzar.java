//package ivan;
import java.util.Scanner;

public class localitzar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String surnames[] = new String[10];

        final int numElem = 10;
        
        //Demanem al usuari que introdueixi un nom
        System.out.println("Introdueix 10 cognoms:");
        for(int i = 0; i < 10; i++){
             surnames[i] = sc.nextLine();   
        }

/* Funció localitzar */

    //Demanem quin cognom volem buscar
        System.out.println("Introdueix un cognom a buscar ");

        //Li posem buscat al cognom que anem a buscar
        String buscat = "";
        buscat = sc.next();

        //Fem un bucle que fagi tot el recorregut de l'array
        for (int i = 0; i < numElem; i++){
            //Si el cognom buscat coincideix amb algun cognom de l'array 
            if(buscat.equals(surnames[i])){
                //Imprimim el cognom i la posició en la que es troba
                System.out.println("El cognom " + surnames[i] + " està en la posició " + i);
            }
          
        }
    }
}